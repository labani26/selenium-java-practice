package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfConExampl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver is the object that controls the browser
        //Selenium automatically connects to Chrome
		//Think of driver as a remote control for the browser
		
		driver.get("http://www.facebook.com");
		//get() is used to launch a URL
		driver.manage().window().maximize();
		//Maximizes the browser window
		
		String actualtitle = driver.getTitle();
		//Fetches the current page title
        //Stores it in a variable called actualTitle
        //This is what the browser actually shows
		String exptitle = "Facebook – log in or sign up";
		//This is the title you expect
        //You manually write this by checking the browser title
		
		if(actualtitle.equals(exptitle)) {
			System.out.println("test is pass");
			//Compares actual title with expected title
           //equals() checks exact text match
           //If both match → condition is TRUE
			
		} else {
			
			System.out.println("test fail");
			System.out.println("Actual Title is: " + actualtitle);
			
			}

	}

}
