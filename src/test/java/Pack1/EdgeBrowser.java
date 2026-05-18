package Pack1;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

	}
}