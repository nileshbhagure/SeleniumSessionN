package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelect 
{
    static WebDriver driver;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
		//select/option--232 country
	//   /forward slash mean immediate child
//	   List<WebElement> optionsList= driver.findElements(By.xpath("//select/option"));
//	   System.out.println(optionsList.size());    
	
		By Country=By.xpath("//select/option");
		doSelectValueFromDropDown(Country, "Germany");
	}   
	   //printing all the value of text
//	   for(WebElement e: optionsList)
//	   {
//		String text=e.getText();
//		System.out.println(text);
//		
//		//selecting any value from dropdown with Select Class
//	      if(text.equals("India"))
//	      {
//	    	  e.click();
//	    	  break;
//	      }
//	   }
	   
   
		
		public static List<WebElement> getElements(By locator)
		{
			return driver.findElements(locator);
			
		}
	
		public static void doSelectValueFromDropDown(By locator, String value)
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

}
