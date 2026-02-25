/*
 This program defines a numeric value (N)
 and finds the sum of first N natural numbers.

 Method without parameters and without return type
 is used, namely findSum().
*/

class SumOfNaturalNumbers
{
    // Method to calculate and print sum
    static void findSum()
    {
        int n = 10;   // numeric value
        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findSum();
    }
}