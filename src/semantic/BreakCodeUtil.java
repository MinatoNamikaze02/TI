package semantic;
import java.util.ArrayList;

import ast.*;
import ast.Exprseq;
import ast.IfThen;
import tds.ProcFunc;
import tds.Table;

public class BreakCodeUtil {
    public static void checkBreak(Ast tree,String info){
        String name = tree.getClass().getName().replace('\n', '\0');
        //System.out.println(name);
        if(name.equals("ast.Break")){
            System.err.println("\033[0;33m"+"Line "+tree.getLine()+":"+tree.getColumn()+" : "+info+"Useless Code Warning with break: the loop does not execute the code \u001B[0m\n");
        }
        if(name.equals("ast.Exprseq")){
            ArrayList<Ast> seqExpr = ((Exprseq)tree).expr;
            boolean isBreak=false;
            for(int i=0; i< seqExpr.size();i++){
                if(isBreak==true){
                    String nameExpr=((seqExpr.get(i)).getClass().getName().replace('\n', '\0'));
                    System.err.println("\u001B[33m"+"Line "+tree.getLine()+":"+tree.getColumn()+" : "+info+"Useless Code Warning with break: the expression "+nameExpr+" is never reached \u001B[0m\n");
                }
                if(((seqExpr.get(i)).getClass().getName().replace('\n', '\0')).equals("ast.Break")){
                    isBreak=true;
                }
            }
        }
    }

    public static void checkBreakIf(Ast tree, String info){
        //System.out.println(name);
        checkBreak(((IfThen)tree).center, info);
        if(((IfThen)tree).right!=null){
            checkBreak(((IfThen)tree).right, info);
        }

    }

    public static void checkBreakLet(Ast tree, String info){
        ArrayList<Ast> seqExpr =( (Exprseq)((Let)tree).right).expr;
        boolean isBreak=false;
        for(int i=0; i< seqExpr.size();i++){
            if(isBreak==true){
                String nameExpr=((seqExpr.get(i)).getClass().getName().replace('\n', '\0'));
                System.err.println("\u001B[31m" + "Line "+tree.getLine()+":"+tree.getColumn()+" : "+info+"Useless Code Warning with break: the expression "+nameExpr+" is never reached \u001B[0m\n");
            }
            if(((seqExpr.get(i)).getClass().getName().replace('\n', '\0')).equals("ast.Break")){
                isBreak=true;
            }
        }
    }

    public static void checkBreakDo(Ast tree, String info){
        String name = tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.IfThen")){
            checkBreakIf(tree, info);
        }
        else if(name.equals("ast.Let")){
            checkBreakLet(tree, info);
        }
        else{
            checkBreak(tree, info);
        }
    }

    public static void checkBreakWellPlaced(Table tdsActuelle,String nomtds,Ast tree){
        ArrayList<ProcFunc> listeProcFonc = tdsActuelle.functions;
        boolean wellplaced = false;
        for(ProcFunc fonc : listeProcFonc){
            if((fonc.getIdentifier()).contains("While block") || (fonc.getIdentifier()).contains("Boucle for")){
                wellplaced=true;
            }
        }
        if(!wellplaced){
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Break Error : break statement is misplaced\u001B[0m\n");

        }
    }
}