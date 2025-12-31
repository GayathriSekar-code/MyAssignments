package Assignment;

public class FibonacciSeries {

    public static void main(String[] args) {

        int range = 8;      // Given range
        int first = 0;      // First Fibonacci number
        int second = 1;     // Second Fibonacci number

        System.out.println("Fibonacci Series up to range " + range + ":");

        // Print first two numbers
        System.out.print(first + ", " + second + ", ");

        // remaining Fibonacci numbers using for loop
        for (int i = 2; i <= range; i++)
           {

            int next = first + second;   // Calculate next number

            if (next > range) 
            {          
            	// Stop if number exceeds range
                break;
            }

            System.out.print(next + ", ");

            first = second;              // Update values
            second = next;
        }
    }
}
