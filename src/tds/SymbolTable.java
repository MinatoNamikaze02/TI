package tds;


import java.util.ArrayList;
import java.util.Stack;

import ast.Program ;
import ast.Expr0 ;
import ast.Expr1 ;
import ast.Strin ;
import ast.GreaterThan;
import ast.GreaterThanEq;
import ast.Const;
import ast.LessThan;
import ast.LessThanOrEq;
import ast.Nil ;
import ast.Plus;
import ast.IfThen ;
import ast.While ;
import semantic.Function;
import semantic.AccessList;
import semantic.ForLoop;
import semantic.BreakCodeUtil;
import semantic.Declaration;
import semantic.Expression;
import semantic.Division;
import semantic.IfWhileUtil;
import semantic.SimplificationCalcul;
import ast.For ;
import ast.Break ;
import ast.Let ;
import ast.Minus;
import ast.Mul;
import ast.Print ;
import ast.Functiondeclaration ;
import ast.Equal;
import ast.Equal2;
import ast.TypeEqual;
import ast.Exprnegation ;
import ast.Exprseq ;
import ast.FdecWithoutfields;
import ast.Exprlist ;
import ast.Fieldlist ;
import ast.Field ;
import ast.AccessVar;
import ast.Appelfunc ;
import ast.Idcall2;
import ast.Pointid ;
import ast.Brack;
import ast.Dif;
import ast.Div;
import ast.Assign;
import ast.Typedeclaration ;
import ast.Typefields ;
import ast.Typefield ;
import ast.Typepredefined ;
import ast.Typeswithfieldlist;
import ast.Typeswithof;
import ast.Typeidid ;
import ast.Variabledeclaration ;
import ast.Vardec1 ;
import ast.Ast;
import ast.AstVisitor;
import ast.Arrof;


public class SymbolTable implements AstVisitor<String> {
    private Stack<Table> tdsStack = new Stack<Table>();
    private Table tds;
    public Stack<Exception> exceptions = new Stack<Exception>();
    private int state;
    private boolean varDec;
    private boolean typedec;
    private boolean funcdec;
    private boolean typefuncdec;
    private boolean Dec;
    private boolean elementtypedec;
    private boolean tailledec;
    private boolean inutile;


    private String varid;
    private String funcid;
    private String decvalue;
    private String functype;
    private ArrayList<VarType> args;
    private String Typetype; 
    private ArrayList<String> elementtype;
    
    private String tailletype;
    private int cmptailletype;
    


    public SymbolTable() {
        this.state=0;
        tds = new Table(-1,"programme");
        tdsStack.push(tds);
        funcdec=false;
        varDec=false;
        typedec=false;
        typefuncdec=false;
        tailletype=null;
    }

    public Table getTds() {
        return tds;
    }



    public void display() {
        while (!tdsStack.empty()){
            this.tds=tdsStack.pop();
        }
        this.tds.afficher();
    }
    
    public void addFils(String namepere) {
        Table tdsFils = new Table(tds.getId(),namepere);
        tdsStack.push(tdsFils);
        tds.addFils(tdsFils);
        tds = tdsFils;
    }

    public void addProcFonc(ProcFunc procfonc, Ast tree){
            tds.addProcFonc(procfonc, tree);
    }

    private String nextState(){
        String returnedState = String.valueOf(this.state);
        this.state++;
        return returnedState;
    }

    public void closeFils() {
        tdsStack.pop();
        tds = tdsStack.peek();
    }

    public void addVarType(VarType varType, Ast tree) {
        tds.addVarType(varType, tree);
    }


