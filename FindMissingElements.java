package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElements 
{

    public static void main(String[] args) 
    {

        // Declare the array
        int[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Create a List
        List<Integer> list = new ArrayList<Integer>();

        // Add array elements to the list
        for (int i = 0; i < arr.length; i++) 
        {
            list.add(arr[i]);
        }

        // Arrange the list in ascending order
        Collections.sort(list);

        // Check for missing numbers
        for (int i = 0; i < list.size() - 1; i++) 
        {

            // If there is a gap in the sequence
            if (list.get(i) + 1 != list.get(i + 1)) 
            {

                // Print missing number(s)
                for (int j = list.get(i) + 1; j < list.get(i + 1); j++) 
                {
                    System.out.println("Missing number is: " + j);
                }
            }
        }
    }
}
