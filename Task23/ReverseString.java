/*
 This program defines a string value
 and reverses the string.

 Method without parameters and without return type
 is used, namely reverseString().
*/

class ReverseString
{
    // Method to reverse and print the string
    static void reverseString()
    {
        String text = "HELLO";   // string value
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--)
        {
            reverse = reverse + text.charAt(i);
        }

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reverse);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        reverseString();
    }
}