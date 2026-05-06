package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class TestNGExmp11 {

    @Test(priority = 0)
    public void login() {
        System.out.println("Login Script------Test");
    }

    @Test(priority = 1)
    public void inbox() {
        System.out.println("Inbox TestNG works------Test");
    }
    
    @Test(priority = 2)
    public void comp() {
    	System.out.println("Comp Testing------Test");    
    }
    
    @BeforeTest
    public static void openBrowser() {
    	System.out.println("Open browser script-------BeforeTest");
    }
    
    @AfterTest
    public static void afterTest() {
    	System.out.println("Open browser script-------AfterTest");
    }
    
    @BeforeMethod
    public static void beforem() {
    	System.out.println("Open browser script-------BeforeMethod");
    }
    
    @AfterMethod
    public static void afterem() {
    	System.out.println("Open browser script-------AfterMethod");
    }
    
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { TestNGExmp11.class });
        testng.run();
    }
}