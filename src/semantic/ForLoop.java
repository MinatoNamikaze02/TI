package semantic;

import ast.*;
import tds.Table;

public class ForLoop {
    public static boolean CheckBorneMinInfBorneMax(Ast min, Ast max, Table tds){
        if(min instanceof Const && max instanceof Const){
            String nameMin =min.getClass().getName().replace('\n', '\0');
            String nameMax =max.getClass().getName().replace('\n', '\0');
            if(nameMin.equals("ast.In") && nameMax.equals("ast.In")){
                int minInt = ((Const)min).in;
                int maxInt = ((Const)max).in;
                if(minInt<=maxInt){
                    return true;
                }
            }
            System.err.println("\u001B[31m" + "Line " + min.getLine() + ":" + min.getColumn() + " : " + "ForLoop Exception : Minimum bound greater than maximum bound (expected a minimum bound strictly less than a maximum bound)\u001B[0m\n");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean CheckBorneMinNotBorneMax(Ast min, Ast max, Table tds) {
        if(min instanceof Const && max instanceof Const){
            String nameMin =min.getClass().getName().replace('\n', '\0');
            String nameMax =max.getClass().getName().replace('\n', '\0');
            if(nameMin.equals("ast.In") && nameMax.equals("ast.In")){
                int minInt = ((Const)min).in;
                int maxInt = ((Const)max).in;
                if(minInt!=maxInt){
                    return true;
                }
            }
            System.err.println("\u001B[33m" + "Line " + min.getLine() + ":" + min.getColumn() + " : " + "ForLoop Warning : Minimum bound equal to maximum bound (expected a minimum bound strictly less than a maximum bound)\u001B[0m\n");
            return false;
        }
        else{
            return true;
        }
    }

}