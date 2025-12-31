package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBags 
{

    public static void main(String[] args) 
    {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("https://www.ajio.com/");

        // Maximize browser
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Search for "bags"
        driver.findElement(By.name("searchVal")).sendKeys("bags");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Click on Gender → Men filter
        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();

        // ----------------- COUNT OF ITEMS -----------------

        // Get the total count of items found
        String itemCount = driver.findElement(By.className("length")).getText();
        System.out.println("Total items found: " + itemCount);

        // ----------------- LIST OF BRANDS -----------------

        // Get all brand names
        List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));

        System.out.println("\nList of Brands:");
        for (WebElement brand : brands) 
        {
            System.out.println(brand.getText());
        }

        // ----------------- LIST OF BAG NAMES -----------------

        // Get all bag names
        List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));

        System.out.println("\nList of Bag Names:");
        for (WebElement bag : bagNames) 
        {
            System.out.println(bag.getText());
        }

        // Close the browser
        //driver.close();
    }
}
