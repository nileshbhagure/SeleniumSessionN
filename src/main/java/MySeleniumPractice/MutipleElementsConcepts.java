package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//both methods present in search context interface
//Single WebElement--FindElement--return type WebElements--If no element found then return "NOSUCHELEMENTFOUNDEXCEPTION"
//Mutiple WebElements--FindElements-- return type List<WebElement>>--If no element found then return "Empty list"
//used case
//  -total no of links
//  - total no of images on the page
public class MutipleElementsConcepts 
{
 
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        
     // total no of links
     // Print the text of each link on consol
     //do not print blank value	
     
    //print the href value of each link    
        
           //Generic 
       List<WebElement> linkList= driver.findElements(By.tagName("a"));
       System.out.println("total no of link "+linkList.size()); 

//	index based loop
//	for(int i=0; i<linkList.size(); i++)
//	{
//		String text=linkList.get(i).getText();
//	   //avoid blank random link
//		if(text.length() !=0)
//	   {
//		System.out.println(text); 
//	   }
//	}
	   

//For each loop
       for(WebElement e: linkList)
       {
    	   String text=e.getText();
    	   if(text.length()!=0)
    	   {
    		   System.out.println(text);
    	   }
    	   String hrefvalu=e.getAttribute("href");
           System.out.println(hrefvalu);
       }
       
       
	}

}
