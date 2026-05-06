package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class AssertExmpl1 {
      
	WebDriver driver;
	
	@BeforeTest
	
	public void BeforeTest() {
		System.out.println("Test...........BeforeTest");
	}
	
	@BeforeMethod
	
	public void BeforeMethod() {
		driver = new ChromeDriver();
	}
	
    @Test
    public void test1() {

        driver.get("https://zoom.us/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "One platform to connect | Zoom";

        Assert.assertEquals(actualTitle, expectedTitle);

        
    }

    @AfterMethod
    
    public void AfterMethod() {
    	driver.quit();
    }
    
    @AfterTest
    
    public void AfterTest() {
    	System.out.println("Test...........AfterTest");
    }
    
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { AssertExmpl1.class });
        testng.run();
    }
}