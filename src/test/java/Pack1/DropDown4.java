package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        WebElement tagName = driver.findElement(By.tagName("select"));

        Select action = new Select(tagName);

        action.selectByVisibleText("Algeria");

        System.out.println("Working");
    }
}