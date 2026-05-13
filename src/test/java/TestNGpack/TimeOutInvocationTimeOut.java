package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TimeOutInvocationTimeOut {

    @Test(invocationTimeOut = 5000, timeOut = 2000)
    public void test1() throws InterruptedException {

        Thread.sleep(1000);

        System.out.println("Test working fine");
    }

    public static void main(String[] args) {

        TestNG testng = new TestNG();

        testng.setTestClasses(new Class[] { TimeOutInvocationTimeOut.class });

        testng.run();
    }
}