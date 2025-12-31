package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Intersection 
{

    public static void main(String[] args) 
    {

        // Declare first array
        int[] a = {3, 2, 11, 4, 6, 7};

        // Declare second array
        int[] b = {1, 2, 8, 4, 9, 7};

        // Create lists to store array elements
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        // Add elements of first array to list1
        for (int i = 0; i < a.length; i++) 
        {
            list1.add(a[i]);
        }

        // Add elements of second array to list2
        for (int i = 0; i < b.length; i++) 
        {
            list2.add(b[i]);
        }

        // Compare both lists and print matching values
        for (int i = 0; i < list1.size(); i++) 
        {

            if (list2.contains(list1.get(i))) 
            {
                System.out.println(list1.get(i));
            }
        }
    }
}
