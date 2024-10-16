/*
    **Method Overloading**
    is a feature in object-oriented programming that allows a class to have multiple methods with the same name 
    but different parameter lists (type, number, or both).
*/

class Calculator
{
    public int add(int x, int y)
    {
        return x + y;
    }

    public int add(int x, int y, int z)
    {
        return x + y + z;
    }

   public double add(double x, double y)
   {
        return x + y;
   }
        
}

class Demo
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;
        int c = 6;

        Calculator obj = new Calculator();

        int result = obj.add(a, b, c);

        System.out.println("Result: " + result);
    }
}