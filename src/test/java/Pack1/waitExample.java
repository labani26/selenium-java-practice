package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitExample {

    public static void main(String[] args) throws InterruptedException {
    	
    	
    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kirantestingacademy.com/wait/");

        // Implicit Wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        // Element 1
//        driver.findElement(By.id("showElement1")).click();
//        driver.findElement(By.id("dynamicButton1")).click();
////        Thread.sleep(20000);
//        // Element 2
//        driver.findElement(By.id("showElement2")).click();
//        driver.findElement(By.id("dynamicEditBox")).sendKeys("Labani");
////        Thread.sleep(20000);
//        // Element 3
//        driver.findElement(By.id("showElement3")).click();
//        driver.findElement(By.xpath("//*[@name='dynamicRadio']")).click();
//        Thread.sleep(20000);
        

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // Element 4
        driver.findElement(By.id("showCarCompanies")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@value='BMW']"))).click();

        // Start button
        driver.findElement(By.id("startButton")).click();


        // Close browser
//        driver.quit();
    }
}