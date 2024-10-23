/*
    **Static Keyword**
The static keyword in Java indicates that you are making particular member (variable or method) as a class member & not a object member.

    **Static Variable**
A static variable is a class-level variable that is shared among all objects (instance) of the class. 
Static variables are useful for maintaining common properties or states across all objects of the class.
It can be accessed directly using the class name.

    **Static Method**
A method that belongs to the class, callable without creating an object directly by the class name, & can only access static members (that also means objects can not access the Static method Directly).

    **Static Block** 
A block of code that initializes static variables, executed once when the class is loaded into memory, before any objects are created. As opposed to constructors, which run each time an object is instantiated.

*/
class Mobile
{
    String brand;               // Object/Instance Variable
    int price;
    static String name;        // Static Variable

    public void show()
    {                                        // Variable inside the method is called Local Variable 
        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Demo
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 60000;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 30000;
        Mobile.name = "Smartphone";

        obj1.show();
        obj2.show();
    }
}