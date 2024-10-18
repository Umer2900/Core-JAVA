/*
    ** STRING**

    In Java, a String is a class that represents an immutable sequence of characters. 
    Although String is a class, Java provides a special way to create **String objects** without using the new keyword, thanks to string literals.

    - When a String object is created as a literal, the String object will point to the special memory area called String pool,
      where it implicitly created a String object in the String pool 
      and identical values are reused for memory efficiency.

    - When a String object is created with the new keyword, the String object will point to heap memory,
      where it explicitly creates a separate String object in the heap memory, bypassing the pool.

*/

class Demo
{
    public static void main(String[] args)
    {
        // String name = new String("Umer");    // Created in the heap
        // or
        String name = "Umer";                   // Stored in the String pool

        System.out.println(name + " Jan");
    }
}

