import antlr.MyCBaseListener;
import antlr.MyCParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

class variable {
    public int val = 0;
    public String name = "";

    public variable(int val, String name) {
        this.val = val;
        this.name = name;
    }
};

public class MyCWalker extends MyCBaseListener {
    ArrayList<variable> variables = new ArrayList<variable>();
    String lastName = "";
    int result = 0;
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    boolean isExec = true;
    boolean goTrueIf = false;

    private variable findVariableByName(String name) {
        for (variable var : variables)
            if (var.name.equals(name))
                return var;
        return null;
    }


    public void enterProg(MyCParser.ProgContext context) {
        if (context.prog() != null)
            System.out.println("Entering prog:" + context.prog().getText());
        else {
            System.out.println("Enter is end");

            for (variable var : variables) {
                System.out.println(var.name + " = " + var.val);
            }
        }
    }

    @Override
    public void enterMay_else(MyCParser.May_elseContext ctx) {
        super.enterMay_else(ctx);
        isExec = true;
        if (goTrueIf) {
            isExec = false;
        }
    }

    @Override
    public void exitMay_else(MyCParser.May_elseContext ctx) {
        super.exitMay_else(ctx);
        if (goTrueIf) {
            isExec = true;
        }
    }

    @Override
    public void enterIfGrammar(MyCParser.IfGrammarContext ctx) {
        super.enterIfGrammar(ctx);
        isExec = true;
        if (resultExpresssion(ctx.expression()) > 0) {
            goTrueIf = true;
        } else {
            goTrueIf = false;
            isExec = false;
        }
    }

    @Override
    public void enterVariable(MyCParser.VariableContext ctx) {
        super.enterVariable(ctx);
        try {
            if (isExec) {
                lastName = ctx.Ident().toString();
                variables.add(new variable(0, ctx.Ident().toString()));
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void exitAssign(MyCParser.AssignContext ctx) {
        super.exitAssign(ctx);
        if (isExec) {
            findVariableByName(ctx.id_intern_elem().Ident().toString().substring(1, ctx.id_intern_elem().Ident().toString().length() - 1)).val = resultExpresssion(ctx.expression());
        }
    }

    public int getLastChildNum(ParseTree ctx) {
        try {
            try {
                return findVariableByName(ctx.toString()).val;
            } catch (Exception e) {
                return Integer.parseInt(ctx.toString());
            }
        } catch (Exception e) {
            return getLastChildNum(ctx.getChild(0));
        }
    }

    public int testSimpleNum(ParseTree ctx) {
        try {
            return Integer.parseInt(ctx.toString());
        } catch (Exception e) {
            return Integer.MIN_VALUE;
        }
    }

    public int resultExpresssion(ParseTree ctx) {
        if (ctx.getChildCount() == 1)
            return resultExpresssion(ctx.getChild(0));
        else {
            int testSimple = testSimpleNum(ctx);
            if (testSimple != Integer.MIN_VALUE)
                return testSimple;
            int result = ctx.getChild(0).getChildCount() > 1 ? resultExpresssion(ctx.getChild(0)) : getLastChildNum(ctx.getChild(0));
            for (int i = 1; i < ctx.getChildCount(); i += 2) {
                int secNum = ctx.getChild(i + 1).getChildCount() > 1 ? resultExpresssion(ctx.getChild(i + 1)) : getLastChildNum(ctx.getChild(i + 1));
                result = resultOper(result,
                        secNum, ctx.getChild(i).toString());
            }
            return result;
        }
    }

    public int resultOper(int first, int second, String oper) {
        if ("+".equals(oper)) {
            return first + second;
        } else if ("-".equals(oper)) {
            return first - second;
        } else if ("||".equals(oper)) {
            return first != 0 || second != 0 ? 1 : 0;
        } else if ("&&".equals(oper)) {
            return first != 0 && second != 0 ? 1 : 0;
        } else if ("==".equals(oper)) {
            return first == second ? 1 : 0;
        } else if (">".equals(oper)) {
            return first > second ? 1 : 0;
        } else if ("<".equals(oper)) {
            return first < second ? 1 : 0;
        } else if (">=".equals(oper)) {
            return first >= second ? 1 : 0;
        } else if ("<=".equals(oper)) {
            return first <= second ? 1 : 0;
        } else if ("*".equals(oper)) {
            return first * second;
        } else if ("/".equals(oper)) {
            return first / second;
        } else if ("%".equals(oper)) {
            return first % second;
        } else {
            return 0;
        }
    }
}
