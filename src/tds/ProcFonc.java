package tds;
import java.util.ArrayList;

public class ProcFonc{
    public String identifier;
    public String nature;
    public String type;
    public int deplacement;
    public int tableID;
    public boolean isLocal;
    public ArrayList<VarType> arguments = new ArrayList<VarType>();
    public boolean isUsed;

    public ProcFonc(String identifiant, String type, ArrayList<VarType> args ){
        this.identifier=identifiant;
        this.type=type;
        if (args!=null){
            this.arguments.addAll(args);
        }
        this.isLocal=true;
        this.deplacement=0;
        if (args==null){
            this.nature = "procedure";
        }
        else{
            this.nature = "fonction";
        }
        this.tableID= -2;
        this.isUsed=false;
    }

    public String toString(){
        String the_types = "";
        for (Object arg : this.arguments) {
            try {
                VarType var = (VarType) arg;
                the_types += var.getType() + ", ";
                continue;
            }
            catch (Exception e) {
            }
            try {
                ProcFonc func = (ProcFonc) arg;
                the_types += func.getType() + " procedure, ";
                continue;
            }
            catch (Exception e) {
            }
        }
        if (this.nature=="fonction"){
            return "| " + String.format("%-10s", this.nature) + " | "+ String.format("%-13s", this.identifier) + " | " + String.format("%-9s", this.type) + " | "
            + String.format("%-7s", this.arguments.size()) + " | " + String.format("%-20s", the_types)+ " | "  + String.format("%-14s", this.isUsed);
        }
        else{return "| " + String.format("%-10s", this.nature) + " | "+ String.format("%-13s", this.identifier) + " | " + String.format("%-9s", this.type) + " | "
        + String.format("%-7s", this.arguments.size()) + " | "  + String.format("%-14s", this.isUsed);

        }
    }

    public String getIdentifiant(){
        return this.identifier;
    }
    public void setIdentifiant(String identifiant){
        this.identifier=identifiant;
    }

    public String getNature(){
        return this.nature;
    }
    public void setNature(String nature){
        this.nature=nature;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }

    public int getDeplacement(){
        return this.deplacement;
    }
    public void setDeplacement(int deplacement){
        this.deplacement=deplacement;
    }

    public int getTableID(){
        return this.tableID;
    }
    public void setTableID(int tableID){
        this.tableID=tableID;
    }

    public ArrayList<VarType> getArguments(){
        return this.arguments;
    }
    public void setArguments(VarType arg){
        this.arguments.add(arg);
    }

    public boolean isLocal(){
        return this.isLocal;
    }

    public boolean isUsed(){
        return this.isUsed;
    }

    public void setUsed(){
        this.isUsed=true;
    }

}