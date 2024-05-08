package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import Pages.HomePage;
import Utils.ChromedriverUtils;
import org.testng.Assert;

public class AB_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = ChromedriverUtils.intitializeDriver();
		ChromedriverUtils.navigatetowebsite(driver, "https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		//homepage instance
		HomePage homepage = new HomePage(driver);
		
		homepage.clickABtestinglink();
		
		// Verify the page title
		String expectedtitle = "A/B Test Variation 1";
		String actualtitle = driver.getTitle();
		
		Assert.asserEquals(actualtitle, expectedtitle, "Title does not match");
		
		
		
	}

}
