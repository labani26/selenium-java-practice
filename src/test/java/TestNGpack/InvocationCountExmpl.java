package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class InvocationCountExmpl {
	
	@Test(invocationCount = 5)
	
	public void InvcCnt() {
		
		System.out.println("InvocationCount working fine");
		
	}
	
	public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { InvocationCountExmpl.class });
        testng.run();
    }

}
