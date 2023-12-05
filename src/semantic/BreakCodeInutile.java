package semantic;
import java.util.ArrayList;

import ast.*;
import ast.Exprseq;
import ast.IfThen;
import tds.ProcFonc;
import tds.Table;

public class BreakCodeInutile {
    public static void checkBreak(Ast tree,String info){
       String name = tree.getClass().getName().replace('\n', '\0');
       //System.out.println(name);
       if(name.equals("ast.Break")){
        System.err.println("\033[0;33m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+info+"CodeInutileWarning avec break: la boucle n'exécute pas le code \u001B[0m\n");
        
       }
       if(name.equals("ast.Exprseq")){
            ArrayList<Ast> seqExpr = ((Exprseq)tree).expr;
            boolean isBreak=false;
            for(int i=0; i< seqExpr.size();i++){
                if(isBreak==true){
                    String nameExpr=((seqExpr.get(i)).getClass().getName().replace('\n', '\0'));
                    System.err.println("\u001B[33m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+info+"CodeInutileWarning avec break: l'expression "+nameExpr+" est jamais atteinte \u001B[0m\n");
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
                    System.err.println("\033[0;33m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+info+"CodeInutileWarning avec break: l'expression "+nameExpr+" est jamais atteinte \u001B[0m\n");
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
        ArrayList<ProcFonc> listeProcFonc = tdsActuelle.functions;
        boolean wellplaced = false;
        for(ProcFonc fonc : listeProcFonc){
            if((fonc.getIdentifiant()).contains("While block") || (fonc.getIdentifiant()).contains("Boucle for")){
                wellplaced=true;
            }
        } 
        if(!wellplaced){
            System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"BreakError : le break est mal placé\u001B[0m\n");
               
        }
    }
}
