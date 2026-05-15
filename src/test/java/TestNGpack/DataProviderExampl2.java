package TestNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampl2 {

    @Test(dataProvider = "DataProvider")
    public void loginTest(String username, String password) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.advantageonlineshopping.com/#/");

        Reporter.log("URL launched");

        driver.manage().window().maximize();

        Reporter.log("Browser opened");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Click on user icon
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menuUser"))).click();

        Reporter.log("Clicked on menuUser");

        // Wait for username field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        // Enter username
        driver.findElement(By.name("username")).sendKeys(username);

        Reporter.log("Entered username: " + username);

        // Enter password
        driver.findElement(By.name("password")).sendKeys(password);

        Reporter.log("Entered password: " + password);

        // Wait for Sign In button
        WebElement signinBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btn")));

        // JavaScript Click
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", signinBtn);

        Reporter.log("Clicked on Sign In button");

        // Wait for logged in username
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='menuUserLink']/span")));

        // Capture actual username
        String actualValue = driver.findElement(
                By.xpath("//*[@id='menuUserLink']/span")).getText();

        Reporter.log("Captured logged in username");

        // Validation
        if (actualValue.equals(username)) {

            System.out.println("Test is Pass");

            Reporter.log("Login Pass");
        }

        else {

            System.out.println("Test is Fail");

            Reporter.log("Login Fail");
        }

        driver.quit();
    }

    @DataProvider(name = "DataProvider")
    public Object[][] dataprovidermethod() {

        return new Object[][] {

                { "Test123456", "Test@123456" },
                { "Test12345", "Test@12345" }

        };
    }

    public static void main(String[] args) {

        TestNG testng = new TestNG();

        testng.setTestClasses(new Class[] { DataProviderExampl2.class });

        testng.run();
    }
}