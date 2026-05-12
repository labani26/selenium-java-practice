package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class DependentOnGroupsTestNG {
	

	@Test (dependsOnMethods = {"testgroup"})
	
	public void test1() {
		System.out.println("Test1 script");
	}

   @Test (groups = {"testgroup"})
	
	public void test2() {
	   //Assert.assertTrue(false);
		System.out.println("Test2 script");
	}

    @Test (groups = {"testgroup"})

    public void test3() {
	System.out.println("Test3 script");
}
    
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DependentOnGroupsTestNG.class });
        testng.run();
    }
	

}
