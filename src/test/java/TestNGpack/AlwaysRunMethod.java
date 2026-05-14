package TestNGpack;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class AlwaysRunMethod {


@Test(alwaysRun = true , dependsOnMethods = "test2")

public static void test1() {
	System.out.println("First test1");
}

@Test
public static void test2() {
	
	Assert.assertTrue(false);
	
	System.out.println("First test2");
}
public static void main(String[] args) {

    TestNG testng = new TestNG();

    testng.setTestClasses(new Class[] { AlwaysRunMethod.class });

    testng.run();
}
}

//test2()
//↓
//FAIL
//↓
//alwaysRun = true
//↓
//test1() still runs