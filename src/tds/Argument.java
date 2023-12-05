package tds;

public class Argument{
    public String type;
    public String  nom;

    public Argument(String nom, String type){
        this.nom=nom;
        this.type=type;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }


}