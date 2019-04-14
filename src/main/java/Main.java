import antlr.MyCLexer;
import antlr.MyCParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCLexer myCLexer = new MyCLexer(CharStreams.fromString(readData("/home/az/IdeaProjects/TYaP_ANTLR/src/main/java/test.c")));

        CommonTokenStream tokenStream = new CommonTokenStream(myCLexer);
        MyCParser myCParser = new MyCParser(tokenStream);
        ParseTree parseTree = myCParser.prog();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new MyCWalker(), parseTree);
    }

    private static String readData(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader fileLoad = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "UTF-8"
        ));
        String result = "";
        int symbol = fileLoad.read();
        while (symbol != -1) {
            result += (char) symbol;
            symbol = fileLoad.read();
        }
        result += "###";
        return result;
    }
}
