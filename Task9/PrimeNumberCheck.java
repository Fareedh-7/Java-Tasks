/*
 This program defines a numeric value
 and checks whether it is a prime number.

 Method without parameters and without return type
 is used, namely checkPrime().
*/

class PrimeNumberCheck
{
    // Method to check and print whether number is prime
    static void checkPrime()
    {
        int number = 7;   // numeric value
        boolean isPrime = true;

        if (number <= 1)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println(number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is not a Prime Number");
        }
    }

    // Starting point of the program
    public static void main(String[] args)
    {
        // Calling the method
        checkPrime();
    }
}
