/* Ternary Operator */
// condition ? expression_if_true : expression_if_false

class Demo
{
    public static void main(String[] args)
    {
        int a = 7;

        // (a > 10) ? System.out.println("Hello World") : System.out.println("bye");

        // ERROR : because the ternary operator in Java is meant for expressions that return values, 
        // and System.out.println() is a statement, not an expression.

         String message = (a > 10) ? "Hello World" : "bye";
         System.out.println(message);
    }
}


