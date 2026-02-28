package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.amazon.in");
		
		System.out.println(driver.getPageSource());
	
		driver.quit();
		
	}

}
