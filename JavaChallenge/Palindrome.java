package JavaChallenge;

public class Palindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        // Convert to lowercase
        s = s.toLowerCase();

        //Remove special characters manually
        String temp = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if (ch >= 'a')
            {
                if (ch <= 'z') 
                {
                    temp = temp + ch;
                }
            } 
            else if (ch >= '0')
            {
                if (ch <= '9')
                {
                    temp = temp + ch;
                }
            }
        }

        //Reverse the string
        String reverse = "";

        for (int i = temp.length()- 1; i >= 0; i--) 
        {
            reverse = reverse + temp.charAt(i);
        }

        //Compare both strings
        if (temp.equals(reverse))
        {
            System.out.print(true + "  " + temp);
        }
        else 
        {
            System.out.println(false);
                       
        }
    }
}
