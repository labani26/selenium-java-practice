package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExceptionExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.amazon.in");
		  driver.findElement(By.id("abcd")).click();
		
		}
		catch(NoSuchElementException ee) {
			System.out.println("Problem find this id in amazon webside");
			
		}
        finally {
        	System.out.println("script in finally");
        }
	}

}
