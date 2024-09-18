import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ExpressionParser
        ExpressionParser parser = new SpelExpressionParser();

        // Create and configure StandardEvaluationContext
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("sku", "ITEM001"); // Set context variable without quotes

        // Expression to be evaluated
        String expression = "sku == 'ITEM001'"; // Use single quotes around ITEM001

        // Parse and evaluate the expression
        Boolean result = parser.parseExpression(expression).getValue(context, Boolean.class);

        // Output the result
        System.out.println("Expression evaluated result: " + result);
    }
}
