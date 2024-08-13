package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser 
{
	static WebDriver driver;	


	public static void main(String[] args) {
    
		
	//Running on chrome	
	//System.setProperty("webdriver.chrome.driver", "D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	//Running on firefox
//	WebDriver driver=new FirefoxDriver();
//	System.setProperty("webdriver.gecko.driver","D:\\software\\Automation\\Browser\\Mozila\\geckodriver.exe");
	
	//for safari- will work only on mac
	//WebDriver driver=new SafariDriver();

		
	//cross browser logic
   String browser="Chrome";
   switch (browser.toLowerCase()) {
	
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		break;

	case "firefox":
		driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","D:\\software\\Automation\\Browser\\Mozila\\geckodriver.exe");
		break;
		
	
	default:
		System.out.println("pls pass right browser");;
	    break;
   }
		
	 driver.get("https://www.google.com");
     String title= driver.getTitle();
     System.out.println("Page title is " +title);
	
     String s=driver.getCurrentUrl();
     System.out.println(s);
     
     driver.quit();
	}
}
