/* Relational Operators */

class Demo
{
    public static void main(String[] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean first = x > y;            // true
        System.out.println(first);

        boolean note = x > y;            
        System.out.println(!note);        // false

        boolean second = x > y && a > b;
        System.out.println(second);       // false

        boolean third = x > y || a > b;
        System.out.println(third);       // true

    }
}




