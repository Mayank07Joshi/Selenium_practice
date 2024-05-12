package Homepage;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Add_remove_test extends base_class.Baseclass{
	
	@Test(priority = 1)
	public void verify_link() {
		driver.findElement(By.linkText("Add/Remove Elements")).click();
	}
	
	@Test(priority = 2)
	public void verify_page_navigation() {
		
		//Verify h3 tag
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Add/Remove Elements");
	}
	
	@Test(priority = 3)
	public void verify_add_element_button() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//Verify adding an element
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		// Verify that a delete element is added

		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).getText(), "Delete");
	}
	
	@Test(priority = 4)
	public void verify_delete_button() {
		WebElement delete_element = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
		Assert.assertEquals(delete_element.getText(), "Delete");
		delete_element.click();
	}
}

	
