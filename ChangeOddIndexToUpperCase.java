package Assignment;

public class ChangeOddIndexToUpperCase {

    public static void main(String[] args) {

        String test = "changeme";

        // Convert String to character array
        char[] charArray = test.toCharArray();

        // Loop through characters from start to end
        for (int i = 0; i < charArray.length; i++) {

            // Check if index is odd
            if (i % 2 != 0) {

                // Convert odd index character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Print the modified characters
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
