package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load Facebook UK URL
        driver.get("https://www.facebook.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Click on "Create new account"
        driver.findElement(By.linkText("Create new account")).click();

        // Enter First name
        driver.findElement(By.name("firstname")).sendKeys("Gayathri");

        // Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Sekar");

        // Enter Mobile number or email address
        driver.findElement(By.name("reg_email__")).sendKeys("9876543210");

        // Enter New password
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@1234");

        // ----------------- Date of Birth Dropdowns -----------------

        // Select Day
        WebElement day = driver.findElement(By.id("day"));
        Select daySelect = new Select(day);
        daySelect.selectByVisibleText("10");

        // Select Month
        WebElement month = driver.findElement(By.id("month"));
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText("Jun");

        // Select Year
        WebElement year = driver.findElement(By.id("year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1995");

        // ----------------- Gender Radio Button -----------------

        // Select Female radio button
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        System.out.println("Facebook registration form filled successfully");

        // Close the browser
        //driver.close();
    }
}
