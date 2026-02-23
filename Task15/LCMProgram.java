/*
 This program defines two numeric values
 and finds their Least Common Multiple (LCM).

 Method without parameters and without return type
 is used, namely findLCM().
*/

class LCMProgram
{
    // Method to calculate and print LCM
    static void findLCM()
    {
        int firstNumber = 12;   // first value
        int secondNumber = 15;  // second value

        int max = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        int lcm = max;

        while (true)
        {
            if (lcm % firstNumber == 0 && lcm % secondNumber == 0)
            {
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        findLCM();
    }
}