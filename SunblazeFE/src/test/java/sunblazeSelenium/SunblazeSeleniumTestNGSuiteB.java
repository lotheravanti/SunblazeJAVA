package sunblazeSelenium;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SunblazeSeleniumTestNGSuiteB {

	WebDriver _driver;
	
	@BeforeClass
	static void beforeAll() {
		System.out.println("Starting Tests");
	}
	
	@AfterClass
	static void afterAll() {
		System.out.println("Test(s) completed");
	}
	
	@BeforeMethod
    void setUp() {
		//Need to match WebDriver type between _driver and driver by getting .driver object from ChromeDriver class
		WebDriver driver = new ChromeDriver();
        _driver = driver;
        //Get Window Handle of Browser for working with multiple windows(pop-ups, etc)
        String windowHandle = _driver.getWindowHandle();
    }
	
    @Test
    void openHomepage() {
    	Homepage homePage = new Homepage(_driver);
    	String verifyHomePage = homePage.GetText(homePage._txtHomePagetitle);
    	assertEquals(verifyHomePage, "Welcome to the-internet", "Homepage text should appear");        
    }
    
    @Parameters("inputValue")
    @Test
    void inputNumbers(@Optional("23") String inputValue) {
    	Inputs inputs = new Inputs(_driver);
    	inputs.FieldSendKeys(inputs.inputNumber, inputValue);      
    }
    
    //Use a Data Provider to run the test multiple times with the specified values
    @Test(dataProvider = "inputNumbersDataProvider")
    void inputNumbersDataProvide(String inputValue) {
    	Inputs inputs = new Inputs(_driver);
    	inputs.FieldSendKeys(inputs.inputNumber, inputValue);      
    }
    
    //Two Dimensional Object array, tests will run each time using each Object as parameter(s)
    @DataProvider(name = "inputNumbersDataProvider")
    public static Object[][] inputNumbersDataProvider() {
    	return new Object[][] {
    			new Object[]{"41"},
    			new Object[]{"110"},
    			new Object[]{"92342761135"}
    	};
    }
    
    //Add a wait at the end of every test for visibility when running manually
    //Ensure driver is closed
    @AfterMethod
    void tearDown() throws InterruptedException {
    	//Thread.sleep requires Exception to be defined in JAVA
    	Thread.sleep(2000);
    	_driver.quit();
    }    
}
