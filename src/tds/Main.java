package tds;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import lexer.Lexertiger;
import parser.Parsertiger;
import parser.Parsertiger.ProgramContext;
import ast.*;
import semantic.Utilisation;

public class Main {

    public static void main(String[] args){

        // Commented out code for processing command-line arguments
        // Expected 1 argument (file path), but found 0
        /*
        if (args.length < 1){
            System.out.println("Error : Expected 1 argument filepath, found 0");
            return;
        }

        String testFile = args[0];
        */

        try {

            // Loading the file and constructing the parser
            CharStream input = CharStreams.fromFileName("/Users/arjuns/IdeaProjects/TigerCompilerDesign/examples/type_err.tig");
            Lexertiger lexer = new Lexertiger(input);
            CommonTokenStream stream = new CommonTokenStream(lexer);
            Parsertiger parser = new Parsertiger(stream);

            ProgramContext program = parser.program();

            // AST creation visitor + AST creation
            AstCreator creator = new AstCreator();
            Ast ast = program.accept(creator);

            // Symbol table creation visitor + Symbol table creation
            SymbolTable tdscreator = new SymbolTable();
            ast.accept(tdscreator);

            // Control the usage of variables and functions
            Utilisation.CheckUtilisation(tdscreator.getTds());

            // Display the TDS
            tdscreator.display();

            // Print all errors
            while(!tdscreator.exceptions.isEmpty()){
                System.err.println(tdscreator.exceptions.pop().getMessage());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        }


    }

}
