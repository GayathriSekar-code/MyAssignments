package Assignment;

//Execution Class: DBExecution

public class DBExecution 
{

    public static void main(String[] args)
    {

        // Create object of JavaConnection
        JavaConnection db = new JavaConnection();

        // Call implemented methods
        db.connect();
        db.executeUpdate();
        db.disconnect();
    }
}
