package tds;

public class Array {
    public String identifier;
    public String nature;
    public String type;
    public int displacement;
    public int tableID;
    public boolean isLocal;
    public int start;
    public int end;
    public String elementType;

    public Array(String identifier, String type, String elementType, int start, int end) {
        this.identifier = identifier;
        this.type = type;
        this.elementType = elementType;
        this.isLocal = true;
        this.displacement = 0;
        this.nature = "array";
        this.start = start;
        this.end = end;
        this.tableID = -2;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNature() {
        return this.nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getElementType() {
        return this.elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getTableID() {
        return this.tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isLocal() {
        return this.isLocal;
    }
}
