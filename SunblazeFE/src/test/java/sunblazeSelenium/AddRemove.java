package sunblazeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemove extends Homepage {
	private WebDriver _driver;
	public By _btnAddElement = By.xpath("//button[text()='Add Element']");
	public By _btnDeleteElement = By.xpath("//button[text()='Delete']");
	//Inherit from Homepage Class will initiate its Constructor automatically
	public AddRemove(WebDriver driver) 
	{
	    //Set driver here or else it will not be correctly referenced resulting in Object Reference Not set to Instance of Object error
	    super(driver);
		_driver = driver;
	    //Go to Test Page
	    _driver.findElement(_lnkAddRemove).click();
	}
}
