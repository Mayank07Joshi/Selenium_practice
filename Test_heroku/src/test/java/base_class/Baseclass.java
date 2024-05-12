package base_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
    protected WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browserName) {
        try {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browserName);
            }
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
        } catch (Exception e) {
            System.err.println("Failed to initialize WebDriver: " + e.getMessage());
        }
        try {
        	Thread.sleep(2000);
        	} catch (InterruptedException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        	}
    }
    

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
