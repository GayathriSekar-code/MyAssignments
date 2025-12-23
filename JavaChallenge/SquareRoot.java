//JavaChallenge2
//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
//Example 1:
//Input: x = 4 Output: 2
//Example 2:
//Input: x = 8 Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

package JavaChallenge;

public class SquareRoot {

    // Method to calculate the integer square root of a number
    public static int mySqrt(int x) {

        // Variable to store the final square root result
        int result = 0;

        // Loop from 1 up to the given number x
        for (int i = 1; i <= x; i++) {

            // Check if square of i is less than or equal to x
            if (i * i <= x) 
            {
               result = i;// If condition is true, update result

            } else 
            
            {
               break;// If square exceeds x, exit the loop
            }
        }       
      
        return result; // Return the integer part of the square root
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println("Input: 4 → Output: " + mySqrt(4)); // Expected: 2
        System.out.println("Input: 8 → Output: " + mySqrt(8)); // Expected: 2
    }
}



