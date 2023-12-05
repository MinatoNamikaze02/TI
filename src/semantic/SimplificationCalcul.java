package semantic;
import ast.*;

public class SimplificationCalcul {
    public static int checkSimplification(Ast tree){
        String name =tree.getClass().getName().replace('\n', '\0');
        if(name.equals("ast.Plus")){
            if(((Plus)tree).left instanceof In && ((Plus)tree).right instanceof In){
                In gauche = (In) ((Plus)tree).left;
                In droit = (In) ((Plus)tree).right;
                
                int gauche1= gauche.in;
                int droit1=droit.in;
                return gauche1+droit1;
            }
            else if(((Plus)tree).left instanceof In && !(((Plus)tree).right instanceof In)){
                In gauche = (In) ((Plus)tree).left;
                int gauche1= gauche.in;
                return gauche1+ checkSimplification(((Plus)tree).right);
            }
            else if(!(((Plus)tree).left instanceof In) && (((Plus)tree).right instanceof In)){
                In droit = (In) ((Plus)tree).right;
                int droit1= droit.in;
                return droit1+ checkSimplification(((Plus)tree).left);
            }
            else{
                return checkSimplification(((Plus)tree).right)+ checkSimplification(((Plus)tree).left);
            }
        }
        else if(name.equals("ast.Minus")){
            if(((Minus)tree).left instanceof In && ((Minus)tree).right instanceof In){
                In gauche = (In) ((Minus)tree).left;
                In droit = (In) ((Minus)tree).right;
                int gauche1= gauche.in;
                int droit1=droit.in;
                return gauche1-droit1;
            }
            else if(((Minus)tree).left instanceof In && !(((Minus)tree).right instanceof In)){
                In gauche = (In) ((Minus)tree).left;
                int gauche1= gauche.in;
                return gauche1- checkSimplification(((Minus)tree).right);
            }
            else if(!(((Minus)tree).left instanceof In) && (((Minus)tree).right instanceof In)){
                In droit = (In) ((Minus)tree).right;
                int droit1= droit.in;
                return checkSimplification(((Minus)tree).left)-droit1;
            }
            else{
                return checkSimplification(((Minus)tree).left)- checkSimplification(((Minus)tree).right);
            }
        }
        else if(name.equals("ast.Mul")){
            if(((Mul)tree).left instanceof In && ((Mul)tree).right instanceof In){
                In gauche = (In) ((Mul)tree).left;
                In droit = (In) ((Mul)tree).right;
                int gauche1= gauche.in;
                int droit1=droit.in;
                return gauche1*droit1;
            }
            else if(((Mul)tree).left instanceof In && !(((Mul)tree).right instanceof In)){
                In gauche = (In) ((Mul)tree).left;
                int gauche1= gauche.in;
                return gauche1* checkSimplification(((Mul)tree).right);
            }
            else if(!(((Mul)tree).left instanceof In) && (((Mul)tree).right instanceof In)){
                In droit = (In) ((Mul)tree).right;
                int droit1= droit.in;
                return checkSimplification(((Mul)tree).left)*droit1;
            }
            else{
                return checkSimplification(((Mul)tree).left)* checkSimplification(((Mul)tree).right);
            }
        }
        else if(name.equals("ast.Div")){
            if(((Div)tree).left instanceof In && ((Div)tree).right instanceof In){
                In gauche = (In) ((Div)tree).left;
                In droit = (In) ((Div)tree).right;
                int gauche1= gauche.in;
                int droit1=droit.in;
                return gauche1/droit1;
            }
            else if(((Div)tree).left instanceof In && !(((Div)tree).right instanceof In)){
                In gauche = (In) ((Div)tree).left;
                int gauche1= gauche.in;
                return gauche1 / checkSimplification(((Div)tree).right);
            }
            else if(!(((Div)tree).left instanceof In) && (((Div)tree).right instanceof In)){
                In droit = (In) ((Div)tree).right;
                int droit1= droit.in;
                return checkSimplification(((Div)tree).left)/droit1;
            }
            else{
                return checkSimplification(((Div)tree).left)/ checkSimplification(((Div)tree).right);
            }
        }
        return 0;
    }

    public static void warningSimplification(String tdsname,String info ,Ast tree){
        int resultatsimpli = checkSimplification(tree);
        if(resultatsimpli!=0){
           System.err.println("\u001B[33m"+"Ligne "+tree.getLine()+":"+tree.getColumn()+" : "+"SimplificationWarning : vous pourriez remplacer le calcul "+ info+ " par " +resultatsimpli + " plutot \u001B[0m\n");
     
        }
        
    }
}
