package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();


        WebElement dropdown = driver.findElement(By.tagName("select"));

        Select sel = new Select(dropdown);

        int dropdownsize = sel.getOptions().size();

        for(int i = 0; i < dropdownsize; i++) {

            String itemtext = sel.getOptions().get(i).getText();
            System.out.println(itemtext);
        }

        
    }
}