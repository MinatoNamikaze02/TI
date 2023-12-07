package tds;
import java.util.ArrayList;
import java.util.Stack;

import ast.Ast;

public class Table {
	public static int nbTable=-1;
	public int id;
	public ArrayList<VarType> variables = new ArrayList<VarType>();
	public ArrayList<ProcFunc> functions = new ArrayList<ProcFunc>();
	public int parentId;
    public ArrayList<Table> fils = new ArrayList<Table>();
    public int arg_depl;
    public int var_depl;
    public int arr_depl;
    public String name;
	
	public Table(int pere,String name){
		nbTable++;
		this.id = nbTable;
        this.parentId = pere;
        this.name=name;
        arg_depl = -2;
        var_depl = 1;
	}

    public Table(int pere){
        this.id = pere;
        this.parentId = pere;
	}
	
	public Table(ArrayList<VarType> var, ArrayList<ProcFunc> fct,int pere){
		nbTable++;
		this.id = nbTable;
		this.variables.clear();
		this.functions.clear();
		this.variables.addAll(var);
		this.functions.addAll(fct);
        this.parentId = pere;
        for (VarType the_var : this.variables) {
            the_var.setTableID(this.id);
            if (the_var.getDeplacement() == 0) {
                the_var.setDeplacement(var_depl);
                var_depl++;
            }
        }

        for (ProcFunc the_func : this.functions) {
            the_func.setTableID(this.id);
        }
	}

    public String toString(){
        int variableCount = 0;
        int functionCount = 0;

        for (int k = 0; k < this.variables.size(); k++){
            if (!this.variables.get(k).getNature().equals("Type")){
                variableCount++;
            }
        }

        for (int k = 0; k < this.functions.size(); k++){
            if (this.functions.get(k).getNature().equals("function")){
                functionCount++;
            }
        }

        String result = "";

        if (this.parentId == -1){
            result = "\u001B[32m" + "| TABLE ID=" + this.id + "\u001B[0m" + "\n" + "\u001B[32m" +
                    "| Function Name=" + this.name + "\u001B[0m" + "\n" + "\u001B[31m";
        } else {
            if (this.variables.size() - variableCount > 0 || this.functions.size() - functionCount > 0 || variableCount > 0 || functionCount > 0){
                result = "\u001B[32m" + "| TABLE ID=" + this.id + "\u001B[0m" + "\n" + "\u001B[32m" +
                        "| Function Name=" + this.name + "\u001B[0m" + "\n" + "\u001B[32m" +
                        "| Parent ID=" + this.parentId + "\u001B[0m" + "\n" + "\u001B[31m";
            }
        }

        if (this.variables.size() - variableCount > 0){
            // Add Types to the display
            result += "| Types:" + "\u001B[0m" + "\n" + "\u001B[34m" + "| " + String.format("%-6s", "Nature") + " | " + String.format("%-13s", "Name") + " | " + String.format("%-9s", "Type") + " | "
                    + String.format("%-12s", "Offset") + " | " + String.format("%-14s", "Is Used") + " | " + String.format("%-12s", "Dimensions") + " | " + String.format("%-15s", "Element Type") + "\u001B[0m" + "\n";

            for (int k = 0; k < this.variables.size(); k++){
                if (this.variables.get(k).getNature().equals("Type")){
                    result = result + this.variables.get(k).toString() + "\n";
                }
            }
        }

        if (variableCount > 0){
            // Add variables to the display
            result += "\u001B[31m" + "| Variables:" + "\u001B[0m" + "\n";
            result += "\u001B[34m" + "| " + String.format("%-6s", "Nature") + " | " + String.format("%-13s", "Name") + " | " + String.format("%-9s", "Type") + " | "
                    + String.format("%-12s", "Offset") + " | " + String.format("%-14s", "Initialization") + " | " + String.format("%-14s", "Is Used") + " | " + String.format("%-12s", "Dimensions") + "\u001B[0m" + "\n";

            for (int k = 0; k < this.variables.size(); k++){
                if (this.variables.get(k).getNature().equals("Var")){
                    result = result + this.variables.get(k).toString() + "\n";
                }
            }
        }

        if (this.functions.size() - functionCount > 0){
            // Add procedures to the display
            result += "\u001B[31m" + "| Procedures:" + "\u001B[0m" + "\n";
            result += "\u001B[34m" + "| " + String.format("%-10s", "Nature") + " | " + String.format("%-13s", "Name") + " | " + String.format("%-9s", "Type")
                    + " | " + String.format("%-7s", "Num Args") + " | " + String.format("%-14s", "Is Used") + "\u001B[0m" + "\n";

            for (int k = 0; k < this.functions.size(); k++){
                if (this.functions.get(k).getNature().equals("procedure")){
                    result = result + this.functions.get(k).toString() + "\n";
                }
            }
        }

        if (functionCount > 0){
            // Add functions to the display
            result += "\u001B[31m" + "| Functions:" + "\u001B[0m" + "\n";
            result += "\u001B[34m" + "| " + String.format("%-10s", "Nature") + " | " + String.format("%-13s", "Name") + " | " + String.format("%-9s", "Type")
                    + " | " + String.format("%-7s", "Num Args") + " | " + String.format("%-20s", "Argument Types") + " | " + String.format("%-14s", "Is Used") + "\u001B[0m" + "\n";

            for (int k = 0; k < this.functions.size(); k++){
                if (this.functions.get(k).getNature().equals("function")){
                    result = result + this.functions.get(k).toString() + "\n";
                }
            }
        }
        return result;
    }


