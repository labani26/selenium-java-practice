package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();

		// Locate elements
		WebElement dragitem = driver.findElement(By.id("draggable"));
		WebElement dropitem = driver.findElement(By.id("droptarget"));

		Thread.sleep(10000);

		// Perform Drag and Drop
		Actions acnt = new Actions(driver);
		acnt.dragAndDrop(dragitem, dropitem).build().perform();
	}
}
//
//1️⃣ What is the Actions Class?
//
//In Selenium, the Actions class is used to perform advanced user interactions like:
//
//Drag and Drop
//
//Mouse Hover
//
//Right Click
//
//Double Click
//
//Click and Hold
//
//Keyboard actions
//
//These are called complex mouse/keyboard actions.
//
//Simple actions like click() or sendKeys() can be done directly with WebElement, but advanced actions require the Actions class.
//

//2️⃣ Why Do We Create an Object?

//In Java, non-static methods require an object to call them.
//
//dragAndDrop() is a non-static method inside the Actions class.
//So we must create an object.
//
//Example from your code:
//
//Actions acnt = new Actions(driver);
//
//Here:
//
//Actions → Class
//
//acnt → Object
//
//new Actions(driver) → Constructor that connects Actions with WebDriver

//What is Non-Static in Java?
//
//A non-static method or variable belongs to an object of a class, not to the class itself.
//So, to use it, you must create an object first.