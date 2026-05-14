package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TimeOutInvocationTimeOut {

    @Test(invocationCount = 5, timeOut = 2000)
    public static void test1() throws InterruptedException {

        Thread.sleep(1000);

        System.out.println("Test working fine");
    }

    public static void main(String[] args) {

        TestNG testng = new TestNG();

        testng.setTestClasses(new Class[] { TimeOutInvocationTimeOut.class });

        testng.run();
    }
}

//timeOut = 2000 - Each execution must finish within 2 seconds.
//Thread.sleep(1000); - 1 second
//1 second < 2 seconds
//so invocationCount = 5 , Run method 5 times

//Run 1 → PASS
//Run 2 → PASS
//Run 3 → PASS
//Run 4 → PASS
//Run 5 → PASS within 5 sec

//timeOut - One execution time
//invocationTimeOut - Total combined execution time
//invocationCount - How many times to run test
//Thread.sleep(1000) - Pause the execution for 1000 milliseconds