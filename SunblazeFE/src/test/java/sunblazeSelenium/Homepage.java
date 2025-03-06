package sunblazeSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage {	
    private WebDriver _driver;
    public By _txtHomePagetitle = By.xpath("//h1[text()='Welcome to the-internet']");
    public By _lnkInputs = By.xpath("//a[text()='Inputs']");
    public By _lnkDropdown = By.xpath("//a[text()='Dropdown']");
    //Storing manipulator methods in Homepage class since all others Page classes are derived from it in current framework
    public void ClickOn(By by)
    {
        _driver.findElement(by).click();
    }
    public void FieldSendKeys(By by, String inputValue)
    {
        _driver.findElement(by).sendKeys(inputValue);
    }
    //Function instead of Method for retrieving the String of a Text from a Web Element
    //Declare return type: String
    public String GetText(By by)
    {
        return _driver.findElement(by).getText();
    }
    public void SelectByTextDropdown(By by, String text)
    {
        Select selectElement = new Select(_driver.findElement(by));
        selectElement.selectByVisibleText(text);
    }
    public Homepage(WebDriver driver)
    {
        _driver = driver;
        _driver.navigate().to("https://the-internet.herokuapp.com");
    }
}
