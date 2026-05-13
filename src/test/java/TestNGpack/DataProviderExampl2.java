package TestNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampl2 {

    @Test(dataProvider = "DataProvider")
    public void loginTest(String username, String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.advantageonlineshopping.com/#/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();

        driver.findElement(By.id("menuUser")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btn"))).click();

        Thread.sleep(3000);

        String actualValue = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();

        if (actualValue.equals(username)) {

            System.out.println("Test is Pass");
        }

        else {

            System.out.println("Test is Fail");
        }

        driver.quit();
    }

    @DataProvider(name = "DataProvider")
    public Object[][] dataprovidermethod() {

        return new Object[][] {

        	    
                {"Test123456", "Test@123456"},
                {"Test12345", "Test@12345"},

        };
    }
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DataProviderExampl2.class });
        testng.run();
    }
}