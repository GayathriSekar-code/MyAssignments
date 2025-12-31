package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ListInterface {

    public static void main(String[] args) {

        // Launch browser
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load the URL
        driver.get("https://www.amazon.in");

        // Search for phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Get all phone prices
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        // List to store prices as Integer
        List<Integer> priceList = new ArrayList<Integer>();

        System.out.println("Phone Prices:");

        // Print prices and store them
        for (WebElement each : priceElements) 
        {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			if (!replaceAll.isEmpty()) 
			{
				int mobiles = Integer.parseInt(replaceAll);
				priceList.add(mobiles);
            }
        }

        // Sort prices
        Collections.sort(priceList);

        // Print lowest price
        System.out.print(priceList);

        // Close browser
        driver.quit();
    }
}
