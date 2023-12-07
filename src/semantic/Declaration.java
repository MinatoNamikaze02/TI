package semantic;

import java.util.Stack;

import ast.Ast;
import tds.Table;

public class Declaration {

    public static boolean checkVardeclared(String name,Stack<Table> pile, Table tds,Ast tree) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        if(tdsactuel.getVarType(name) != null){
            return true;
        }
        System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Declaration Exception : Variable " + name + " not declared\u001B[0m\n");
        return false;
    }

    public static boolean checkFuncdeclared(String name,Stack<Table> pile, Table tds,Ast tree){
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        if(tdsactuel.getProcFonc(name) != null){
            return true;
        }
        System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "Declaration Exception : Function " + name + " not declared \u001B[0m\n");
        return false;
    }

}