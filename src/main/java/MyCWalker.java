import antlr.MyCBaseListener;
import antlr.MyCParser;

public class MyCWalker extends MyCBaseListener {
    public void enterProg(MyCParser.ProgContext context) {
        if (context.prog() != null)
            System.out.println("Entering prog:" + context.prog().getText());
        else
            System.out.println("Enter is end");
    }

    public void exitProg(MyCParser.ProgContext context) {
        System.out.println("Exiting prog");
    }
}
