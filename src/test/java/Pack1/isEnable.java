package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://www.amazon.in");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        
        Thread.sleep(5000);
        
        boolean signin2 = driver.findElement(By.id("ap_email_login")).isEnabled();
        
        if(signin2 == true) {
        	
        	driver.findElement(By.id("ap_email_login")).sendKeys("8240148511");
        	
        	driver.findElement(By.id("continue")).click();   // ✅ correct click
        	
        	driver.findElement(By.id("ap_password")).sendKeys("Labani@26");
        	
        	driver.findElement(By.id("signInSubmit")).click();
        }
        else {
        	System.out.println("Not enabled");
        }

	}

}