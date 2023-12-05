package semantic;

import java.util.ArrayList;
import java.util.Stack;

import ast.AccesVar;
import ast.Appelfunc;
import ast.Exprlist;
import tds.Table;
import tds.VarType;

public class Fonction {

    //verifie que le nombre de parametres est correct pour une fonction donnée grace à la tds
    /*
     * param:
     * -tree Ast noeud d'appel de fonction
     * -tdsactuel jonctions des tables de symboles aucquels l'on peut accéder à l'endroit de l'appel.
     */
    public static void checknombreparametres(Appelfunc tree,Stack<Table> pile, Table tds) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        int nbrparametre = tdsactuel.getProcFonc(tree.id).getArguments().size();
        //pas de paramètres
        if (tree.right == null){
            if(nbrparametre != 0){
                System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"FonctionException : Nombre de paramètres incorrect (attendu : "+nbrparametre+" trouvé : 0)\u001B[0m\n");
            }
            else {
                return;
            }
        }
        //des paramètres
        int nbrparametre2 = 0;
        for(int i=0;i<((Exprlist)tree.right).expr.size();i++){
            nbrparametre2++;
        }
        if(nbrparametre-nbrparametre2 != 0){
            System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"FonctionException : Nombre de paramètres incorrect (attendu : "+nbrparametre+" trouvé : "+nbrparametre2+")\u001B[0m\n");
        }


    }

    //verifie que le type des parametres est correct pour une fonction donnée grace à la tds
    /*
     * param:
     * -tree Ast noeud d'appel de fonction
     * -tdsactuel jonctions des tables de symboles aucquels l'on peut accéder à l'endroit de l'appel.
    */
    public static void checktypeparametres(Appelfunc tree,Stack<Table> pile, Table tds) {
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        ArrayList<VarType> listarg = tdsactuel.getProcFonc(tree.id).getArguments();
        //pas de paramètres
        if (tree.right == null){
            return;
        }
        //des paramètres
        int nbrparametre = listarg.size();
        for(int i=0;i<nbrparametre;i++){
            if(!Expression.checktypesansPrint(((Exprlist)tree.right).expr.get(i),(listarg.get(i).getType()),pile,tds)){
                if(i==0){
                    System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"FonctionException : Type du "+(i+1)+"er paramètre incorrect (attendu : "+listarg.get(i).getType()+")\u001B[0m\n");
                }else{
                System.err.println("\u001B[31m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"FonctionException : Type du "+(i+1)+"ème paramètre incorrect (attendu : "+listarg.get(i).getType()+")\u001B[0m\n");
                }
            }
        }
    }

    //verifie que les variables utilisées dans l'appel de fonction sont déclarées
    /*
     * param:
     * -tree Ast noeud d'appel de fonction
     * -tdsactuel jonctions des tables de symboles aucquels l'on peut accéder à l'endroit de l'appel.
    */
    public static void checkdeclaration(Appelfunc tree,Stack<Table> pile, Table tds){
        Table tdsactuel = new Table(tds.getId());
        tdsactuel = tdsactuel.joinTDS(pile);
        //pas de paramètres
        if (tree.right == null){
            return;
        }
        //des paramètres
        int nbrparametre = ((Exprlist)tree.right).expr.size();
        for(int i=0;i<nbrparametre;i++){
            if(((Exprlist)tree.right).expr.get(i) instanceof Appelfunc){
                Fonction.checkdeclaration((Appelfunc)((Exprlist)tree.right).expr.get(i),pile,tds);

            }
            else if(((Exprlist)tree.right).expr.get(i) instanceof AccesVar){
                Declaration.checkVardeclared(((AccesVar)((Exprlist)tree.right).expr.get(i)).id,pile,tds,tree);
            }
        }
    }
}
