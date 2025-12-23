//Java Challenge 1
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//Example 1:
//Input: s = "Hello World" Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//Input: s = "   fly me   to   the moon  " Output: 4
//Explanation: The last word is "moon" with length 4.
//Example 3:
//Input: s = "luffy is still joyboy" //Output: 6
//Explanation: The last word is "joyboy" with length 6.

package JavaChallenge;

public class LengthOfLastWord
{
    // Method to find the length of the last word in the string
    public static int lengthOfLastWord(String s) {

        // Variable to store the length of the last word
        int length = 0;

        // Loop starts from the last character of the string
        for (int i = s.length() - 1; i >= 0; i--) {

            // Check if the current character is NOT a space
            if (s.charAt(i) != ' ') 
            {           
                length++; // If not a space, increment length counter

            } else 
            {
                break;    // If a space is found, stop counting
            }
        }
 
        return length; // Return the length of the last word
    }

    public static void main(String[] args) {

        // Input strings
        String s1 = "Hello World";
        String s2 = "fly me to the moon";
        String s3 = "luffy is still joyboy";

        // Print input string and length of its last word
        System.out.println("Input: \"" + s1 + "\" → Length of last word: " + lengthOfLastWord(s1));
        System.out.println("Input: \"" + s2 + "\" → Length of last word: " + lengthOfLastWord(s2));
        System.out.println("Input: \"" + s3 + "\" → Length of last word: " + lengthOfLastWord(s3));
    }
}



