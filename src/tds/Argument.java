package tds;

public class Argument{
    public String type;
    public String name;

    public Argument(String name, String type){
        this.name=name;
        this.type=type;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String nom){
        this.name=name;
    }


}