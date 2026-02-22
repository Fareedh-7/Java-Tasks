/*
 This program defines two numeric values
 and finds their Greatest Common Divisor (GCD).

 Method without parameters and without return type
 is used, namely findGCD().
*/

class GCDProgram
{
    // Method to calculate and print GCD
    static void findGCD()
    {
        int firstNumber = 48;   // first value
        int secondNumber = 18;  // second value

        int gcd = 1;

        for (int i = 1; i <= firstNumber && i <= secondNumber; i++)
        {
            if (firstNumber % i == 0 && secondNumber % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findGCD();
    }
}