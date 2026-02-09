/*
 This program demonstrates the usage of methods and variables
 to define two numeric values and print them.

 Method without parameters and without return type is used,
 namely printNumbers().
*/

class PrintNumericValues
{
    // Method to define and print numbers
    static void printNumbers()
    {
        int firstNumber = 13;   // first numeric value
        int secondNumber = 27;  // second numeric value

        // Printing the values
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        printNumbers();
    }
}
