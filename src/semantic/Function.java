package semantic;

import java.util.ArrayList;
import java.util.Stack;

import ast.AccessVar;
import ast.Appelfunc;
import ast.Exprlist;
import tds.Table;
import tds.VarType;

public class Function {

    public static void checknombreparametres(Appelfunc tree,Stack<Table> pile, Table tds) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        int nbrparametre = tdsactuel.getProcFonc(tree.id).getArguments().size();
        if (tree.right == null){
            if(nbrparametre != 0){
                System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Function Exception: Incorrect number of parameters (expected: " + nbrparametre + " found: 0)\u001B[0m\n");
            }
            else {
                return;
            }
        }
        int nbrparametre2 = 0;
        for(int i=0;i<((Exprlist)tree.right).expr.size();i++){
            nbrparametre2++;
        }
        if(nbrparametre-nbrparametre2 != 0){
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Function Exception: Incorrect number of parameters (expected: " + nbrparametre + " found: " + nbrparametre2 + ")\u001B[0m\n");
        }


    }

    public static void checktypeparametres(Appelfunc tree,Stack<Table> pile, Table tds) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        ArrayList<VarType> listarg = tdsactuel.getProcFonc(tree.id).getArguments();
        if (tree.right == null) {
            return;
        }
        int nbrparametre = listarg.size();
        for(int i=0;i<nbrparametre;i++){
            if(!Expression.checktypesansPrint(((Exprlist)tree.right).expr.get(i),(listarg.get(i).getType()),pile,tds)){
                if(i==0){
                    System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Function Exception: Type of the " + (i + 1) + "st parameter incorrect (expected: " + listarg.get(i).getType() + ")\u001B[0m\n");
                }else{
                    System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Function Exception: Type of the " + (i + 1) + "th parameter incorrect (expected: " + listarg.get(i).getType() + ")\u001B[0m\n");
                }
            }
        }
    }

    public static void checkdeclaration(Appelfunc tree,Stack<Table> pile, Table tds){
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        if (tree.right == null){
            return;
        }
        int nbrparametre = ((Exprlist)tree.right).expr.size();
        for(int i=0;i<nbrparametre;i++){
            if(((Exprlist)tree.right).expr.get(i) instanceof Appelfunc){
                Function.checkdeclaration((Appelfunc)((Exprlist)tree.right).expr.get(i),pile,tds);

            }
            else if(((Exprlist)tree.right).expr.get(i) instanceof AccessVar){
                Declaration.checkVardeclared(((AccessVar)((Exprlist)tree.right).expr.get(i)).id,pile,tds,tree);
            }
        }
    }
}