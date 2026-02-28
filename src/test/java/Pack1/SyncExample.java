package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://chatgpt.com/");
        driver.manage().window().maximize();

        // Read product title (NOT sendKeys)
        driver.findElement(By.xpath("//*[@id=\"conversation-header-actions\"]/div/div/button[2]/div")).click();
        driver.findElement(By.id("email")).sendKeys("labani");
        driver.findElement(By.className("btn relative btn-primary mt-1.5 h-13 w-full rounded-full text-base")).click();
        
    }
}
