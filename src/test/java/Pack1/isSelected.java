package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.easemytrip.com");
        
        Thread.sleep(3000);
        
        boolean checkmark = driver.findElement(By.id("checkmark_df")).isSelected();
        
        if(checkmark == false) {
        	
        	driver.findElement(By.id("checkmark_df")).click();
        }
        
        else {
        	System.out.println("Already selected");
        }
	}

}