package Assignment;

public class IsPrimeNumber {

    public static void main(String[] args) 
    	{

        int number = 7;   // Given number
        boolean isPrime = true;

        // Check divisibility from 2 to n-1
        for (int i = 2; i < number; i++) 
        {

            if (number % i == 0) 
            {
                isPrime = false;
                break;
            }
        }

        // Print result
        if (isPrime) 
        {
            System.out.println(number + " is a Prime Number");
        } 
        else
        {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
