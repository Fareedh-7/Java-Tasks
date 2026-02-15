/*
 This program defines a numeric value
 and finds its factorial.

 Method without parameters and without return type
 is used, namely findFactorial().
*/

class Factorial
{
    // Method to calculate and print factorial
    static void findFactorial()
    {
        int number = 5;   // numeric value
        int factorial = 1;

        for (int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findFactorial();
    }
}
