package Assignment;

public class ReverseOddPositionWords {

    public static void main(String[] args) {

        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check if index is odd
            if (i % 2 != 0) {

                // Convert the word to character array
                char[] charArray = words[i].toCharArray();

                // Print the word in reverse order
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }

                System.out.print(" "); // Space after word

            } else {
                // Print even position words as it is
                System.out.print(words[i] + " ");
            }
        }
    }
}
