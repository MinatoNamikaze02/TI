package tds;

import java.util.ArrayList;

public class ProcFunc {
    public String identifier;
    public String nature;
    public String type;
    public int displacement;
    public int tableID;
    public boolean isLocal;
    public ArrayList<VarType> arguments = new ArrayList<VarType>();
    public boolean isUsed;

    public ProcFunc(String identifier, String type, ArrayList<VarType> args) {
        this.identifier = identifier;
        this.type = type;
        if (args != null) {
            this.arguments.addAll(args);
        }
        this.isLocal = true;
        this.displacement = 0;
        if (args == null) {
            this.nature = "procedure";
        } else {
            this.nature = "function";
        }
        this.tableID = -2;
        this.isUsed = false;
    }

    public String toString() {
        String theTypes = "";
        for (Object arg : this.arguments) {
            try {
                VarType var = (VarType) arg;
                theTypes += var.getType() + ", ";
                continue;
            } catch (Exception e) {
            }
            try {
                ProcFunc func = (ProcFunc) arg;
                theTypes += func.getType() + " procedure, ";
                continue;
            } catch (Exception e) {
            }
        }
        if (this.nature.equals("function")) {
            return "| " + String.format("%-10s", this.nature) + " | " + String.format("%-13s", this.identifier) + " | " +
                    String.format("%-9s", this.type) + " | " + String.format("%-7s", this.arguments.size()) + " | " +
                    String.format("%-20s", theTypes) + " | " + String.format("%-14s", this.isUsed);
        } else {
            return "| " + String.format("%-10s", this.nature) + " | " + String.format("%-13s", this.identifier) + " | " +
                    String.format("%-9s", this.type) + " | " + String.format("%-7s", this.arguments.size()) + " | " +
                    String.format("%-14s", this.isUsed);
        }
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

    public ArrayList<VarType> getArguments() {
        return this.arguments;
    }

    public void setArguments(VarType arg) {
        this.arguments.add(arg);
    }

    public boolean isLocal() {
        return this.isLocal;
    }

    public boolean isUsed() {
        return this.isUsed;
    }

    public void setUsed() {
        this.isUsed = true;
    }
}
