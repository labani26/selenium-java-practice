package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement circleClick = driver.findElement(By.id("circle"));

        Actions actions = new Actions(driver);

        actions.moveToElement(circleClick).clickAndHold().pause(3000).release().perform();

    }
}