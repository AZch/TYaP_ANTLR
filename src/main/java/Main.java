import antlr.MyCLexer;
import antlr.MyCParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCLexer myCLexer = new MyCLexer(CharStreams.fromString(
                "int b=5*2;\n" +
                "\n" +
                "class ad {\n" +
                "int aa;\n" +
                "char bC;\n" +
                "};\n" +
                "\n" +
                "\n" +
                "void main() {\n" +
                "ad c;\n" +
                "c.aa=45;\n" +
                "c.aa=45;\n" +
                "int a;\n" +
                "a=3*((4+c.aa)-(7/9))-(16*10)+99;\n" +
                "\n" +
                "if(a+15>0){\n" +
                "c.aa=40;\n" +
                "int AA=7;\n" +
                "int b=10+AA;\n" +
                "if(c.aa>c.bC)\n" +
                "c.bC=32;\n" +
                "if(AA>b){\n" +
                "int AAAA=5;\n" +
                "AAAA=(32*3)+84;\n" +
                "}\n" +
                "}else{\n" +
                "c.aa=40;\n" +
                "int ACAB=808;\n" +
                "ACAB=90+52;\n" +
                "}\n" +
                "\n" +
                "a=3*((4+5)-(7/9))-(16*10)+99;\n" +
                "a=c.aa;\n" +
                "\n" +
                "\n" +
                "}"));

        CommonTokenStream tokenStream = new CommonTokenStream(myCLexer);
        MyCParser myCParser = new MyCParser(tokenStream);
        ParseTree parseTree = myCParser.prog();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new MyCWalker(), parseTree);
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
 */
