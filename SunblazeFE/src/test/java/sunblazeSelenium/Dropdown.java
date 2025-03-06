package sunblazeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown extends Homepage {
	private WebDriver _driver;
	public By dropdownField = By.id("dropdown");
	//Inherit from Homepage Class will initiate its Constructor automatically
	public Dropdown(WebDriver driver) 
	{
	    //Set driver here or else it will not be correctly referenced resulting in Object Reference Not set to Instance of Object error
	    super(driver);
		_driver = driver;
	    //Go to Test Page
	    _driver.findElement(_lnkDropdown).click();
	}
}
