/* Data Types */

class Solution
{
    public static void main(String a[])
    {
        long num3 = 2987l;      // 8 bytes
        int num1 = 2;           // 4 bytes
        short num2 = 4;         // 2 bytes
        byte num4 = 126;        // 1 byte  -->  -128 to 128

        float num5 = 5.8f;      //  4 bytes 
        double num6 = 5.89;     // 8 bytes  --> by default in JAVA

        char c = '9';           // 2 bytes  -->  follows UNICODE

        boolean b = true;       // true or false

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println(num5);
        System.out.println(num6);

        System.out.println(c);

        System.out.println(b);
    }    
}
