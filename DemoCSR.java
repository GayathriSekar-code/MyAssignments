package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCSR {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Load URL
        driver.get("http://leaftaps.com/opentaps/control/main");

        // Maximize window
        driver.manage().window().maximize();

        // Print page title
        System.out.println(driver.getTitle());

        // Enter username
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

        // Click login
        driver.findElement(By.className("decorativeSubmit")).click();

        // Close browser (optional)
        // driver.quit();
    }
}
