package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvUiMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		//className obj = new className;
		//obj.method
		//WebElement(dataType)-webpage element
		//account-variable storing element
		//driver.findElement()-find element on webpage
		//By.id()-locating element using ID
		
		Actions ac = new Actions(driver);
		//Creating an Actions class object.
       //Actions-Selenium class for advanced actions
		//ac-object name
		//new Actions(driver)-create Actions object with driver
		
		ac.moveToElement(account).build().perform();
		//This line performs mouse hover on the Account menu.
		//moveToElement()-move mouse to element
		//account-target element
		//build()-build the action
		//perform()-execute the action
		
		
	}

}
