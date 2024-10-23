/*
**Static Block** 
A block of code that initializes static variables, executed once when the class is loaded into memory, before any objects are created. 
As opposed to constructors, which run each time an object is instantiated.

*/

class Mobile
{
    String brand;              
    int price;
    static String name;   

    static                      // Static Block
    {
        name = "Smartphone";
        System.out.println("I am in Static Block");    // it will be called only once
    }     

    public Mobile()
    {
        brand = "";
        price = 100;
        System.out.println("I am in Constructor");   // called depends on number of objects
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        
    }
}