package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromedriverUtils {
	private static final String CHROME_DRIVER_PATH = "C:\\Selenium webdriver\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
	
	public static WebDriver intitializeDriver() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		
		//creates and return new WebDriver instance. Static method can skip object creation within itself
		return new ChromeDriver();
	}
	
	public static void navigatetowebsite(WebDriver driver, String url) {
		//Navigate to the site
		driver.get(url);
	}
}
