package Homepage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AB_test extends base_class.Baseclass {
	
	@Test
	public void verify_link() {
		driver.findElement(By.linkText("A/B Testing")).click();
	}
	
	@Test
	public void verify_navigation_to_AB_test() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// Verifying the title of the page
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "A/B Test Variation 1");
		// Verifying the content other than title
		String expected_content = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText(), expected_content);
	}
	
}
