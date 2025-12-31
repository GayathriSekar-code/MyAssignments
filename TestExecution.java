package Assignment;

public class TestExecution 
{

    public static void main(String[] args) 
    {

        // Create object of subclass
        LoginTestData login = new LoginTestData();

        // Call methods from superclass
        login.enterCredentials();
        login.navigateToHomePage();

        // Call methods from subclass
        login.enterUsername();
        login.enterPassword();
    }
}
