package semantic;
import ast.*;
import tds.Table;


public class IfWhileUtil {
    public static boolean checkIfInutile(Ast tree) {
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Expr0") ){
            return(checkIfInutile(((Expr0)tree).left) && checkIfInutile(((Expr0)tree).right) );
        }
        else if(name.equals("ast.Expr1")){
            return(checkIfInutile(((Expr1)tree).left) && checkIfInutile(((Expr1)tree).right) );
        }
        else{
            if(name.equals("ast.Inf")){
                if(((Inf)(tree)).left instanceof In && ((Inf)(tree)).right instanceof In){
                    In gauche =(In) ((Inf)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Inf)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1<droit1){

                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }

            }
            else if(name.equals("ast.Sup")){
                if(((Sup)(tree)).left instanceof In && ((Sup)(tree)).right instanceof In){
                    In gauche =(In)((Sup)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Sup)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1>droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Egal2")){
                if(((Egal2)(tree)).left instanceof In && ((Egal2)(tree)).right instanceof In){

                    In gauche =(In) ((Egal2)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Egal2)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1==droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Egal2)(tree)).left instanceof Strin && ((Egal2)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Egal2)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Egal2)(tree)).right;
                    String droit1 = droit.strin;
                    if(gauche1.equals(droit1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Dif")){
                if(((Dif)(tree)).left instanceof In && ((Dif)(tree)).right instanceof In){
                    In gauche =(In) ((Dif)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Dif)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1!=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Dif)(tree)).left instanceof Strin && ((Dif)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Dif)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Dif)(tree)).right;
                    String droit1 = droit.strin;
                    if(gauche1.equals(droit1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Infeg")){
                if(((Infeg)(tree)).left instanceof In && ((Infeg)(tree)).right instanceof In){
                    In gauche =(In) ((Infeg)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Infeg)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1<=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Supeg")){
                if(((Supeg)(tree)).left instanceof In && ((Supeg)(tree)).right instanceof In){
                    In gauche =(In) ((Supeg)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Supeg)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1>=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }

        }
        return false;
    }

    public static boolean checkIfInutileFalse(Ast tree) {
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Expr0") ){
            return(checkIfInutileFalse(((Expr0)tree).left) && checkIfInutileFalse(((Expr0)tree).right) );
        }
        else if(name.equals("ast.Expr1")){
            return(checkIfInutileFalse(((Expr1)tree).left) && checkIfInutileFalse(((Expr1)tree).right) );
        }
        else{
            if(name.equals("ast.Inf")){
                if(((Inf)(tree)).left instanceof In && ((Inf)(tree)).right instanceof In){
                    In gauche =(In) ((Inf)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Inf)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1>=droit1){

                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }

            }
            else if(name.equals("ast.Sup")){
                if(((Sup)(tree)).left instanceof In && ((Sup)(tree)).right instanceof In){
                    In gauche =(In)((Sup)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Sup)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1<=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Egal2")){
                if(((Egal2)(tree)).left instanceof In && ((Egal2)(tree)).right instanceof In){

                    In gauche =(In) ((Egal2)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Egal2)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1!=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Egal2)(tree)).left instanceof Strin && ((Egal2)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Egal2)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Egal2)(tree)).right;
                    String droit1 = droit.strin;
                    if(!gauche1.equals(droit1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Dif")){
                if(((Dif)(tree)).left instanceof In && ((Dif)(tree)).right instanceof In){
                    In gauche =(In) ((Dif)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Dif)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1==droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Dif)(tree)).left instanceof Strin && ((Dif)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Dif)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Dif)(tree)).right;
                    String droit1 = droit.strin;
                    if(gauche1.equals(droit1)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Infeg")){
                if(((Infeg)(tree)).left instanceof In && ((Infeg)(tree)).right instanceof In){
                    In gauche =(In) ((Infeg)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Infeg)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1>droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(name.equals("ast.Supeg")){
                if(((Supeg)(tree)).left instanceof In && ((Supeg)(tree)).right instanceof In){
                    In gauche =(In) ((Supeg)(tree)).left;
                    int gauche1 = gauche.in;
                    In droit =(In) ((Supeg)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1<droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }

        }
        return false;
    }

    public static void warningIfInutile(String info,Ast tree, Table tds ){
        boolean IfInutile = checkIfInutile(tree);
        if(IfInutile){
            System.err.println("\u001B[33m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + info + "Unused Warning: a condition " + info + " is used even though it is always true\u001B[0m\n");

        }
        if(checkIfInutileFalse(tree)){
            System.err.println("\u001B[33m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + info + "Unused Warning: a condition " + info + " is used even though it is always false\u001B[0m\n");

        }
    }
}