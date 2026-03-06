/*
 This program defines two numeric values
 and finds the largest number.

 Method without parameters and without return type
 is used, namely findLargest().
*/

class LargestNumber
{
    // Method to find and print the largest number
    static void findLargest()
    {
        int firstNumber = 45;   // first value
        int secondNumber = 30;  // second value

        if (firstNumber > secondNumber)
        {
            System.out.println("Largest number is: " + firstNumber);
        }
        else if (secondNumber > firstNumber)
        {
            System.out.println("Largest number is: " + secondNumber);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findLargest();
    }
}
