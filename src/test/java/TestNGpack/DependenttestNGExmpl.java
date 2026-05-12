package TestNGpack;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class DependenttestNGExmpl {
	
	@Test (dependsOnMethods = {"test2","test3"})
	
	public void test1() {
		System.out.println("Test1 script");
	}

   @Test
	
	public void test2() {
	   Assert.assertTrue(false);
		System.out.println("Test2 script");
	}

    @Test

    public void test3() {
	System.out.println("Test3 script");
}
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DependenttestNGExmpl.class });
        testng.run();
    }
}
