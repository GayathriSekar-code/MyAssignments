package Assignment;

//Concrete Class: JavaConnection (implements DatabaseConnection)

public class JavaConnection implements DatabaseConnection 
{

    // Implementation of connect method
    public void connect() 
    {
        System.out.println("Database connected successfully");
    }

    // Implementation of disconnect method
    public void disconnect() 
    {
        System.out.println("Database disconnected successfully");
    }

    // Implementation of executeUpdate method
    public void executeUpdate()
    {
        System.out.println("Database update executed");
    }
}
