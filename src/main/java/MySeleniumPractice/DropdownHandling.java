package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropdownHandling {
   static  WebDriver driver;
   
	public static void main(String[] args) 
	{
      //dropdown : select tag is mandatory
	// in Select class constructor we need to pass WebElement
	  //tag name: select
	  //Select class in Selenium
		
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
	WebElement country=driver.findElement(By.id("Form_getForm_Country"));  
	
	//we need to create object of Select Class from selenium
	//pass the webelement 
	//Select sel= new Select(country);
	
	//three method we have in Select Class
	//1. selectbyindex(int index)
	//2. selectbyvalue(String value)
	//3. selectbyvisibletext(String text)
	
	//sel.selectByIndex(5);// Indoria
	//sel.selectByVisibleText("India");   //prefere method
	//sel.selectByValue("Iceland");	// under option tag value attribute is present. sometime developer may not put the value attribute
	
	//we can also used sendkey
	//country.sendKeys("India");
	
	 Select sel=new Select(country);
     
	 List<WebElement> countryOptions=sel.getOptions();
   // check how much dropdown present     
     System.out.println("total options: "+(countryOptions.size()-1));
	
     //printing the option
     for(WebElement e:countryOptions )
     {
    	String text= e.getText();
    	System.out.println(text);
     }
     
//	 By country=By.id("Form_getForm_Country");
//	 doSelectDropDownByIndex(country,20);                                                 	 
//	 doSelectDropDownByIndex(country,30);                                                 	 

//   doSelectDropDownByVisibleText(country,"India");

//	 doSelectDropDownByValue(country, "Brazil");
	
	
	}

	public static void doSelectDropDownByIndex(By locator, int index)
	{
		Select s=new Select(getElement(locator));
		s.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text)
	{
		Select s=new Select(getElement(locator));
		s.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValue(By locator, String value)
	{
		Select s=new Select(getElement(locator));
		s.selectByValue(value);
	}
	
	//no of dropdown options
	public static List<WebElement> getDropDownOptions(By locator)
	{
		Select s=new Select(getElement(locator));
		return s.getOptions();
	}
	
	public static int getDropDownOptionsCount(By locator)
	{
		Select s=new Select(getElement(locator));
		return getDropDownOptions(locator).size();
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
}
