package Tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.HomePage;
import Utils.ChromedriverUtils;

public class Addremoveelements {
	public static void main(String[] args) {
		// Initialize WebDriver
		WebDriver driver = ChromedriverUtils.intitializeDriver();
		
		ChromedriverUtils.navigatetowebsite(driver, "https://the-internet.herokuapp.com");
		
		driver.manage().window().maximize();
		
		//Create an instance of HomePage
		HomePage homepage = new HomePage(driver);
		
		homepage.clickAddremoveelementslink();
		
		//introducing wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //10 second timeoout
		//WebDriver element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/button")));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
		
		driver.navigate().back();
		
		driver.quit();
		
	}
}
