package semantic;

import java.util.ArrayList;

import tds.Table;

public class Utilisation {

    public static void CheckUtilisation(Table tds) {
        ArrayList<Table> tables = tds.getAllChildren();
        for (int i = 0; i < tables.size(); i++) {
            Table t = tables.get(i);
            for (int j = 0; j < t.variables.size(); j++) {
                if (t.variables.get(j).isUsed() == false) {
                    System.err.println("\033[0;33m" + "Line " + t.variables.get(j).getLigneDeclaration() + ":" + t.variables.get(j).getColonneDeclaration() + " : " + "Utilization Warning in " + t.name + " : " + t.variables.get(j).getNature() + " " + t.variables.get(j).identifier + " non utilisé(e)\u001B[0m\n");
                }
            }
            for (int j = 0; j < t.functions.size(); j++) {
                if (t.functions.get(j).isUsed() == false) {
                    System.err.println("\033[0;33m" + "Line " + t.variables.get(j).getLigneDeclaration() + ":" + t.variables.get(j).getColonneDeclaration() + " : " + "Usage Warning in " + t.name + " : Function " + t.functions.get(j).identifier + " not used\u001B[0m\n");
                }
            }

        }

    }
}