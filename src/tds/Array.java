package tds;

public class Array{
    public String identifiant;
    public String nature;
    public String type;
    public int deplacement;
    public int tableID;
    public boolean isLocal;
    public int debut;
    public int fin;
    public String type_elt;


    public Array(String identifiant ,String type, String type_elt, int debut, int fin){
        this.identifiant=identifiant;
        this.type=type;
        this.type_elt =type_elt;
        this.isLocal=true;
        this.deplacement=0;
        this.nature = "array";
        this.debut =debut;
        this.fin=fin;
        this.tableID= -2;
    }

    public String getIdentifiant(){
        return this.identifiant;
    }
    public void setIdentifiant(String identifiant){
        this.identifiant=identifiant;
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

    public String getType_elt(){
        return this.type_elt;
    }
    public void setType_elt(String type_elt){
        this.type_elt=type_elt;
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

    public int getDebut(){
        return this.debut;
    }
    public void setDebut(int debut){
        this.debut=debut;
    }

    public int getFin(){
        return this.fin;
    }
    public void setFin(int fin){
        this.fin=fin;
    }

    public boolean isLocal(){
        return this.isLocal;
    }



}