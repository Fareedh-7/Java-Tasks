/*
 This program defines two numeric values
 and performs basic arithmetic operations.

 Method without parameters and without return type
 is used, namely calculator().
*/

class SimpleCalculator
{
    // Method to perform calculations
    static void calculator()
    {
        int firstNumber = 20;   // first value
        int secondNumber = 5;   // second value

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        calculator();
    }
}