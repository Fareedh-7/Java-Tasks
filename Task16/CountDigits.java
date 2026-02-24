/*
 This program defines a numeric value
 and counts how many digits it contains.

 Method without parameters and without return type
 is used, namely countDigits().
*/

class CountDigits
{
    // Method to count and print number of digits
    static void countDigits()
    {
        int number = 98765;   // numeric value
        int count = 0;

        while (number != 0)
        {
            number = number / 10;
            count++;
        }

        System.out.println("Total number of digits: " + count);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        countDigits();
    }
}