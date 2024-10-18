/* 
    **Explicit Strings**
    When you create a String using the new keyword, is called Explicit Strings.

    - When a String object is created with the new keyword, the String object will point to heap memory,
      where it explicitly creates a separate String object in the heap memory, bypassing the pool.
*/

class Demo
{
    public static void main(String[] args)
    {
        String s1 = new String("Umer");             // Stored in the String pool
        String s2 = new String("Umer");             // Stored in the String pool

        System.out.println(s1 == s2);               // false
    }
}