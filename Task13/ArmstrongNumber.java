/*
 This program defines a numeric value
 and checks whether it is an Armstrong number.

 Method without parameters and without return type
 is used, namely checkArmstrong().
*/

class ArmstrongNumber
{
    // Method to check Armstrong number
    static void checkArmstrong()
    {
        int number = 153;   // numeric value
        int originalNumber = number;
        int sum = 0;

        while (number != 0)
        {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (sum == originalNumber)
        {
            System.out.println(originalNumber + " is an Armstrong Number");
        }
        else
        {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        checkArmstrong();
    }
}