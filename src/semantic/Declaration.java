package semantic;

import java.util.Stack;

import ast.Ast;
import tds.Table;

public class Declaration {
    
    //verifie si la variable est deja declaree
    /*
     * @param 
     * -name nom de la variable
     * -tableactuel Table table des symboles actuelle
     */
    public static boolean checkVardeclared(String name,Stack<Table> pile, Table tds,Ast tree) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        if(tdsactuel.getVarType(name) != null){
            return true;
        }
        System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"DeclarationException : Variable "+name+" non déclarée\u001B[0m\n");
        return false;
    }

    //verifie si la fonction est deja declaree
    /*
     * @param 
     * -name nom de la fonction
     * -tableactuel Table table des symboles actuelle
     */
    public static boolean checkFuncdeclared(String name,Stack<Table> pile, Table tds,Ast tree){
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        if(tdsactuel.getProcFonc(name) != null){
            return true;
        }
        System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"DeclarationException : Fonction "+name+" non déclarée \u001B[0m\n");
        return false;
    }
        
}

