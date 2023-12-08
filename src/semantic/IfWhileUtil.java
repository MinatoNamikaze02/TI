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
                if(((LessThan)(tree)).left instanceof Const && ((LessThan)(tree)).right instanceof Const){
                    Const gauche =(Const) ((LessThan)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((LessThan)(tree)).right;
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
                if(((GreaterThan)(tree)).left instanceof Const && ((GreaterThan)(tree)).right instanceof Const){
                    Const gauche =(Const)((GreaterThan)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((GreaterThan)(tree)).right;
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
                if(((Equal2)(tree)).left instanceof Const && ((Equal2)(tree)).right instanceof Const){

                    Const gauche =(Const) ((Equal2)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((Equal2)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1==droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Equal2)(tree)).left instanceof Strin && ((Equal2)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Equal2)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Equal2)(tree)).right;
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
                if(((Dif)(tree)).left instanceof Const && ((Dif)(tree)).right instanceof Const){
                    Const gauche =(Const) ((Dif)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((Dif)(tree)).right;
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
                if(((LessThanOrEq)(tree)).left instanceof Const && ((LessThanOrEq)(tree)).right instanceof Const){
                    Const gauche =(Const) ((LessThanOrEq)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((LessThanOrEq)(tree)).right;
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
                if(((GreaterThanEq)(tree)).left instanceof Const && ((GreaterThanEq)(tree)).right instanceof Const){
                    Const gauche =(Const) ((GreaterThanEq)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((GreaterThanEq)(tree)).right;
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
                if(((LessThan)(tree)).left instanceof Const && ((LessThan)(tree)).right instanceof Const){
                    Const gauche =(Const) ((LessThan)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((LessThan)(tree)).right;
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
                if(((GreaterThan)(tree)).left instanceof Const && ((GreaterThan)(tree)).right instanceof Const){
                    Const gauche =(Const)((GreaterThan)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((GreaterThan)(tree)).right;
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
                if(((Equal2)(tree)).left instanceof Const && ((Equal2)(tree)).right instanceof Const){

                    Const gauche =(Const) ((Equal2)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((Equal2)(tree)).right;
                    int droit1 = droit.in;
                    if(gauche1!=droit1){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(((Equal2)(tree)).left instanceof Strin && ((Equal2)(tree)).right instanceof Strin){
                    Strin gauche =(Strin)((Equal2)(tree)).left;
                    String gauche1 = gauche.strin;
                    Strin droit = (Strin)((Equal2)(tree)).right;
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
                if(((Dif)(tree)).left instanceof Const && ((Dif)(tree)).right instanceof Const){
                    Const gauche =(Const) ((Dif)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((Dif)(tree)).right;
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
                if(((LessThanOrEq)(tree)).left instanceof Const && ((LessThanOrEq)(tree)).right instanceof Const){
                    Const gauche =(Const) ((LessThanOrEq)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((LessThanOrEq)(tree)).right;
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
                if(((GreaterThanEq)(tree)).left instanceof Const && ((GreaterThanEq)(tree)).right instanceof Const){
                    Const gauche =(Const) ((GreaterThanEq)(tree)).left;
                    int gauche1 = gauche.in;
                    Const droit =(Const) ((GreaterThanEq)(tree)).right;
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