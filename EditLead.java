package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login Button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads Button
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter Company Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

        // Enter First Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gayathri");

        // Enter Last Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sekar");

        // Enter First Name (Local) using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gaya");

        // Enter Department using Name locator
        driver.findElement(By.name("departmentName")).sendKeys("Testing");

        // Enter Description using Name locator
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        // Enter Email Address using ID locator
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathri@gmail.com");

        // Select State/Province as New York using visible text
        WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select select = new Select(stateDropdown);
        select.selectByVisibleText("New York");

        // Click Create Lead Button
        driver.findElement(By.className("smallSubmit")).click();

        // Click Edit Button
        driver.findElement(By.linkText("Edit")).click();

        // Clear Description Field
        driver.findElement(By.name("description")).clear();

        // Enter Important Note
        driver.findElement(By.name("importantNote")).sendKeys("Lead updated successfully using Selenium");

        // Click Update Button
        driver.findElement(By.xpath("//input[@value='Update']")).click();

        // Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Close the browser
        driver.close();
    }
}
