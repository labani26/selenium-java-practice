package Pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class TestNGExmple2 {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest() {
        System.out.println("Test-----BeforeTest");
    }

    @BeforeMethod
    public void BeforeMethod() {
        driver = new ChromeDriver();
    }

    @Test 
    public void Amazon() {
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
    }

    @Test
    public void FB() {
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
    }

    @AfterMethod 
    public void AterMethod() {
        driver.quit();
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("Test-----AterTest");
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { TestNGExmple2.class });
        testng.run();
    }
}