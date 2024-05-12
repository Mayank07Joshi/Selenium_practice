package Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Site_navigation_test extends base_class.Baseclass{
		
	String expected_title = "The Internet";
	@Test
	public void verify_title() {
		Assert.assertEquals(driver.getTitle(), expected_title);
	}
		
}