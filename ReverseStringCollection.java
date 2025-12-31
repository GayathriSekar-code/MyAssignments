package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection
{

    public static void main(String[] args)
    {

        // Declare the String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Add array elements to a List
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < companies.length; i++)
        {
            list.add(companies[i]);
        }

        // Arrange the collection in ascending order
        Collections.sort(list);

        // Iterate the list in reverse order and print
        for (int i = list.size() - 1; i >= 0; i--) 
        {
            System.out.print(list.get(i));
            if (i != 0) 
            {
                System.out.print(", ");
            }
        }
    }
}
