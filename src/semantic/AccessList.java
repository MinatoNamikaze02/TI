package semantic;
import java.util.Stack;

import ast.*;
import tds.Table;
import tds.VarType;

public class AccessList {
    public static boolean checkAccesListe(Ast tree, Table tds,Stack<Table> pile){
        String name = tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.AccessVar")){
            String nomListe = ((AccessVar)tree).id;
            if(((AccessVar)(tree)).right instanceof In){
                In valeur1= (In)((AccessVar)(tree)).right;
                int valeurbis = valeur1.in;
                Table tableactuel = new Table(tds.getId());
                tableactuel.joinTDS(pile);
                VarType varactu= tableactuel.getVar(nomListe);
                String borneMax = varactu.getTaille();
                if(isInteger(borneMax)){
                    int borneMaxbis= Integer.parseInt(borneMax);
                    if(borneMaxbis<=valeurbis){
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public static void warningAccesListe(Ast tree, Stack<Table> pile,Table tds){
        if(checkAccesListe(tree, tds,pile)){
            System.err.println("\u001B[31m"+"Line "+tree.getLine()+":"+tree.getColumn()+" : "+"OutOfRangeError : the requested index exceeds the size of the list being accessed \u001B[0m\n");

        }
    }
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}