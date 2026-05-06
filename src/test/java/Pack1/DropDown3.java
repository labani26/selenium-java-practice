package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        WebElement element = driver.findElement(By.tagName("select"));

        Select sel = new Select(element);

        if (sel.isMultiple()==true) {

            sel.selectByVisibleText("Barbados");
            sel.selectByIndex(20);
            sel.selectByValue("KHM");

        } else {

            System.out.println("Dropdown is not multiple select");
        }
    }
}