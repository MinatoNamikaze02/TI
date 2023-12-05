package semantic;
import java.util.Stack;

import ast.*;
import tds.Table;

public class Division {
    //verifie que lorsqu'il y a une division, le diviseur est différent de 0
    public static boolean checkDiviseur(Stack<Table> pile, Table tds, Ast tree){
        /*Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile); */
        //String name =tree.getClass().getName().replace('\n', '\0');
        //System.out.println(name);
        if(tree instanceof In){
            int div = ((In)tree).in;
            if(div==0){
                return true;
            }
        }
        return false;
    }

    public static void warningDivision(Stack<Table> pile, Table tds, Ast tree){
        boolean warning = checkDiviseur(pile, tds, tree);
        if(warning){
            System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"DivisionException : Division par 0 (attendu un diviseur différent de 0)\u001B[0m\n");
        }
    }
}
