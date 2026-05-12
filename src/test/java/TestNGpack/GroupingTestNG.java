package TestNGpack;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class GroupingTestNG {

    @Test(groups = {"inbox"})
    public void test1() {
        System.out.println("inbox script");
    }

    @Test(groups = {"inbox"})
    public void test2() {
        System.out.println("inbox script");
    }

    @Test(groups = {"delete"})
    public void test3() {
        System.out.println("delete script");
    }
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { GroupingTestNG.class });
        testng.run();
    }
}