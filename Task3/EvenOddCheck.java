/*
 This program defines a numeric value
 and checks whether it is even or odd.

 Method without parameters and without return type
 is used, namely checkEvenOdd().
*/

class EvenOddCheck
{
    // Method to check even or odd
    static void checkEvenOdd()
    {
        int number = 25;   // numeric value

        if (number % 2 == 0)
        {
            System.out.println(number + " is Even");
        }
        else
        {
            System.out.println(number + " is Odd");
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        checkEvenOdd();
    }
}
