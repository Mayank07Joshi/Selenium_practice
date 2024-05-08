package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiteNavigation {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	
	driver.manage().window().maximize();
	}

}
