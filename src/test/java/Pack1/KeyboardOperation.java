package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.click();
//		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.sendKeys(search, "Iphone 13").sendKeys(Keys.ENTER).perform();
//		
//		action.keyDown(search, Keys.SHIFT)
//	      .sendKeys("Iphone 13")
//	      .keyUp(Keys.SHIFT)
//	      .sendKeys(" case")
//	      .perform();
//		keyDown(Keys.SHIFT) → Presses SHIFT key
//
//		sendKeys("Iphone 13") → Types text in uppercase
//
//		keyUp(Keys.SHIFT) → Releases SHIFT key
//
//		sendKeys("case") → Types normal lowercase text
//
//		perform() → Executes the action

	}
}