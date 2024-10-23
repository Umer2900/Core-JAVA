/*
  **When you create an object in Java, the following occurs:**

  1. Class Loading: JVM will load the class.
  2. Memory Allocation: The JVM allocates memory for the new object.
  3. Constructor Execution: If you have defined a constructor (with or without parameters), the appropriate constructor is executed,


   Q, BUT What if user just wanna load the class and not the constructor, how will he do it?

   You can load a class using the Class.forName() method without creating an instance of that class.
*/

class Mobile
{
    String brand;              
    int price;
    static String name;   

    static
    {
        name = "Smartphone";
        System.out.println("I am in Static Block");    
    }     

    public Mobile()
    {
        brand = "";
        price = 100;
        System.out.println("I am in Constructor");   
    }
}

class Demo
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Mobile");          // It will load the class only

        // Mobile obj1 = new Mobile();
        // Mobile obj2 = new Mobile();
    }
}