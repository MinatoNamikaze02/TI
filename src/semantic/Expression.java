package semantic;


import java.util.Stack;

import ast.*;
import tds.Table;

public class Expression {

    public static boolean checktypeOp(Ast tree,Stack<Table> pile,Table tds){
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Mul")){
            if(checktypesansPrint(((Mul)tree).left,"int",pile,tds) && checktypesansPrint(((Mul)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Div")){
            if(checktypesansPrint(((Div)tree).left,"int",pile,tds) && checktypesansPrint(((Div)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Plus")){
            if(checktypesansPrint(((Plus)tree).left,"int",pile,tds) && checktypesansPrint(((Plus)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Minus")){
            if(checktypesansPrint(((Minus)tree).left,"int",pile,tds) && checktypesansPrint(((Minus)tree).right,"int",pile,tds)){
                return true;
            }
        }
        System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression : (expected: int)\u001B[0m\n");
        return false;
    }

    public static boolean checktype(Ast tree, String typeAttendu,Stack<Table> pile,Table tds) {
        if (tree == null) {
            return false;
        }
        String name =tree.getClass().getName().replace('\n', '\0');
        if((name.equals("ast.Egal2") || name.equals("ast.Dif") || name.equals("ast.Expr1") || name.equals("ast.Expr0")) && typeAttendu.equals("bool")){
            return checktypeEgal(tree,pile,tds);
        }else if(name.equals("ast.Mul") || name.equals("ast.Div") || name.equals("ast.Plus") || name.equals("ast.Minus")){
            return checktypeOp(tree,pile,tds);
        }else if(name.equals("ast.In") && typeAttendu.equals("int")){
            return true;
        }else if(name.equals("ast.Strin") && typeAttendu.equals("string")){
            return true;
        }else if((name.equals("ast.Sup") || name.equals("ast.Inf") || name.equals("ast.Supeg") || name.equals("ast.Infeg")) && typeAttendu.equals("bool")){
            return checkTypeSupInf(tree,pile,tds);
        }else if(name.equals("ast.Not") && typeAttendu.equals("bool")){
            return checktype((Ast)((Exprnegation)tree).expr,"bool",pile,tds);
        }else if(name.equals("ast.Idcall2")){
            if(!Declaration.checkVardeclared(((Idcall2)tree).id,pile,tds,tree)){
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Declaration Exception : Undeclared variable: " + ((Idcall2)tree).id + "\u001B[0m");
                return false;
            }else{
                Table tdsactuel = new Table(tds.getId());
                tdsactuel=tdsactuel.joinTDS(pile);
                if(typeAttendu.equals(tdsactuel.getVar(((Idcall2)tree).id).getType())){
                    return true;
                }
                else{
                    System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Type of variable " + ((Idcall2)tree).id + " incorrect in the expression: (expected: " + typeAttendu + ")\u001B[0m");
                }
            }
        }else if(name.equals("ast.Croexpr") && typeAttendu.equals("int")){
            return checktype(((Brack)tree).expr,"int",pile,tds);
        }else if(name.equals("ast.AccessVar")){
            Table tdsactuel = new Table(tds.getId());
            tdsactuel=tdsactuel.joinTDS(pile);
            String type = tdsactuel.getVarType(((AccessVar)tree).id).getType();
            if(tdsactuel.getVarType(type)!=null){
                if (Declaration.checkVardeclared(type,pile,tds,tree)){
                    type = tdsactuel.getType(type).getElementtype().get(0).replace(',',' ').trim();
                }
            }
            if (type.equals(typeAttendu)){
                return true;
            }
            else{
                return false;
            }
        }
        else if(name.equals("ast.IfThen")){
            if(checktype(((IfThen)tree).left,typeAttendu,pile,tds)){
                return true;
            }
            if(((IfThen)tree).right!=null){
                if(checktype(((IfThen)tree).right,typeAttendu,pile,tds)){
                    return true;
                }
            }
        }else if(name.equals("ast.Typeswithfieldlist")){
            if(Declaration.checkVardeclared(((Typeidid)((Typeswithfieldlist)tree).typeid).id,pile,tds,tree)){
                if(typeAttendu.equals(tds.getVarType(((Typeidid)((Typeswithfieldlist)tree).typeid).id).getIdentifiant()) && checktypefield((Fieldlist)((Typeswithfieldlist)tree).fieldlist, tds.getVarType(((Typeidid)((Typeswithfieldlist)tree).typeid).id).getIdentifiant(), pile, tds)){
                    return true;
                }
            }
        }
        else if(name.equals("ast.Pointid")){
            String id=((Pointid)tree).id;
            String type = (((Pointid)tree).fils);
            Table tdsactuel = new Table(tds.getId());
            tdsactuel=tdsactuel.joinTDS(pile);
            if(Declaration.checkVardeclared(type,pile,tds,tree)){
                if(replaceType(tds.getVarType(id).getType(),tdsactuel,type).equals(typeAttendu)){
                    return true;
                }
            }

        }
        else{
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: " + typeAttendu + ")\u001B[0m\n");
            return false;
        }
        return false;
    }



    private static boolean checkTypeSupInf(Ast tree,Stack<Table> pile,Table tds){
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Sup")){
            if(checktypesansPrint(((GreaterThan)tree).left,"int",pile,tds) && checktypesansPrint(((GreaterThan)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Inf")){
            if(checktypesansPrint(((LessThan)tree).left,"int",pile,tds) && checktypesansPrint(((LessThan)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Supeg")){
            if(checktypesansPrint(((GreaterThanEq)tree).left,"int",pile,tds) && checktypesansPrint(((GreaterThanEq)tree).right,"int",pile,tds)){
                return true;
            }
        }else if(name.equals("ast.Infeg")){
            if(checktypesansPrint(((LessThanOrEq)tree).left,"int",pile,tds) && checktypesansPrint(((LessThanOrEq)tree).right,"int",pile,tds)){
                return true;
            }
        }
        System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: int)" + "\u001B[0m");
        return false;
    }

    public static boolean checktypesansPrint(Ast tree, String typeAttendu,Stack<Table> pile,Table tds) {
        if (tree == null) {
            return false;
        }
        String name =tree.getClass().getName().replace('\n', '\0');
        if((name.equals("ast.Egal2") || name.equals("ast.Dif") || name.equals("ast.Expr1") || name.equals("ast.Expr0")) && typeAttendu.equals("bool")){
            return checktypeEgal(tree,pile,tds);
        }else if(name.equals("ast.Mul") || name.equals("ast.Div") || name.equals("ast.Plus") || name.equals("ast.Minus") ){
            if (typeAttendu.equals("int")){
                return checktypeOp(tree,pile,tds);
            }
            else if (typeAttendu.equals("string") || typeAttendu.equals("bool")){
                return false;
            }
        }else if(name.equals("ast.In") && typeAttendu.equals("int")){
            return true;
        }else if(name.equals("ast.Strin") && typeAttendu.equals("string")){
            return true;
        }else if((name.equals("ast.Sup") || name.equals("ast.Inf") || name.equals("ast.Supeg") || name.equals("ast.Infeg")) && typeAttendu.equals("bool")){
            return checkTypeSupInf(tree,pile,tds);
        }else if(name.equals("ast.Not") && typeAttendu.equals("bool")){
            return checktypesansPrint((Ast)((Exprnegation)tree).expr,"bool",pile,tds);
        }else if(name.equals("ast.Idcall2")){
            if(!Declaration.checkVardeclared(((Idcall2)tree).id,pile,tds,tree)){
                return false;
            }else{
                Table tdsactuel = new Table(tds.getId());
                tdsactuel=tdsactuel.joinTDS(pile);
                if(typeAttendu.equals(tdsactuel.getVar(((Idcall2)tree).id).getType())){
                    return true;
                }
            }
        }else if(name.equals("ast.Croexpr") && typeAttendu.equals("int")){
            return checktypesansPrint(((Brack)tree).expr,"int",pile,tds);
        }else if(name.equals("ast.AccessVar")){
            Table tdsactuel = new Table(tds.getId());
            tdsactuel=tdsactuel.joinTDS(pile);
            String type = tdsactuel.getVarType(((AccessVar)tree).id).getType();
            if(tdsactuel.getVarType(type)!=null){
                if (Declaration.checkVardeclared(type,pile,tds,tree)){
                    type = tdsactuel.getType(type).getElementtype().get(0).replace(',',' ').trim();
                }
            }
            if (type.equals(typeAttendu)){
                return true;
            }
            else{
                return false;
            }
        }
        else if(name.equals("ast.IfThen")){
            if(checktypesansPrint(((IfThen)tree).left,typeAttendu,pile,tds)){
                return true;
            }
            if(((IfThen)tree).right!=null){
                if(checktypesansPrint(((IfThen)tree).right,typeAttendu,pile,tds)){
                    return true;
                }
            }
        }else if(name.equals("ast.Typeswithfieldlist")){
            if(Declaration.checkVardeclared(((Typeidid)((Typeswithfieldlist)tree).typeid).id,pile,tds,tree)){
                if(typeAttendu.equals(tds.getVarType(((Typeidid)((Typeswithfieldlist)tree).typeid).id).getIdentifiant()) && checktypefield((Fieldlist)((Typeswithfieldlist)tree).fieldlist, tds.getVarType(((Typeidid)((Typeswithfieldlist)tree).typeid).id).getIdentifiant(), pile, tds)){
                    return true;
                }
            }
        }
        else if(name.equals("ast.Pointid")){
            String id=((Pointid)tree).id;
            String type = (((Pointid)tree).fils);
            Table tdsactuel = new Table(tds.getId());
            tdsactuel=tdsactuel.joinTDS(pile);
            if(Declaration.checkVardeclared(type,pile,tds,tree)){
                if(replaceType(tds.getVarType(id).getType(),tdsactuel,type).equals(typeAttendu)){
                    return true;
                }
            }

        }
        else{
            return false;
        }
        return false;
    }


    public static boolean checktypeEgal(Ast tree,Stack<Table> pile,Table tds){
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Egal2")){
            if(checktypesansPrint(((Equal2)tree).left,"int",pile,tds) && checktypesansPrint(((Equal2)tree).right,"int",pile,tds)){
                return true;
            }
            else if(checktypesansPrint(((Equal2)tree).left,"string",pile,tds) && checktypesansPrint(((Equal2)tree).right,"string",pile,tds)){
                return true;
            }
            else if(checktypesansPrint(((Equal2)tree).left,"bool",pile,tds) && checktypesansPrint(((Equal2)tree).right,"bool",pile,tds)){
                return true;
            }
            else{
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: int or string on both sides)\u001B[0m\n");
                return false;
            }
        }else if(name.equals("ast.Dif")){
            if(checktypesansPrint(((Dif)tree).left,"int",pile,tds) && checktypesansPrint(((Dif)tree).right,"int",pile,tds)){
                return true;
            }
            else if(checktypesansPrint(((Dif)tree).left,"string",pile,tds) && checktypesansPrint(((Dif)tree).right,"string",pile,tds)){
                return true;
            }
            else if(checktypesansPrint(((Dif)tree).left,"bool",pile,tds) && checktypesansPrint(((Dif)tree).right,"bool",pile,tds)){
                return true;
            }
            else{
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: int or string on both sides)\u001B[0m\n");
                return false;
            }
        }else if(name.equals("ast.Expr1")){
            if(checktypesansPrint(((Expr1)tree).left,"bool",pile,tds) && checktypesansPrint(((Expr1)tree).right,"bool",pile,tds)){
                return true;
            }
            else{
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: bool)\u001B[0m\n");
                return false;
            }
        }else if(name.equals("ast.Expr0")){
            if(checktypesansPrint(((Expr0)tree).left,"bool",pile,tds) && checktypesansPrint(((Expr0)tree).right,"bool",pile,tds)){
                return true;
            }
            else{
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: bool)\u001B[0m\n");
                return false;
            }
        }
        else{
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: int or string on both sides)\u001B[0m\n");
            return false;
        }
    }

    public static boolean checktypeDptEgal(Ast tree, Table tds, Stack<Table> pile){
        String leftType = getType(((Assign)tree).left, tds, pile);
        String rightType = getType(((Assign)tree).right, tds, pile);
        if(leftType.equals(rightType)){
            return true;
        }
        else{
            if (!rightType.equals("") && !leftType.equals("")){
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the expression (expected: " + leftType + " in the right-hand side of the expression)\u001B[0m\n");
            }
            return false;
        }
    }


    public static String getType(Ast tree, Table tds, Stack<Table> pile){
        String name =tree.getClass().getName().replace('\n', '\0');
        Table tdsActuelle = new Table(tds.getId());
        tdsActuelle =tdsActuelle.joinTDS(pile);
        if(name=="ast.Pointid"){
            String leftType;
            String fils = ((Pointid)tree).fils;
            if (((Pointid)tree).id == null){
                Ast left = ((Pointid)tree).left;
                leftType = getType(left, tds, pile);
            }
            else{
                String id = ((Pointid)tree).id;
                if (Declaration.checkVardeclared(id, pile, tds,tree)){
                    leftType = tdsActuelle.getVarType(id).getType();
                }
                else{
                    return "";
                }
            }
            if (Declaration.checkVardeclared(leftType+"."+fils, pile, tds,tree)){
                return tdsActuelle.getVarType(leftType+"."+fils).getType();
            }
            else{
                return "";
            }

        }
        else if(name=="ast.Idcall2"){
            if (Declaration.checkVardeclared(((Idcall2)tree).id, pile, tds,tree)){
                return tdsActuelle.getVar(((Idcall2)tree).id).getType();
            }

        }
        else if(name=="ast.AccessVar"){
            if(Declaration.checkVardeclared(((AccessVar)tree).id, pile, tds,tree)){
                String type = tdsActuelle.getVarType(((AccessVar)tree).id).getType();
                if(tdsActuelle.getVarType(type)!=null){
                    type = tdsActuelle.getVarType(type).getElementtype().get(0).replace(',',' ').trim();
                }
                return type;
            }
            else{
                return "";
            }
        }
        else if(name=="ast.In"){
            return "int";
        }
        else if(name=="ast.Strin"){
            return "string";
        }
        else if(name=="ast.Exprseq"){
            Ast exp = ((Exprseq)tree).expr.get(0);
            String type = "";
            if(exp.getClass().getName().replace('\n', '\0')== "ast.Typeswithfieldlist"){
                type = ((Typeidid)((Typeswithfieldlist)((Exprseq)tree).expr.get(0)).typeid).id;
            }else if(exp.getClass().getName().replace('\n', '\0')== "ast.Typeswithof"){
                type = ((Typeidid)((Typeswithof)((Exprseq)tree).expr.get(0)).typeid).id;
            }
            return type;
        }
        else if (name.equals("ast.Mul") || name.equals("ast.Div") || name.equals("ast.Plus") || name.equals("ast.Minus"))
            return "int";
        else if (name.equals("ast.Egal2") || name.equals("ast.Dif") || name.equals("ast.Inf") || name.equals("ast.Sup") || name.equals("ast.Infegal") || name.equals("ast.Supegal"))
            return "bool";
        return "";
    }



    public static boolean checktypefield(Fieldlist tree,String nametype,Stack<Table> pile,Table tds) {
        String name =tree.getClass().getName().replace('\n', '\0');
        Table tableactuel = new Table(tds.getId());
        tableactuel = tableactuel.joinTDS(pile);
        int j=0;
        for (int i = 0; i < tree.field.size(); i++) {
            Field field =(Field) tree.field.get(i);
            if(name.equals("ast.Fieldlist")){
                if (Declaration.checkVardeclared(nametype+"."+field.id, pile, tds,tree)) {
                    tableactuel.getVarType(nametype+"."+field.id).setUsed(true);
                    if(checktype(field.expr,tableactuel.getVarType(nametype+"."+field.id).getType(),pile,tds)){
                        j++;
                    }
                    else{
                        System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the Field expression (expected: " + tableactuel.getVarType(nametype + "." + field.id).getType() + ")\u001B[0m\n");
                        return false;
                    }
                }
            }
            else{
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Expression Exception : Incorrect type in the Field expression (expected: " + tableactuel.getVarType(nametype + "." + field.id).getType() + ")\u001B[0m\n");
                return false;
            }
        }
        if(j==tree.field.size()){
            return true;
        }
        return false;

    }

    public static String replaceType(String type,Table tableactuel, String name){
        if(type.equals("int") || type.equals("string")){
            return type;
        }
        else{
            String text = tableactuel.getVarType(type).getType();
            if(text.equals("Array of")){
                return tableactuel.getVarType(type).getElementtype().get(0).replace(',',' ').trim();
            }
            else if(text.equals("TypeList")){
                return tableactuel.getVarType(name).getType();
            }
            else{
                return text;
            }

        }

    }

}
    
    