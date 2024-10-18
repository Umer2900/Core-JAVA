/*
    **String method**

    A String method in Java is a predefined function in the String class that enables manipulation and processing of string objects.These methods perform operations like concatenation, comparison, and extraction of substrings, allowing developers to efficiently handle string data.

*/

class Demo
{
    public static void main(String[] args)
    {
        String name = "Umer";             

        System.out.println(name.charAt(1));         // m

        System.out.println(name.indexOf("m"));         // 1     :  Returns the index of the first occurrence of the specified substring
        
        System.out.println(name.lastIndexOf("U"));     // 0     :  Returns the index of the last occurrence of the specified substring

        System.out.println(name.substring(1));       // mer

        System.out.println(name.substring(1, 3));    // me

        System.out.println(name.length());           // 4

        System.out.println(name.toUpperCase());      // UMER

        System.out.println(name.toLowerCase());      // umer

        System.out.println(name.replace('U', 'A'));                // Amer

        System.out.println(name.replaceAll("mer", "jor"));         // Ujor

        System.out.println(name.concat(" Jan"));        // Umer Jan

        System.out.println(name);                       // Umer

    }
}

// NOTE : the original String does not changed.