package JavaChallenge;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2}; // Input array

        // Loop through each element
        for (int i = 0; i < nums.length; i++) {

            int count = 0; // Count occurrences of current element

            // Compare nums[i] with all elements
            for (int j = 0; j < nums.length; j++) {

                // If numbers match, increase count
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // If count is 1, this is the single number
            if (count == 1) {
                System.out.println("Single number is: " + nums[i]);
                break;
            }
        }
    }
}
