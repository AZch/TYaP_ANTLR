import antlr.MyCLexer;
import antlr.MyCParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCLexer myCLexer = new MyCLexer(CharStreams.fromString(readData("/home/az/IdeaProjects/TYaP_ANTLR/src/main/java/test.c")));

        CommonTokenStream tokenStream = new CommonTokenStream(myCLexer);
        MyCParser myCParser = new MyCParser(tokenStream);
        ParseTree parseTree = myCParser.prog();
        CVisitor cVisitor = new CVisitor();
        cVisitor.visit(parseTree);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new MyCWalker(), parseTree);


        TokenStream tokens = new CommonTokenStream(myCLexer);
        myCParser = new MyCParser(tokenStream);

        cVisitor = new CVisitor();
        cVisitor.visit(parseTree);
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

/*
int b=5*2;

class ad {
int aa;
char bC;
};


void main() {
ad c;
c.aa=45;
c.aa=45;
int a;
a=3*((4+c.aa)-(7/9))-(16*10)+99;

if(a+15>0){
c.aa=40;
int AA=7;
int b=10+AA;
if(c.aa>c.bC)
c.bC=32;
if(AA>b){
int AAAA=5;
AAAA=(32*3)+84;
}
}else{
c.aa=40;
int ACAB=808;
ACAB=90+52;
}

a=3*((4+5)-(7/9))-(16*10)+99;
a=c.aa;


}
###
* */