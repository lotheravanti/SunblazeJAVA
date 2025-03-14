package sunblazeSelenium;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SunblazeSelenium {

	WebDriver _driver;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Starting Tests");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Test(s) completed");
	}
	
	@BeforeEach                                         
    void setUp() {
		//Need to match WebDriver type between _driver and driver by getting .driver object from ChromeDriver class
		WebDriver driver = new ChromeDriver();
        _driver = driver;
        //Get Window Handle of Browser for working with multiple windows(pop-ups, etc)
        String windowHandle = _driver.getWindowHandle();
    }
	
    @Test                                               
    @DisplayName("Navigate to Homepage")   
    void openHomepage() {
    	Homepage homePage = new Homepage(_driver);
    	String verifyHomePage = homePage.GetText(homePage._txtHomePagetitle);
    	assertEquals(verifyHomePage, "Welcome to the-internet", "Homepage text should appear");        
    }
    
    @Test                                               
    @DisplayName("Navigate to Add/Remove")   
    void addRemove() throws InterruptedException {
    	AddRemove addRemove = new AddRemove(_driver);
    	int timesClick = 3;
    	addRemove.ClickMultiple(addRemove._btnAddElement, timesClick);
    	Thread.sleep(1000);
    	int numDeleteButtons = addRemove.GetElements(addRemove._btnDeleteElement).size();
    	assertEquals(numDeleteButtons, timesClick, String.format("The Add button was clicked %d times and that many Delete buttons appeared", timesClick));  
    	addRemove.ClickMultiple(addRemove._btnDeleteElement, timesClick - 1);
    	int remainingDeleteButtons = addRemove.GetElements(addRemove._btnDeleteElement).size();
    	assertEquals(remainingDeleteButtons, 1, "One Delete button remaining");
    	Thread.sleep(1000);
    }
    
    @Test                                               
    @DisplayName("Navigate to Dropdown")   
    void selectFromDropdown() throws InterruptedException {
    	Dropdown dropdown = new Dropdown(_driver);
    	dropdown.SelectByTextDropdown(dropdown.dropdownField, "Option 2");
    	//So we can observe it actually changed
    	Thread.sleep(1000);
    	dropdown.SelectByTextDropdown(dropdown.dropdownField, "Option 1");     
    }
    
    @Test                                               
    @DisplayName("Navigate to Inputs")   
    void inputNumbers() {
    	Inputs inputs = new Inputs(_driver);
    	inputs.FieldSendKeys(inputs.inputNumber, "23");      
    }
    
    //Add a wait at the end of every test for visibility when running manually
    //Ensure driver is closed
    @AfterEach
    void tearDown() throws InterruptedException {
    	//Thread.sleep requires Exception to be defined in JAVA
    	Thread.sleep(2000);
    	_driver.quit();
    }    
}
