package TestNGpack;

import org.testng.TestNG;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterizationExmpl1 {
	
//	@Test
	
//	@Parameters({"UserName", "Password"})
//    
//	public void parameter( String UserName, String Password ) {
//	
//	System.out.println(UserName);
//	System.out.println(Password);
//	
//	}
	
	@Test
	public void parameter() {

	    String UserName = "Labani";
	    String Password = "1234";

	    System.out.println(UserName);
	    System.out.println(Password);
	}
	
	public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { ParameterizationExmpl1.class });
        testng.run();
    }
	
}

