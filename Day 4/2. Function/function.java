class Demo
{
    public static int add(int x, int y)        // Function
    {
        int r = x + y;
        return r;
    }

    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;

        int result = add(a, b);             // Function Call

        System.out.println("Result: " + result);
    }
}