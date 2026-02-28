package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.quit(); // LAST line
  }
}