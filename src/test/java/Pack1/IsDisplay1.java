package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.easemytrip.com");
        
        WebElement Name1 = driver.findElement(By.id("FromSector-mul2_show"));
    
        boolean Boolean1 = Name1.isDisplayed();
        
        System.out.println(Boolean1);
        
        WebElement Name2 = driver.findElement(By.id("mcity"));
        Name2.click();
        
        WebElement Name3 = driver.findElement(By.id("FromSector-mul2_show"));
        
        boolean Boolean2 = Name3.isDisplayed();
        
        System.out.println(Boolean2);
    
	}

}
