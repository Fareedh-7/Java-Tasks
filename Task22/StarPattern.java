/*
 This program prints a right triangle star pattern.

 Method without parameters and without return type
 is used, namely printPattern().
*/

class StarPattern
{
    // Method to print star pattern
    static void printPattern()
    {
        int rows = 5;   // number of rows

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        printPattern();
    }
}