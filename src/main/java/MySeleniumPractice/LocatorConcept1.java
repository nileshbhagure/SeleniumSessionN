package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept1
{
   //There are 8 locator available
	//All 8 locator are available in By class 
	
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
	    WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//
//		//1. ID: always unique. it will search fast. first prefrenece
//		//By.id("test");
//		
//		//2. Name: can be duplicate, 2nd preference
//		driver.findElement(By.name("email")).sendKeys("nil@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("nil123");
//	    //By.type-NA
//		
//		//3. className: can be duplicate most of time,
//		driver.findElement(By.className("form-control"));
//		
	
		//4. linkText: only for links
		//htmltag=<a>
		//anchor tag
	  //driver.findElement(By.linkText("Login")).click();
		
		//5.PartialLinkText: only for links
		//not to used: where we have two button with same name "Forgotten Username" & "Forgotten Password"
		//when we have long text eg like pagaraph in that case instead of written whole text used partial 
		//driver.findElement(By.partialLinkText("Forgotten")).click();
	
		//6.x path: address of the web element on page[DOM]
	    //its not an attribute
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("nilesh");
	 
		//7. css selector: 
	    //its not an attribute
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("bhagure");

		
		//8 Tag Name
		//html tag: not an attribute
		//used only
	//	driver.findElement(By.tagName("input")).sendKeys("nil");
//		String header=driver.findElement(By.tagName("h1")).getText();
//	    System.out.println(header);
    
	    By header= By.tagName("h1");
	    By recpayment=By.linkText("Recurring payments");
	    By warMesg=By.className("alert");  //using one class, class are space separetly
	    
	    By continueBtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	    
	    
	    String actHeader=doGetText(header);
	    if(actHeader.equals("Register Account"))
	    {
	    	System.out.println("correct header");
	    }
	    else
	    {
	    	System.out.println("incorrect header");

	    }
	  String recPaymentText=doGetText(recpayment);
	  System.out.println(recPaymentText);
	
	  doClick(continueBtn);
	  String warnMesgvalue=doGetText(warMesg);
	  System.out.println(warnMesgvalue);
	
	}
	
	public static String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator)
	  {
		  getElement(locator).click();
	  }
	  

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
}
