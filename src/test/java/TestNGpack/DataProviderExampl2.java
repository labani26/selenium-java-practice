package TestNGpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProviderExampl2 {
	
	@DataProvider(name = "DataProvider")
    public Object[][] dataprovidermethod() {

        return new Object[][] {

                {"Test12345", "Test@12345"},
                {"Test123456", "Test@123456"},
                {"Test12345", "Test@12345"}

        };
    }

    @Test(dataProvider = "DataProvider")
    public void loginTest(String username, String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.advantageonlineshopping.com/#/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();

        driver.findElement(By.id("menuUser")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.id("sign_in_btn")).click();

        Thread.sleep(5000);

        String actualValue = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();

        System.out.println("Logged in User: " + actualValue);


}
