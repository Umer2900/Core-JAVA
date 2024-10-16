/* 

    **Class** 
    A class is a blueprint for creating objects. 
    It can contain fields (variables) and methods (functions) to define its behavior. 

    **Object** 
    An object is an instance (occurrence) of a class. It is created from a class blueprint and can access the class's methods and variables.


     -EXAMPLE 
    Class (Design):
    Think of the iPhone's design (the blueprint) created in California as the class. 
    This design defines the attributes (like screen size, battery capacity) and behaviors (like taking photos, making calls) 
    that an iPhone will possess.

    Object (Actual Thing):
    The iPhones made in China are like objects that are actual, real products that people can hold, use, & buy, that are built from the design (class).
    These objects have unique values, like their serial numbers or different colors (even though they come from the same blueprint).


*/



class Calculator                                // Class
{
    public static int add(int x, int y)
    {
        int r = x + y;
        return r;
    }
}

class Demo
{
    public static void main(String[] args)
    {
        int a = 2;      // Primitive Variable
        int b = 4;

        Calculator obj = new Calculator();        // Object : Reference Variable    
                                                 // JVM creates the object 'obj'
        int result = obj.add(a, b);

        System.out.println("Result: " + result);


    }
}



/*
    **Object Creation Process in Java**

    1- Class Definition: First, you define a class (the blueprint) in your Java code. This class specifies the attributes and behaviors that objects created from it will have.

    2- Compilation: The Java compiler (javac) converts your source code (.java file) into bytecode (.class file). This bytecode is platform-independent and is what the JVM uses to run your program.

    3- JVM Execution: When you run your program, the JVM:

        ~Loads the compiled bytecode into memory.
        ~Executes the code, which includes creating objects.

    4- Object Creation: When you use the new keyword in Java, the JVM allocates memory for the object on the heap and initializes it according to the class definition. The JVM handles all the details of object creation, such as memory management, initializing default values, and calling the constructor
*/