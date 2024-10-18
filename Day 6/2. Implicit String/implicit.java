/* 
    **Implicit Strings**
    When you create a String using a literal, is called Implicit Strings.

    - When a String object is created as a literal, the String object will point to the special memory  
      area called String pool, where it implicitly created a String object in the String pool 
      and identical values are reused for memory efficiency.
    
*/

class Demo
{
    public static void main(String[] args)
    {
        String s1 = "Umer";                   // Stored in the String pool
        String s2 = "Umer";                   // Stored in the String pool

        System.out.println(s1 == s2);        // true
    }
}


/*
    In this both object created are same because they are pointing to the String pool, 
    where identical values are reused for memory efficiency.
*/