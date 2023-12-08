package semantic;
import java.util.Stack;

import ast.*;
import tds.Table;

public class Division {
    public static boolean checkDiviseur(Stack<Table> pile, Table tds, Ast tree){

        if(tree instanceof Const){
            int div = ((Const)tree).in;
            if(div==0){
                return true;
            }
        }
        return false;
    }

    public static void warningDivision(Stack<Table> pile, Table tds, Ast tree){
        boolean warning = checkDiviseur(pile, tds, tree);
        if(warning){
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Division Exception : Division by 0 (expected a non-zero divisor)\u001B[0m\n");
        }
    }
}