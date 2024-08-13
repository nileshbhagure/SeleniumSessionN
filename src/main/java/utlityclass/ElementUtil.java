package utlityclass;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	// no one can access this variable so declare private
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	//single webelments
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	//mutiple webelements
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribute(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);

	}

	public boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}


	//to check single element present 
	public boolean isSingleElement(By locator)
	{

	    List<WebElement> list=getElements(locator);
        System.out.println(list.size());
	    
        if(list.size()==1)
        {
       	 System.out.println("single search ele is present on the page");
         return true;
        }
        else
        {
       	 System.out.println("mutiple search ele present");
         return false;
        }
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	//capture text of each link
	//collect all the links & return the text 

	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	
	//**************Dropdownlist Utils************//
	//this solution work when html tag has Select tag
	
	public  void doSelectDropDownByIndex(By locator, int index)
	{
		Select s=new Select(getElement(locator));
		s.selectByIndex(index);
	}
	
	public  void doSelectDropDownByVisibleText(By locator, String text)
	{
		Select s=new Select(getElement(locator));
		s.selectByVisibleText(text);
	}
	
	public  void doSelectDropDownByValue(By locator, String value)
	{
		Select s=new Select(getElement(locator));
		s.selectByValue(value);
	}
	
	public List<WebElement> getDropDownOptions(By locator)
	{
		Select s=new Select(getElement(locator));
		return s.getOptions();
	}
	
	public int getDropDownOptionsCount(By locator)
	{
		return getDropDownOptions(locator).size();
	}

	//selecting value without SELECT class method
	public  void doSelectValueFromDropDown(By locator, String value)
	{
   	   List<WebElement> optionsList= getElements(locator);
       System.out.println(optionsList.size());    

		for(WebElement e: optionsList)
			   {
				String text=e.getText();
				System.out.println(text);
				
				//selecting any value from dropdown with Select Class
				//performancewise slightly less then Select method as it compare each & every text
			      if(text.equals(value))
			      {
			    	  e.click();
			    	  break;
			      }
	
			   }
	}

		//*------------------
		
		public void doSearch(String tagName,String text)
		{
		    By suggLocator=By.xpath("//"+tagName+"li[text()='"+text+"']");
			getElement(suggLocator).click();		
	}
	
}


