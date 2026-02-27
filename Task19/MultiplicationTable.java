/*
 This program defines a numeric value
 and prints its multiplication table.

 Method without parameters and without return type
 is used, namely printTable().
*/

class MultiplicationTable
{
    // Method to print multiplication table
    static void printTable()
    {
        int number = 6;   // numeric value

        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        printTable();
    }
}