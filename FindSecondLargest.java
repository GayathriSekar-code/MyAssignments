package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest 
{

    public static void main(String[] args) 
    {

        // Declare the array
        int[] arr = {3, 2, 11, 4, 6, 7};

        // Create a List
        List<Integer> list = new ArrayList<Integer>();

        // Add array elements to the list
        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }

        // Arrange the list in ascending order
        Collections.sort(list);

        // Get the second largest element
        int secondLargest = list.get(list.size() - 2);

        // Print the second largest number
        System.out.println("Second largest number is: " + secondLargest);
    }
}
