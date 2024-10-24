import java.util.Stack;

public class Interpreter {
    public static int interpret(String input) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = input.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-")) {
                Expression right = stack.pop();
                Expression left = new NumberExpression(Integer.parseInt(tokens[++i]));
                stack.push(new OperationExpression(left, right, token.charAt(0)));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop().interpret();
    }

    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        int result = interpret(expression);
        System.out.println("Result: " + result);
    }
}
