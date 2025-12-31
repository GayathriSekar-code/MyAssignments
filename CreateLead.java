package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize browser window
        driver.manage().window().maximize();

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead button
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter First Name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");

        // Enter Last Name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");

        // Enter Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

        // Enter Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Tester");

        // Click Create Lead button
        driver.findElement(By.className("smallSubmit")).click();

        // Print the Page Title
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        //driver.close();
    }
}
