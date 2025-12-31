package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePromptAlerts {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Switch to frame (iframe)
        driver.switchTo().frame("iframeResult");

        // Click the "Try It" button
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Click OK
        alert.accept();
        String str = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
        System.out.println(str);
        
    } 
}
