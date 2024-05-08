//this is a page object class for facilitating easy access to all the links of the homepage

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	private WebDriver driver;
	
	//Constructor to initialize webdriver
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators for all the links on homepage
	private By ABtestinglink = By.linkText("A/B Testing");
	private By Addremoveelementslink = By.linkText("Add/Remove Elements");
	private By BasicAuthlink = By.linkText("Basic Auth");
	private By Brokenimageslink = By.linkText("Broken Images");
	private By ChallengingDOMlink = By.linkText("Challenging DOM");
	private By Checkboxeslink = By.linkText("Checkboxes");
	private By ContextMenulink = By.linkText("Context Menu");
	private By DigestAuthenticationlink = By.linkText("Digest Authentication");
	private By DisappearingElementslink = By.linkText("Disappearing Elements");
	private By DragandDroplink = By.linkText("Drag and Drop");
	private By Dropdownlink = By.linkText("Dropdown");
	private By DynamicContentlink = By.linkText("Dynamic Content");
	private By DynamicControlslink = By.linkText("Dynamic Controls");
	private By DynamicLoadinglink = By.linkText("Dynamic Loading");
	private By EntryAdlink = By.linkText("Entry Ad");
	private By ExitIntentlink = By.linkText("Exit Intent");
	private By FileDownloadlink = By.linkText("File Download");
	private By FileUploadlink = By.linkText("File Upload");
	private By FloatinMenulink = By.linkText("Floating Menu");
	private By ForgotPasswordlink = By.linkText("Forgot Password");
	private By FormAuthenticationlink = By.linkText("Form Authentication");
	private By Frameslink = By.linkText("Frames");
	private By Geolocationlink = By.linkText("Geolocation");
	private By HorizontalSliderlink = By.linkText("Horizontal Slider");
	private By Hoverslink = By.linkText("Hovers");
	private By InfiniteScrolllink = By.linkText("Infinite Scroll");
	private By Inputslink = By.linkText("Inputs");
	private By JqueryUImenuslink = By.linkText("JQuery UI Menus");
	private By JavaScriptAlerts = By.linkText("JavaScript Alerts");
	private By JavaScriptonloadeventerrorlink = By.linkText("JavaScript onload event error");
	private By KeyPresseslink = By.linkText("Key Presses");
	private By LargeanddeepDOMlink = By.linkText("Large & Deep DOM");
	private By MultipleWidowslink = By.linkText("Multiple Windows");
	private By NestedFrameslink = By.linkText("Nested Frames");
	private By NotificationMessageslink = By.linkText("Notification Messages");
	private By Redirectlink = By.linkText("Redirect Link");
	private By Securefiledownloadlink = By.linkText("Secure File Download");
	private By ShadowDOMlink = By.linkText("Shadow DOM");
	private By ShiftingContentlink = By.linkText("Shifting Content");
	private By SlowResourceslink = By.linkText("Slow Resources");
	private By Sortabledatatableslink = By.linkText("Sortable Data Tables");
	private By Statuscodeslink = By.linkText("Status Codes");
	private By Typoslink = By.linkText("Typos");
	private By WYSIWYGEditorlink = By.linkText("WYSIWYG Editor");
	
	//-----------------Creating click functions for each link------------------------------
	//---------------------------***************************************************--------------------------------
	
	public void clickABtestinglink() {
		driver.findElement(ABtestinglink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickAddremoveelementslink() {
		driver.findElement(Addremoveelementslink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickBasicAuthlink() {
		driver.findElement(BasicAuthlink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickBrokenimageslink() {
		driver.findElement(Brokenimageslink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickChallengingDOMlink() {
		driver.findElement(ChallengingDOMlink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickCheckboxeslink() {
		driver.findElement(Checkboxeslink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickContextMenulink() {
		driver.findElement(ContextMenulink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDigestAuthenticationlink() {
		driver.findElement(DigestAuthenticationlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDisappearingElementslink() {
		driver.findElement(DisappearingElementslink).click();
	}
	
	//---------------------------***************************************************--------------------------------
	
	public void clickDragandDroplink() {
		driver.findElement(DragandDroplink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDropdownlink() {
		driver.findElement(Dropdownlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDynamicContentlink() {
		driver.findElement(DynamicContentlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDynamicControlslink() {
		driver.findElement(DynamicControlslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickDynamicLoadinglink() {
		driver.findElement(DynamicLoadinglink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickEntryAdlink() {
		driver.findElement(EntryAdlink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickExitIntentlink() {
		driver.findElement(ExitIntentlink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickFileDownloadlink() {
		driver.findElement(FileDownloadlink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickFileUploadlink() {
		driver.findElement(FileUploadlink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickFloatinMenulink() {
		driver.findElement(FloatinMenulink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickForgotPasswordlink() {
		driver.findElement(ForgotPasswordlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickFormAuthenticationlink() {
		driver.findElement(FormAuthenticationlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickFrameslink() {
		driver.findElement(Frameslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickGeolocationlink() {
		driver.findElement(Geolocationlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickHorizontalSliderlink() {
		driver.findElement(HorizontalSliderlink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickHoverslink() {
		driver.findElement(Hoverslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickInfiniteScrolllink() {
		driver.findElement(InfiniteScrolllink).click();
	}
	
	//---------------------------***************************************************--------------------------------


	public void clickInputslink() {
		driver.findElement(Inputslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickJqueryUImenuslink() {
		driver.findElement(JqueryUImenuslink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickJavaScriptAlerts() {
		driver.findElement(JavaScriptAlerts).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickJavaScriptonloadeventerrorlink() {
		driver.findElement(JavaScriptonloadeventerrorlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickKeyPresseslink() {
		driver.findElement(KeyPresseslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickLargeanddeepDOMlink() {
		driver.findElement(LargeanddeepDOMlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickMultipleWidowslink() {
		driver.findElement(MultipleWidowslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickNestedFrameslink() {
		driver.findElement(NestedFrameslink).click();
	}	
	
	//---------------------------***************************************************--------------------------------

	public void clickNotificationMessageslink() {
		driver.findElement(NotificationMessageslink).click();
	}	

	//---------------------------***************************************************--------------------------------

	public void clickRedirectlink() {
		driver.findElement(Redirectlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickSecurefiledownloadlink() {
		driver.findElement(Securefiledownloadlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickShadowDOMlink() {
		driver.findElement(ShadowDOMlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickShiftingContentlink() {
		driver.findElement(ShiftingContentlink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickSlowResourceslink() {
		driver.findElement(SlowResourceslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickSortabledatatableslink() {
		driver.findElement(Sortabledatatableslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickStatuscodeslink() {
		driver.findElement(Statuscodeslink).click();
	}
	
	//---------------------------***************************************************--------------------------------

	public void clickTyposlink() {
		driver.findElement(Typoslink).click();
	}

	//---------------------------***************************************************--------------------------------

	public void clickWYSIWYGEditorlink() {
		driver.findElement(WYSIWYGEditorlink).click();
	}
}