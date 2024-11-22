class Demo 
{
    public static void main(String[] args) 
    {
        if (args.length != 1) {
            System.out.println("Please provide a number to calculate its factorial.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        
        // Calculate the factorial 
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
