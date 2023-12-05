package semantic;

import ast.*;
import tds.Table;

public class BoucleFor {
    public static boolean CheckBorneMinInfBorneMax(Ast min, Ast max, Table tds){
        if(min instanceof In && max instanceof In){
            String nameMin =min.getClass().getName().replace('\n', '\0');
            String nameMax =max.getClass().getName().replace('\n', '\0');
            if(nameMin.equals("ast.In") && nameMax.equals("ast.In")){
                int minInt = ((In)min).in;
                int maxInt = ((In)max).in;
                if(minInt<=maxInt){
                    return true;
                }
            }
            System.err.println("\u001B[31m"+"Ligne "+min.getLine()+":"+min.getColumn()+" : "+"BoucleForException : Borne min supérieure à borne max (attendu une borne min strictement inférieure à une borne max)\u001B[0m\n");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean CheckBorneMinNotBorneMax(Ast min, Ast max, Table tds) {
        if(min instanceof In && max instanceof In){
            String nameMin =min.getClass().getName().replace('\n', '\0');
            String nameMax =max.getClass().getName().replace('\n', '\0');
            if(nameMin.equals("ast.In") && nameMax.equals("ast.In")){
                int minInt = ((In)min).in;
                int maxInt = ((In)max).in;
                if(minInt!=maxInt){
                    return true;
                }
            }
            System.err.println("\u001B[33m"+"Ligne "+min.getLine()+":"+min.getColumn()+" : "+"BoucleForWarning : Borne min egale à borne max (attendu une borne min strictement inférieure à une borne max)\u001B[0m\n");
            return false;
        }
        else{
            return true;
        }
    }

}
