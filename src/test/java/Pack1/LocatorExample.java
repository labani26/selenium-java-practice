package Pack1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static <WebElement> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
        
//      ----Put email on facebook email
		
//		driver.findElement(By.id("email")).sendKeys("mail2labanisardar@gmail.com");
//		
//		----put password on fb
		
//		driver.findElement(By.id("pass")).sendKeys("Labani");
//		
//		----click on create new account
//		
//		driver.findElement(By.linkText("Create new account")).click();
		
//		----click on crate a page
		
//		driver.findElement(By.partialLinkText("Create a Page")).click();
		
//		int Link = driver.findElements(By.tagName("a")).size();
//		
//		System.out.println("total no of links in fb = "+ Link);
		
//      -----Class Name------
		
       int classNameSize = driver.findElements(By.className("inputtext")).size();
        System.out.println("classNameSize = "+classNameSize );
        
//      ------xpath-----  
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test");
        
//      ------css-------
        
        driver.findElement(By.cssSelector("#pass")).sendKeys("TestCss");
		
        
	}

}