    public int getId(){
		return this.id;
	}
	
	public void addVarType(VarType var, Ast tree) {
		if(!checkAlreadyExist(var)){
            this.variables.add(var);
            var.setTableID(this.id);
            if (var.getDeplacement() == 0 && var.isLocal()) { // Si own, on a deja la variable ailleurs pas besoin de la mettre dans la pile
                var.setDeplacement(var_depl);
                var_depl++;
            
            }
        }
        else{
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "DoubleDeclarationException: " + var.getNature() + " " + var.identifier + " already declared in the same block\u001B[0m\n");
        }
    }

    public VarType getVar(String varName) {
        for (VarType myVar : variables) {
            if (myVar.getIdentifiant().equals(varName) && myVar.getNature()=="Var") {
                return myVar;
            }
        }
        return null;
    }

    public VarType getType(String varName) {
        for (VarType myVar : variables) {
            if (myVar.getIdentifiant().equals(varName) && myVar.getNature()=="Type") {
                return myVar;
            }
        }
        return null;
    }

    public void addArray(VarType var) {
		if(!checkAlreadyExist(var)){
            this.variables.add(var);
            var.setTableID(this.id);
            if (var.getDeplacement() == 0 && var.isLocal()) { // Si own, on a deja la variable ailleurs pas besoin de la mettre dans la pile
                var.setDeplacement(var_depl);
                arr_depl++;
            
            }
        }
    }
    
    public void addArg(VarType var) {
		if(!checkAlreadyExist(var)){
            this.variables.add(var);
            var.setTableID(this.id);
            if (var.getDeplacement() == 0 && var.isLocal()) {
                var.setDeplacement(arg_depl);
                arg_depl--;
            }
        }
	}
	
	public void addProcFonc(ProcFunc fct , Ast tree) {
		if(!checkAlreadyExist(fct)){
            this.functions.add(fct);
            fct.setTableID(this.id);
		}
        else{
            System.err.println("\u001B[31m" + "Line " + tree.getLine() + ":" + tree.getColumn() + " : " + "DoubleDeclarationException: " + fct.getNature() + " " + fct.identifier + " already declared in the same block\u001B[0m\n");
        }
	}
	
	public void addFils(Table fils){
		this.fils.add(fils);
	}

	public boolean checkAlreadyExist(Object var){
		if(var instanceof  VarType){
			for(VarType el : variables){
                if(el.getIdentifiant().equals(((VarType) var).getIdentifiant()) && el.getNature().equals(((VarType) var).getNature())){
                    return true;
				}
			}
			return false;
		}else{
			for(ProcFunc el : functions){
				if(el.getIdentifier().equals(((ProcFunc) var).getIdentifier())){
					return true;
				}
			}
			return false;
		}
	}

	public int getIdpere() {
		return parentId;
    }
    
    public VarType getVarType(String varName) {
        for (VarType myVar : variables) {
            if (myVar.getIdentifiant().equals(varName)) {
                return myVar;
            }
        }
        return null;
    }

   

    public ProcFunc getProcFonc(String funcName) {
        for (ProcFunc myFunc : functions) {
            if (myFunc.getIdentifier().equals(funcName)) {
                return myFunc;
            }
        }
        return null;
    }

    public void afficher(){
        System.out.println(this.toString());
        for(Table fils : this.fils){
            fils.afficher();
        }
    }

    public Table joinTDS(Stack<Table> pile) {
        Table newTDS = this;
        int id = this.parentId;
        while(id != -1) {
            Table tds = searchTDS(pile, id);
            for (VarType var : tds.variables) {
                if(!checkAlreadyExist(var)){
                    newTDS.variables.add(var);
                    var.setTableID(this.id);
                    if (var.getDeplacement() == 0 && var.isLocal()) { // Si own, on a deja la variable ailleurs pas besoin de la mettre dans la pile
                        var.setDeplacement(var_depl);
                        var_depl++;
                    }
                }
            }
            for (ProcFunc proc : tds.functions) {
                if(!checkAlreadyExist(proc)){
                    newTDS.functions.add(proc);
                    proc.setTableID(this.id);
                }
            }
            id=tds.getIdpere();

        }
        return newTDS;
    }

    public void setUsed(Stack<Table> pile, String varName, String nature) {
        //inverse the Stack
        Stack<Table> temp = new Stack<>();
        while(!pile.isEmpty()){
            temp.push(pile.pop());
        }
        for (Table tds : temp) {
            VarType var = tds.getVarType(varName);
            if (var != null && var.getNature().equals(nature)) {
                var.setUsed(true);
                while(!temp.isEmpty()){
                    pile.push(temp.pop());
                }
                return;
            }else{
                ProcFunc proc = tds.getProcFonc(varName);
                if (proc != null) {
                    proc.setUsed();
                    while(!temp.isEmpty()){
                        pile.push(temp.pop());
                    }
                    return;
                }
            }
            
        }
        while(!temp.isEmpty()){
            pile.push(temp.pop());
        }
    }

    public Table searchTDS(Stack<Table> pile, int id) {
        for (Table tds : pile) {
            if (tds.getId() == id) {
                return tds;
            }
        }
        return null;
    }

    public ArrayList<Table> getAllChildren(){
        ArrayList<Table> allChildren = new ArrayList<>();
        allChildren.add(this);
        for (Table fils : this.fils) {
            allChildren.addAll(fils.getAllChildren());
        }
        return allChildren;
    }

}
