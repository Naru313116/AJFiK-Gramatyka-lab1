import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _symbols.setDecimalSeparator('.');
        _symbols.setGroupingSeparator(Character.MIN_VALUE);
        _format.setDecimalFormatSymbols(_symbols);
    }

    static double parse(String text) throws ParseException {
        return _format.parse(text).doubleValue();
    }

    public static void main(String[] args) {
        String input;
        out.println("Key in the input string:");
        try (Scanner reader = new Scanner(System.in)) {
            input = reader.nextLine();
        }

        CharStream charStream = CharStreams.fromString(input);
        StringOpLexer lexer = new StringOpLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        StringOpParser parser = new StringOpParser(tokenStream);
        //parser.removeErrorListeners();
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();
        int errors = parser.getNumberOfSyntaxErrors();

        out.println("Number of syntax errors: " + errors);
        out.println(tree.toStringTree(parser));

        if (0 == errors) {
            NewVisitor visitor = new NewVisitor();
            try {
                Object result = visitor.visit(tree);
                out.println("Result = " + result.toString());
            } catch (NullPointerException e) {
                out.println("Wyrazenie wykonało się niepoprawnie -> brak wyniku");
            }
        }
    }
}
