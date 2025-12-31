package Assignment;

public class Polymorphism {

    // Method 1: sendRequest with one argument
    public void sendRequest(String endpoint)
    {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Method 2: sendRequest with three arguments (overloaded method)
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) 
    {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + requestStatus);
    }

    public static void main(String[] args) 
    {

        // Create object of APIClient
        Polymorphism api = new Polymorphism();

        // Call first version of sendRequest
        api.sendRequest("/getUsers");

        // Call overloaded version of sendRequest
        api.sendRequest("/createUser", "{name: Gayathri}", true);
    }
}
