/*
 This program defines two numeric values
 and prints their sum.

 Method without parameters and without return type
 is used, namely addNumbers().
*/

class AddTwoNumbers
{
    // Method to add and print sum of two numbers
    static void addNumbers()
    {
        int firstNumber = 10;   // first value
        int secondNumber = 20;  // second value

        int sum = firstNumber + secondNumber;

        // Printing the result
        System.out.println("Sum = " + sum);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        addNumbers();
    }
}
