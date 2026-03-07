/*
 This program defines an array of numbers
 and finds the sum of all elements.

 Method without parameters and without return type
 is used, namely findArraySum().
*/

class ArraySum
{
    // Method to calculate and print sum of array elements
    static void findArraySum()
    {
        int numbers[] = {10, 20, 30, 40, 50};   // array values
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array elements is: " + sum);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findArraySum();
    }
}