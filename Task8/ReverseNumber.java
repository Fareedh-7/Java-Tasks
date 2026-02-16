/*
 This program defines a numeric value
 and reverses the number.

 Method without parameters and without return type
 is used, namely reverseNumber().
*/

class ReverseNumber
{
    // Method to reverse and print the number
    static void reverseNumber()
    {
        int number = 1234;   // numeric value
        int reverse = 0;

        while (number != 0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number is: " + reverse);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        reverseNumber();
    }
}
