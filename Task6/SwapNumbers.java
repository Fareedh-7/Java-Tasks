/*
 This program defines two numeric values
 and swaps their values.

 Method without parameters and without return type
 is used, namely swapNumbers().
*/

class SwapNumbers
{
    // Method to swap two numbers
    static void swapNumbers()
    {
        int firstNumber = 5;    // first value
        int secondNumber = 10;  // second value

        System.out.println("Before Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);

        // Swapping logic
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        swapNumbers();
    }
}
