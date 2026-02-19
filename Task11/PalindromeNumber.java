/*
 This program defines a numeric value
 and checks whether it is a palindrome number.

 Method without parameters and without return type
 is used, namely checkPalindrome().
*/

class PalindromeNumber
{
    // Method to check and print whether number is palindrome
    static void checkPalindrome()
    {
        int number = 121;   // numeric value
        int originalNumber = number;
        int reverse = 0;

        while (number != 0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverse)
        {
            System.out.println(originalNumber + " is a Palindrome Number");
        }
        else
        {
            System.out.println(originalNumber + " is not a Palindrome Number");
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        checkPalindrome();
    }
}
