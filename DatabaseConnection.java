package Assignment;

//Interface: DatabaseConnection

public interface DatabaseConnection
{

    // Abstract method to connect to database
    void connect();

    // Abstract method to disconnect from database
    void disconnect();

    // Abstract method to execute update
    void executeUpdate();
}
