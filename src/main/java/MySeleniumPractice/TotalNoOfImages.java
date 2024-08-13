package MySeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNoOfImages {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("total no of images " + imagesList.size());
//
//		// src and alt
//		for (WebElement e : imagesList) {
//			String srcvalue = e.getAttribute("src");
//			String altval = e.getAttribute("alt");
//
//			System.out.println(srcvalue + " :" + altval);
//
//		}
           By images= By.tagName("img");
           By links=By.tagName("a"); 
           
//           System.out.println("total images " +getElements(images).size());
//           System.out.println("total links " +getElements(links).size());

              int totalLinks=getElementsCount(links);
              System.out.println("Total no of link:"+totalLinks);
              
              if(totalLinks>200)
              {
            	  System.out.println("PASS");
              }
              
              int totalImages=getElementsCount(images);              
	          System.out.println("Total no of images:"+totalImages);
	
	         ArrayList<String> linksTextList=getElementsTextList(links);
	         System.out.println(linksTextList);
	         
	         
	}         

		
	  public static List<WebElement> getElements(By locator)
	  {
		  return driver.findElements(locator);
	  }
	
	  public static int getElementsCount(By locator)
	  {
		  return getElements(locator).size();
	  }
	  
	  
	  //capture text of each link
	  //collect all the links & return the text 
	  public static ArrayList<String> getElementsTextList(By locator)
	  {
		  List<WebElement> eleList=getElements(locator);
	      
		  //create empty list
		  ArrayList<String> eleTextList=new ArrayList<String>();
	     //List is parent interface of ArrayList. we can write ArrayList also on right/left side
		  
	      for(WebElement e: eleList)
	      {
	    	  String text=e.getText();
	    	  if(text.length()!=0) {
		       eleTextList.add(text);
	    	  }
	      }
	      return eleTextList;
	  }
	  
}
