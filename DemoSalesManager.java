package Assignment;  // Package declaration

import org.openqa.selenium.By;          // Import By class for locating elements
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver to launch Chrome browser

public class DemoSalesManager {

    public static void main(String[] args) {

        // Create ChromeDriver object to launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Open the LeafTaps application URL
        driver.get("http://leaftaps.com/opentaps/control/main");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Print the page title in the console
        System.out.println(driver.getTitle());

        // Locating username field by id and enter username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Locating password field by name and enter password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

        // Locating login button by class name and click it
        driver.findElement(By.className("decorativeSubmit")).click();

        // Close the browser (optional)
        // driver.quit();
    }
}
