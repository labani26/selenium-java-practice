package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class SoftAssertion {

    @Test 
    public void softAssertTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://zoom.us/");

        String actualTitle = driver.getTitle(); 
        String expectedTitle = "One platform to connect";

        SoftAssert soft = new SoftAssert();

        soft.assertEquals(actualTitle, expectedTitle, "Title mismatch");

        System.out.println("Actual Title: " + actualTitle);

        soft.assertAll();  // Mandatory

        driver.quit();
    }

    // Main method should be OUTSIDE the test method
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { SoftAssertion.class });
        testng.run();
    }
}