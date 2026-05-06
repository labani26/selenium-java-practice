package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskPractice1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/signup");

        Thread.sleep(3000);

        // Click Day dropdown (correct element)
        WebElement dayDropdown = driver.findElement(By.xpath("(//div[@role='button'])[1]"));
      
        dayDropdown.click();

        Thread.sleep(2000);

        // Select 26
        WebElement dayValue = driver.findElement(By.xpath("//span[text()='26']"));
        dayValue.click();

        System.out.println("Day selected: 26");
    }
}