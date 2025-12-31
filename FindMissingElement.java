package Assignment;

import java.util.Arrays;

public class FindMissingElement {

    public static void main(String[] args) {

        // Declare the array
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Sort the array
        Arrays.sort(arr);

        // to find the missing number
        for (int i = 0; i < arr.length; i++) {

            // Check if the element is not in sequence
            if (arr[i] != i + 1) {

                // Print the missing number
                System.out.println("Missing number is: " + (i + 1));
                break;
            }
        }
    }
}
