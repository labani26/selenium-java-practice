package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class InvocationCountInvocationTimeOut {
	
	@Test (invocationCount = 5, invocationTimeOut = 5000)
	
	public static void test2() throws InterruptedException {
		
		Thread.sleep(2000);
		
		System.out.println("script from test");
	}

	public static void main(String[] args) {

        TestNG testng = new TestNG();

        testng.setTestClasses(new Class[] { InvocationCountInvocationTimeOut.class });

        testng.run();
    }
}

//invocationCount = 5 - Run test 5 times
//invocationTimeOut = 5000 - All 5 runs together must finish within 5 secon
//Thread.sleep(2000); - 2 seconds per execution
//total time need - 5 runs × 2 seconds = 10 seconds
//BUT you allowed only: 5 seconds
//that's why two times run'