    @Override
    public String visit(Expr0 affect) {
        String nodeIdentifier = this.nextState();

        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(Expr1 affect) {
        String nodeIdentifier = this.nextState();

        affect.left.accept(this);
        affect.right.accept(this);
        return nodeIdentifier;
    }

    @Override
    public String visit(Strin affect) {
        String nodeIdentifier = this.nextState();
        if (varDec && !typedec && !typefuncdec){
            VarType var = new VarType(varid, "String", "Var",affect.getLine(),affect.getColumn());
            this.addVarType(var, affect);
            varDec=false;
        }
        if (tailledec){
            tailletype+=affect.strin;

        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Const affect) {
        String nodeIdentifier = this.nextState();
        if (varDec && !tailledec && !typedec && !typefuncdec){
            VarType var = new VarType(varid, "int", "Var",affect.getLine(),affect.getColumn());
            this.addVarType(var, affect);
            varDec=false;
        }
        if (tailledec){
            tailletype+=String.valueOf(affect.in);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Nil affect) {
        String nodeIdentifier = this.nextState();
        return nodeIdentifier;
    }

    @Override
    public String visit(While affect) {
        String nodeIdentifier = this.nextState();

        Expression.checktype(affect.left, "bool", this.tdsStack, this.tds);
        IfWhileUtil.warningIfInutile("while",affect.left,this.tds);
        affect.left.accept(this);
        int i=1;
        for(int j=1;j<=this.tds.functions.size();j++){
            if(this.tds.getProcFonc("While block "+j)!=null){
                i++;
            }
        }
        ProcFunc whileblock = new ProcFunc("While block "+i, "While",new ArrayList<VarType>());
        whileblock.setUsed();
        this.addProcFonc(whileblock, affect);

        this.addFils("While block "+i);
        affect.right.accept(this);
        if(this.inutile){
            BreakCodeUtil.checkBreakDo(affect.right,"While");
        }
        this.inutile=false;
        this.closeFils();

        return nodeIdentifier;
    }

    @Override
    public String visit(For affect) {
        String nodeIdentifier = this.nextState();

        Expression.checktype(affect.min, "int", this.tdsStack, this.tds);
        Expression.checktype(affect.max, "int", this.tdsStack, this.tds);
        ForLoop.CheckBorneMinInfBorneMax(affect.min, affect.max, this.tds);
        ForLoop.CheckBorneMinNotBorneMax(affect.min, affect.max, this.tds);

        ArrayList<VarType> args = new ArrayList<VarType>();
        varDec=false;
        VarType var = new VarType(affect.id, "int", "Var",affect.getLine(),affect.getColumn());

        args.add(var);
        int i=1;
        for(int j=1;j<=this.tds.functions.size();j++){
            if(this.tds.getProcFonc("For loop "+j)!=null){
                i++;
            }
        }
        ProcFunc forloop = new ProcFunc("For loop "+i, "for", args);
        forloop.setUsed();
        this.addProcFonc(forloop, affect);
        this.addFils("For loop "+i);
        var.setUsed(true);
        this.addVarType(var, affect);
        affect.min.accept(this);
        affect.max.accept(this);
        affect.regle.accept(this);
        if(this.inutile){
            BreakCodeUtil.checkBreakDo(affect.regle,"For");
        }
        this.inutile=false;
        this.closeFils();

        return nodeIdentifier;
    }

    @Override
    public String visit(Break affect) {
        String nodeIdentifier = this.nextState();
        Table tdsActuelle = new Table(tds.getId());
        tdsActuelle= tdsActuelle.joinTDS(tdsStack);
        BreakCodeUtil.checkBreakWellPlaced(tdsActuelle,tds.name, affect);
        this.inutile=true;
        return nodeIdentifier;
    }

    @Override
    public String visit(Let affect) {
        String nodeIdentifier = this.nextState();
        for(Ast ast : affect.lefts){
            if(ast!=null){
                ast.accept(this);
            }
        }
        if(affect.right != null){
            affect.right.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Functiondeclaration affect) {
        String nodeIdentifier = this.nextState();
        funcid = affect.id;
        funcdec=true;
        typefuncdec=false;
        args=new ArrayList<VarType>();
        if(affect.typefields != null){
            affect.typefields.accept(this);
        }
        ProcFunc func = new ProcFunc(funcid, functype, args);
        this.addProcFonc(func, affect);
        this.addFils(funcid);
        for (VarType var:args){
            this.addVarType(var, affect);
        }
        funcdec=false;
        affect.functiondeclaration.accept(this);

        this.closeFils();
        return nodeIdentifier;
    }

    @Override
    public String visit(Equal affect) {
        String nodeIdentifier = this.nextState();
        affect.expr.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(TypeEqual affect) {
        String nodeIdentifier = this.nextState();
        typefuncdec=true;
        affect.typeid.accept(this);
        typefuncdec=false;
        affect.expr.accept(this);
        return nodeIdentifier;
    }

    @Override
    public String visit(Exprnegation affect) {
        String nodeIdentifier = this.nextState();
        affect.expr.accept(this);
        return nodeIdentifier;
    }

    @Override
    public String visit(Exprseq affect) {
        String nodeIdentifier = this.nextState();
        for (Ast ast : affect.expr){
            ast.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Exprlist affect) {
        String nodeIdentifier = this.nextState();
        for (Ast ast : affect.expr){
            ast.accept(this);
        }
        return nodeIdentifier;
    }


    @Override
    public String visit(Fieldlist affect) {
        String nodeIdentifier = this.nextState();
        for (Ast ast : affect.field){
            ast.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Field affect) {
        String nodeIdentifier = this.nextState();
        Table tableActuelle = new Table(tds.getId());
        tableActuelle = tableActuelle.joinTDS(tdsStack);
        affect.expr.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(Appelfunc affect){
        String nodeIdentifier = this.nextState();
        if (Declaration.checkFuncdeclared(affect.id, this.tdsStack, this.tds,affect)){
            Function.checknombreparametres(affect,this.tdsStack,this.tds);
            Function.checktypeparametres(affect, this.tdsStack, this.tds);
            Function.checkdeclaration(affect, this.tdsStack, this.tds);
            tds.setUsed(tdsStack, affect.id, "Function");
        }

        if (tailledec){
            tailletype=affect.id;
        }
        if (affect.right != null){
            affect.right.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Pointid affect) {
        String nodeIdentifier = this.nextState();
        String point = ".";
        String fils = affect.fils;
        String id;
        if(affect.id != null){
            id = affect.id;
        }
        else{
            affect.left.accept(this);
            id = Expression.getType(affect.left, tds, tdsStack);
        }
        String type = id + point + fils;
        Table tableActuelle = new Table(tds.getId());
        tableActuelle=tableActuelle.joinTDS(tdsStack);
        if (tableActuelle.getVarType(type) != null){
            tableActuelle.getVarType(type).setUsed(true);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Brack affect) {
        String nodeIdentifier = this.nextState();
        affect.expr.accept(this);

        Expression.checktype(affect.expr, "int", this.tdsStack, this.tds);

        if(affect.lvaluebis != null){
            affect.lvaluebis.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Typedeclaration affect) {
        String nodeIdentifier = this.nextState();
        typedec=true;
        affect.typeid.accept(this);
        typedec=false;
        Dec=true;
        Typetype="Type";
        cmptailletype=0;
        elementtype= new ArrayList<String>();
        affect.type.accept(this);
        Dec=false;
        if (cmptailletype>0){
            tailletype=String.valueOf(cmptailletype);
        }
        if (Typetype.equals("Type") || Typetype.equals("Array of")){
            VarType var = new VarType(varid, Typetype, "Type",elementtype,affect.getLine(),affect.getColumn());
            this.addVarType(var, affect);
        }else{
            VarType var = new VarType(varid, Typetype, "Type",elementtype,tailletype,affect.getLine(),affect.getColumn());
            this.addVarType(var, affect);
        }
        tailletype=null;
        return nodeIdentifier;
    }

    @Override
    public String visit(Typefields affect) {
        String nodeIdentifier = this.nextState();
        for (Ast ast : affect.typefield){
            ast.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Typefield affect) {
        String nodeIdentifier = this.nextState();


        varDec=true;
        if (Dec){
            Typetype="TypeList";
            decvalue=varid+"."+affect.id;
            elementtypedec=true;
            cmptailletype++;
        }else{
            varid=affect.id;
        }

        affect.type.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(Typepredefined affect) {
        String nodeIdentifier = this.nextState();
        if (varDec  && !funcdec && !Dec && !typefuncdec){
            VarType var ;
            if (tailletype==null){
                var = new VarType(varid, affect.type, "Var",affect.getLine(),affect.getColumn());
            }else{
                var = new VarType(varid, affect.type, "Var",tailletype,affect.getLine(),affect.getColumn());
                tailletype=null;
            }
            this.addVarType(var,affect);
            varDec=false;
        }
        if (varDec  && !funcdec && Dec && !typefuncdec){
            VarType var ;
            if (tailletype==null){
                var = new VarType(decvalue, affect.type, "Var",affect.getLine(),affect.getColumn());
                var.initialized=false;
            }else{
                var = new VarType(decvalue, affect.type, "Var",tailletype,affect.getLine(),affect.getColumn());
                tailletype=null;
            }
            this.addVarType(var,affect);
            varDec=false;
        }
        if (funcdec && !tailledec && !elementtypedec && !typefuncdec){
            args.add(new VarType(varid, affect.type, "Var",affect.getLine(),affect.getColumn()));
            varDec=false;
        }
        if (typefuncdec && !tailledec && !elementtypedec){
            functype=affect.type;
        }
        if (Dec && !tailledec && !elementtypedec){
            elementtype.add(affect.type+",");
        }
        if (elementtypedec && !tailledec){
            elementtype.add(affect.type+",");
            elementtypedec=false;
        }
        if (tailledec){
            tailletype+=affect.type;
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Typeidid affect) {
        String nodeIdentifier = this.nextState();
        if (varDec && !Dec && !funcdec && !typefuncdec ){
            VarType var ;
            if (tailletype==null){
                var = new VarType(varid, affect.id, "Var",affect.getLine(),affect.getColumn());
            }else{
                var = new VarType(varid, affect.id, "Var",tailletype,affect.getLine(),affect.getColumn());
                tailletype=null;
            }
            this.addVarType(var,affect);
            varDec=false;
        }
        if (varDec && !funcdec && Dec && !typefuncdec){
            VarType var ;
            if (tailletype==null){
                var = new VarType(decvalue, affect.id, "Var",affect.getLine(),affect.getColumn());
            }else{
                var = new VarType(decvalue, affect.id, "Var",tailletype,affect.getLine(),affect.getColumn());
                tailletype=null;
            }
            this.addVarType(var,affect);
            varDec=false;
        }
        if (funcdec && !elementtypedec && !tailledec && !typefuncdec){
            if(args==null){
                args= new ArrayList<VarType>();
            }
            args.add(new VarType(varid, affect.id, "Var",affect.getLine(),affect.getColumn()));
            varDec=false;
        }
        if (typefuncdec && !elementtypedec && !tailledec){
            functype=affect.id;
        }
        if (typedec && !elementtypedec && !tailledec){
            varid=affect.id;
        }
        if (Dec && !elementtypedec && !tailledec){
            elementtype.add(affect.id+",");
        }
        if (elementtypedec && !tailledec){
            elementtype.add(affect.id+",");
            elementtypedec=false;
        }
        if (tailledec){
            tailletype+=affect.id;
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Variabledeclaration affect) {
        String nodeIdentifier = this.nextState();
        varid=affect.id;
        varDec=true;
        affect.bis.accept(this);
        return nodeIdentifier;
    }

    @Override
    public String visit(Vardec1 affect) {
        String nodeIdentifier = this.nextState();

        affect.expr.accept(this);

        affect.typeid.accept(this);
        tds.setUsed(tdsStack,((Typeidid)affect.typeid).id, "Type");
        return nodeIdentifier;
    }


    @Override
    public String visit(Program affect) {
        String nodeIdentifier = this.nextState();


        affect.expression.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(IfThen affect) {
        String nodeIdentifier = this.nextState();

        if (Expression.checktype(affect.left, "bool", this.tdsStack, this.tds)){
            IfWhileUtil.warningIfInutile("if",affect.left,this.tds);
        }
        affect.left.accept(this);
        int i=1;
        for(int j=1;j<=this.tds.functions.size();j++){
            if(this.tds.getProcFonc("Then block "+j)!=null){
                i++;
            }
        }
        ProcFunc then = new ProcFunc("Then block "+i, "Then",new ArrayList<VarType>());
        then.setUsed();
        this.addProcFonc(then, affect.center);
        this.addFils("Then block "+i);
        affect.center.accept(this);

        this.inutile=false;
        this.closeFils();
        if(affect.right != null){
            int k=1;
            for(int j=1;j<=this.tds.functions.size();j++){
                if(this.tds.getProcFonc("Else block "+j)!=null){
                    i++;
                }
            }
            ProcFunc Else = new ProcFunc("Else block "+k, "Else",new ArrayList<VarType>());
            Else.setUsed();
            this.addProcFonc(Else, affect.right);
            this.addFils("Else block "+k);
            affect.right.accept(this);
            this.closeFils();
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Print affect) {
        String nodeIdentifier = this.nextState();
        affect.fils.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(Dif affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktypeEgal(affect, tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'different from' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'different from' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(LessThan affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktype(affect, "bool", tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'less than' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'less than' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(GreaterThan affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktype(affect, "bool", tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'greater than' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'greater than' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(LessThanOrEq affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktype(affect, "bool", tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'less than or equal to' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'less than or equal to' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(GreaterThanEq affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktype(affect, "bool", tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'greater than or equal to' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'greater than or equal to' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(Plus affect) {
        String nodeIdentifier = this.nextState();
        affect.left.accept(this);
        if (tailledec){
            tailletype+="+";
        }
        affect.right.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(Minus affect) {
        String nodeIdentifier = this.nextState();
        affect.left.accept(this);
        if (tailledec){
            tailletype+="-";
        }
        affect.right.accept(this);

        return nodeIdentifier;
    }

    @Override
    public String visit(Mul affect) {
        String nodeIdentifier = this.nextState();

        affect.left.accept(this);
        if (tailledec){
            tailletype+="*";
        }
        affect.right.accept(this);



        return nodeIdentifier;
    }

    @Override
    public String visit(Div affect) {
        String nodeIdentifier = this.nextState();

        affect.left.accept(this);
        if (tailledec){
            tailletype+="/";
        }
        affect.right.accept(this);

        Division.warningDivision( this.tdsStack, this.tds,affect.right);


        return nodeIdentifier;
    }

    @Override
    public String visit(FdecWithoutfields affect) {
        String nodeIdentifier = this.nextState();
        funcid = affect.id;
        funcdec=true;
        typefuncdec=false;
        ProcFunc func = new ProcFunc(funcid, functype , null);
        this.addProcFonc(func, affect);
        this.addFils(funcid);

        affect.functiondeclaration.accept(this);
        
        this.closeFils();
        return nodeIdentifier;
    }

    @Override
    public String visit(Equal2 affect) {
        String nodeIdentifier = this.nextState();
        if (Expression.checktypeEgal(affect, tdsStack, tds)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the 'equal' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the 'equal' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(Typeswithof affect) {
        String nodeIdentifier = this.nextState();
        tailledec=true;
        tailletype="";
        affect.expr1.accept(this);
        tailledec=false;
        affect.typeid.accept(this);
        tds.setUsed(tdsStack,((Typeidid)affect.typeid).id, "Type");
        affect.expr2.accept(this);
        return nodeIdentifier;
    }

    

    @Override
    public String visit(Typeswithfieldlist affect) {
        String nodeIdentifier = this.nextState();
        affect.typeid.accept(this);
        
        tds.setUsed(tdsStack,((Typeidid)affect.typeid).id, "Type");
        Table tableActuelle = new Table(this.tds.getId());
        tableActuelle=tableActuelle.joinTDS(tdsStack);
        if(affect.fieldlist != null && Declaration.checkVardeclared(((Typeidid)affect.typeid).id,this.tdsStack,this.tds,affect)){
            Expression.checktypefield((Fieldlist)affect.fieldlist, tableActuelle.getVarType(((Typeidid)affect.typeid).id).getIdentifiant(), this.tdsStack, this.tds);   
        }
        if(affect.fieldlist != null){
            affect.fieldlist.accept(this);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Idcall2 affect) {

        tds.setUsed(this.tdsStack, affect.id, "Var");

        String nodeIdentifier = this.nextState();
        if (tailledec){
            tailletype+=affect.id;
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(Assign affect) {
        String nodeIdentifier = this.nextState();

        if (Expression.checktypeDptEgal(affect, this.tds, this.tdsStack)){
            SimplificationCalcul.warningSimplification(this.tds.name,"left side of the ':=' symbol",affect.left);
            SimplificationCalcul.warningSimplification(this.tds.name,"right side of the ':=' symbol",affect.right);
        }
        affect.left.accept(this);
        affect.right.accept(this);

        return nodeIdentifier;
    }


    @Override
    public String visit(Arrof affect) {
        String nodeIdentifier = this.nextState();
        elementtypedec=true;
        affect.type.accept(this);
        elementtypedec=false;
        Typetype="Array of";

        return nodeIdentifier;
    }

    @Override
    public String visit(AccessVar affect) {
        tds.setUsed(this.tdsStack, affect.id, "Var");
        String nodeIdentifier = this.nextState();
        if (affect.id != null){
            if (Declaration.checkVardeclared(affect.id, this.tdsStack, this.tds,affect)){
                AccessList.warningAccesListe(affect,this.tdsStack, this.tds);
            }
        }
        else{
            affect.left.accept(this);
            AccessList.warningAccesListe(affect,this.tdsStack, this.tds);
        }
        if (tailledec){
            tailletype=affect.id;
        }
        

        if (affect.right != null){
            affect.right.accept(this);

        }
        return nodeIdentifier;

    }
}