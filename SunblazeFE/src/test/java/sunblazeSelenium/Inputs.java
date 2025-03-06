package sunblazeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inputs extends Homepage {
	private WebDriver _driver;
	public By inputNumber = By.xpath("//div/p[text()='Number']/following-sibling::input[1]");
	//Inherit from Homepage Class will initiate its Constructor automatically
	public Inputs(WebDriver driver) 
	{
	    //Set driver here or else it will not be correctly referenced resulting in Object Reference Not set to Instance of Object error
	    super(driver);
		_driver = driver;
	    //Go to Test Page
	    _driver.findElement(_lnkInputs).click();
	}
}
