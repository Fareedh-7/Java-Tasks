/*
 This program defines a numeric value
 and prints the Fibonacci series up to that number of terms.

 Method without parameters and without return type
 is used, namely printFibonacci().
*/

class Fibonacci
{
    // Method to print Fibonacci series
    static void printFibonacci()
    {
        int terms = 7;   // number of terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++)
        {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        printFibonacci();
    }
}
