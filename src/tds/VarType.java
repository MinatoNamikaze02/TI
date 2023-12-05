package tds;

import java.util.ArrayList;

public class VarType{
    public String identifier;
    public String nature;
    public String type;
    public int deplacement;
    public int tableID;
    public boolean isLocal;
    public ArrayList<String> elementtype;
    public String taille;
    public boolean initialized;
    public boolean isUsed;
    public int ligneDeclaration;
    public int colonneDeclaration;



    public VarType(String identifiant1, String type,String nature,int ligne,int colonne){
        this.identifier= identifiant1;
        this.type = type;
        this.deplacement=0;
        this.isLocal=true;
        this.nature = nature;
        this.tableID= -2;
        this.elementtype=null;
        this.taille="1";
        this.initialized=true;
        this.isUsed=false;
        this.ligneDeclaration=ligne;
        this.colonneDeclaration=colonne;

    }
    public VarType(String identifiant, String type,String nature,String taille,int ligne,int colonne){
        this.identifier= identifiant;
        this.type = type;
        this.deplacement=0;
        this.isLocal=true;
        this.nature = nature;
        this.tableID= -2;
        this.elementtype=null;
        this.taille=taille;
        this.initialized=true;
        this.isUsed=false;
        this.ligneDeclaration=ligne;
        this.colonneDeclaration=colonne;

    }
    public VarType(String identifiant, String type,String nature,ArrayList<String> elementtype,int ligne,int colonne){
        this.identifier= identifiant;
        this.type = type;
        this.deplacement=0;
        this.isLocal=true;
        this.nature = nature;
        this.tableID= -2;
        this.elementtype= elementtype;
        this.taille="1";
        this.initialized=true;
        this.isUsed=false;
        this.ligneDeclaration = ligne;
    }
    public VarType(String identifiant, String type,String nature,ArrayList<String> elementtype,String taille,int ligne,int colonne){
        this.identifier= identifiant;
        this.type = type;
        this.deplacement=0;
        this.isLocal=true;
        this.nature = nature;
        this.tableID= -2;
        this.elementtype= elementtype;
        this.taille=taille;
        this.initialized=true;
        this.isUsed=false;
        this.ligneDeclaration = ligne;
        this.colonneDeclaration = colonne;
    }
    public String toString(){
        String the_types = "";
        if (elementtype!=null){
            for (String i : this.elementtype) {
                the_types+=i;
            }
        }
        if (this.nature=="Type"){
            return "| "+ String.format("%-6s", this.nature) + " | " + String.format("%-13s", this.identifier) + " | " + String.format("%-9s", this.type)
            + " | "  + String.format("%-12s", this.deplacement)+ " | "+ String.format("%-14s", this.isUsed)+ " | "  + String.format("%-12s", this.taille)+ " | "  + String.format("%-15s", the_types);
        }
        else{
            if(this.identifier.contains(".")){
                String id ="\033[95m"+identifier.substring(0,identifier.indexOf("."))+"\033[0m"+identifier.substring(identifier.indexOf("."),identifier.length());
                return "| "+ String.format("%-6s", this.nature) + " | " + String.format("%-22s",id) + " | " + String.format("%-9s", this.type) 
        + " | "  + String.format("%-12s", this.deplacement)+ " | "  + String.format("%-14s", this.initialized)+ " | "+ String.format("%-14s", this.isUsed)+ " | "  + String.format("%-12s", this.taille);
            }
            else{return "| "+ String.format("%-6s", this.nature) + " | " + String.format("%-13s", this.identifier) + " | " + String.format("%-9s", this.type)
        + " | "  + String.format("%-12s", this.deplacement)+ " | "  + String.format("%-14s", this.initialized)+ " | "+ String.format("%-14s", this.isUsed)+ " | "  + String.format("%-12s", this.taille);

        }
    }
    }

    public ArrayList<String> getElementtype() {
        return this.elementtype;
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

    public String getTaille(){
        return this.taille;
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

    public boolean isLocal(){
        return this.isLocal;
    }

    public boolean initialized(){
        return this.initialized;
    }

    public boolean isUsed(){
        return this.isUsed;
    }

    public void setUsed(boolean isUsed){
        this.isUsed=isUsed;
    }

    public int getLigneDeclaration(){
        return this.ligneDeclaration;
    }

    public int getColonneDeclaration(){
        return this.colonneDeclaration;
    }

}
