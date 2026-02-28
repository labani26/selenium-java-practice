package Pack1;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");

	}

}
