package MySeleniumPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utlityclass.ElementUtil;

public class ElementsSectionLinks {
    
	
	public static void main(String[] args) 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
	  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	 //getting link from specific page- Vertical Section
	
//	 List<WebElement> sectionsLink=driver.findElements(By.className("list-group-item"));
//	 System.out.println(sectionsLink.size());
//	
//	 //printing the text of elements
//	for(WebElement e:sectionsLink)
//	{
//       System.out.println(e.getText());		
//	}
//	
      By rightSecLink=By.className("list-group-item");
	  ElementUtil eleUtil=new ElementUtil(driver); 	  
	  ArrayList<String> textlist= eleUtil.getElementsTextList(rightSecLink);
	System.out.println(textlist);
	  if(textlist.contains("Order History")) {
		System.out.println("PASS");
	}
	}

}
