package sunblazeSelenium;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Lists;

public class SortableDataTables extends Homepage {
	private WebDriver _driver;
	public By _tblTable1 = By.xpath("//table[@id='table1']");
	//Inherit from Homepage Class will initiate its Constructor automatically
	public List<LinkedHashMap<String, String>> GetTable(By by)
    {
		List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();
		//Get Headers which will make sorting easier
		//Dynamic XPath expression using base table XPath + path to headers
		By tableHeadersLoc = By.xpath(String.format("%s/thead/tr/th", _tblTable1.toString().split(" ")[1]));
		List<WebElement> allHeaderElements = super.GetElements(tableHeadersLoc);
		List<String> allHeaderNames = new ArrayList<String>();
		for (WebElement header: allHeaderElements) {
			String headerName = header.getText();
			allHeaderNames.add(headerName);
		}
		//Get List of all rows
		By rowLoc = By.xpath(String.format("%s/tbody/tr", _tblTable1.toString().split(" ")[1]));
		List<WebElement> allRowsElements = super.GetElements(rowLoc);
		//Starting from 1 as XPath index starts from 1
		for (int i = 1; i <= allRowsElements.size(); i++) {
			//Iterating over each row in table
			String specificRowLoc  = String.format("%s/tbody/tr[%d]", _tblTable1.toString().split(" ")[1], i);
			//Locating only cells of specific row.
			List<WebElement> allColumnsElements = _driver.findElement(By.xpath(specificRowLoc)).findElements(By.tagName("td"));
			//Creating a LinkedHashMap to store key-value pair data
			LinkedHashMap<String, String> eachRowData = new LinkedHashMap<>();
			//Iterating over each cell in row
			for (int j = 0; j < allColumnsElements.size(); j++) {
				//Get cell value and create new LinkedHashMap entry of pair {header name : cell value}
				String cellValue = allColumnsElements.get(j).getText();
				eachRowData.put(allHeaderNames.get(j), cellValue);
			}
			//Add LinkedHashMap of row to list
			allTableData.add(eachRowData);
		}
		return allTableData;
    }
	public List<LinkedHashMap<String, String>> TableDataSortedBy(List<LinkedHashMap<String, String>>tableData, String sortByValue, boolean orderAsc)
    {	
    	List<LinkedHashMap<String, String>> sortedTable = new ArrayList<LinkedHashMap<String, String>>();
    	//Create a LinkedHashMap of original index order and corresponding Column value, => {0, "Smith"}{1, "Bach"}{2, "Doe"}{3, "Conway"}
    	LinkedHashMap<Integer,String> unsortedValues = new LinkedHashMap<Integer,String>();    	
    	int iterator = 0;
    	for (LinkedHashMap<String, String> item: tableData) {
    		unsortedValues.put(iterator, item.get(sortByValue));
    		iterator++;
    	}    	
    	//Sort the map by its values using Stream API => {1, "Bach"}{3, "Conway"}{2, "Doe"}{0, "Smith"}
		Map<Integer, String> sortedByValueMap = unsortedValues.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
    	//Add values to sortedTable using order and keys from sortedByValueMap
		for (var entry : sortedByValueMap.entrySet()) {
    		sortedTable.add(tableData.get(entry.getKey()));
    	}
		// Return ordered Table by Ascending or Descending, depending on value of orderAsc boolean
    	return orderAsc ? sortedTable : Lists.reverse(sortedTable);
    }
	public void SortTableBy(String sortByValue) {
		By sortLoc = By.xpath(String.format("%s/thead/tr/th/span[text()='%s']", _tblTable1.toString().split(" ")[1], sortByValue));
		super.ClickOn(sortLoc);
	}
	public SortableDataTables(WebDriver driver) 
	{
	    //Set driver here or else it will not be correctly referenced resulting in Object Reference Not set to Instance of Object error
	    super(driver);
		_driver = driver;
	    //Go to Test Page
	    _driver.findElement(_lnkSortableDataTables).click();
	}
}
