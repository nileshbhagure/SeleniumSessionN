package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {

	static WebDriver driver;
	public static void main(String[] args) 
	{
    WebDriverManager.chromedriver().setup();	
    driver=new ChromeDriver();
    
    driver.get("https://app.hubspot.com/login");
//    
//    driver.findElement(By.id("username")).sendKeys("nilesh@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("nilesh@123");
//    driver.findElement(By.id("loginBtn")).click();
 
     //By locator
     By username=By.id("username");
     By pswd=By.id("password");
     By loginbuton=By.id("loginBtn");

     doSendKeys(username,"nilesh@gmail.com");
     doSendKeys(pswd,"nil@123");
     doClick(loginbuton);
    
}
	
	   
	
    public static WebElement getElement(By locator)
    {
    	return driver.findElement(locator);
	} 
    
    public static void doSendKeys(By locator, String value)
    {
    	getElement(locator).sendKeys(value);
    	
    }
    
    public static void doClick(By locator)
    {
    	getElement(locator).click();
    	
    }
    
}