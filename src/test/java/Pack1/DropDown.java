package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.tagName("select"));

		Select sel = new Select(dropdown);
//		sel.selectByVisibleText("Barbados");
//		sel.selectByValue("KHM");
//		sel.selectByIndex(30);
		sel.selectByContainsVisibleText("dos");
		

	}
}