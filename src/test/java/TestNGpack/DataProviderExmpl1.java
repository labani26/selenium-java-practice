package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExmpl1 {

    @DataProvider(name = "dataprovider") 
    
// @DataProvider = DataProvider is used to pass multiple data sets into a test method
    
    public Object[][] dataprovidermethod() {
    	
//Object[][] = "2-dimensional array of objects"
// dataprovidermethod() = This method will return test data. 
    	
        return new Object[][] {
        	
// return new Object[][] = You are creating and returning a 2D array.
        	
                {"username1", "password1", "email1"},
                {"username2", "password2", "email2"},
                {"username3", "password3", "email3"}
        };
    }

    @Test(dataProvider = "dataprovider")
    
// @Test(dataProvider = "dataprovider") = “This test method should take data from the DataProvider named dataprovider.”    

    public void test1(String val, String val2, String val3) {
    	
// public void test1(String val, String val2, String val3) = This test method receives 3 values from DataProvider.    	

        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
    }
    
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { DataProviderExmpl1.class });
        testng.run();
    }
}