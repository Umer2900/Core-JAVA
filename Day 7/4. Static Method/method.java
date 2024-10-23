/*
    **Static Method**
    A method that belongs to the class, callable without creating an object directly by the class name, & can only access static members (that also means objects can not access the Static method Directly).

*/

class Mobile
{
    String brand;              
    int price;
    static String name;         // static Varaible

    static                      // Static Block
    {
        name = "Smartphone";
        System.out.println("I am in Static Block");    
    }     

    public static void show1()                   // static Method
    {                                         
        System.out.println("I am in static Method");
    }
    
    /*
    public static void show2()                   
    {                                         
         System.out.println(brand + " : " + price + " : " + name);    
         
         // it will not work because JVM dont know to which object this non-static members belong to.
    }
    */

   public static void show2(Mobile obj)                   
    {                                         
         System.out.println(obj.brand + " : " + obj.price + " : " + name);    
    }
    
}

class Demo
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 60000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 30000;

        Mobile.show1();         // calling static method directly with the class name

        Mobile.show2(obj1);      // objects can access the static Method indirectly.
        
    }
}