/*
 This program defines a numeric value
 and finds the sum of its digits.

 Method without parameters and without return type
 is used, namely findSumOfDigits().
*/

class SumOfDigits
{
    // Method to calculate and print sum of digits
    static void findSumOfDigits()
    {
        int number = 1234;   // numeric value
        int sum = 0;

        while (number != 0)
        {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits is: " + sum);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findSumOfDigits();
    }
}