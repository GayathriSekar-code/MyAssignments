package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

    public static void main(String[] args) {

        // Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Enter username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads link
        driver.findElement(By.linkText("Leads")).click();

        // Click Find Leads
        driver.findElement(By.linkText("Find Leads")).click();

        // Click Phone tab
        driver.findElement(By.xpath("//span[text()='Phone']")).click();

        // Enter phone number
        driver.findElement(By.name("phoneNumber")).sendKeys("99");

        // Click Find Leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // Capture Lead ID of first result
        WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));

        String leadID = firstLead.getText();
        System.out.println("Captured Lead ID: " + leadID);

        // Click the first lead
        firstLead.click();

        // Click Delete button
        driver.findElement(By.linkText("Delete")).click();

        // Click Find Leads again
        driver.findElement(By.linkText("Find Leads")).click();

        // Enter captured Lead ID
        driver.findElement(By.name("id")).sendKeys(leadID);

        // Click Find Leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // Verify "No records to display" message
        String resultText = driver.findElement(By.className("x-paging-info")).getText();

        if (resultText.equals("No records to display")) 
        {
            System.out.println("Lead deleted successfully");
        } 
        else
        {
            System.out.println("Lead deletion failed");
        }

        // Close the browser
        driver.close();
    }
}
