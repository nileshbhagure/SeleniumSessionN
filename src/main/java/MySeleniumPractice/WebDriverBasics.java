package MySeleniumPractice;
/*ChromeDriver is grandchild of Webdriver
 * Chromoiumdriver is a browser protocol
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*WebDriver-
 *  WebDriver is an interface
 
 */
public class WebDriverBasics {

	public static void main(String[] args) 
	{
//open chrome: browser
//launch url: google.com
//get the title
//verify the tile: actual vs exp
//close the browser

 
//Top casting: is done. Child class object can be refered by parent interface reference variable		
//Interface Refvariable	= object of ChromeDriver class. The ChromeDriver() constructor will be called & chrome browser will be launced
//		WebDriver driver=new ChromeDriver();
	
		/*for mac- one backward slash/ and no need to add .exe extension at the end of file
		System.setProperty("webdriver.chrome.driver", "D:/Software/Browser/chromedriver_win32");
		WebDriver driver=new ChromeDriver();*/
	   
		
		//for windows- whichever browser version present on system for respectively version download .exe file
		//download chromedriver.exe file-configure it
		//add .exe extend in value path at the end
	    System.setProperty("webdriver.chrome.driver", "D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch browser
	   
		//geturl
		driver.get("http://www.google.com");  //enter url
		
	    //get title of page
	   String title=driver.getTitle();   //get the title
	   System.out.println("page title : " + title); //tab name
	
	   //verification point: actual vs exp result
	   if(title.equals("Google"))
	   {
		   System.out.println("PASS");
	   }
	   else
	   {
		   System.out.println("FAIL");
	   }
	
	//capture the current url
	   String url=driver.getCurrentUrl();
	   System.out.println("Current Url of is page: " + url);
	
	
	//get the source of page
	/*
	 * String source= driver.getPageSource(); System.out.println("the page source "
	 * +source); if(source.contains("Google Inc.")) { System.out.println("PASS"); }
	 * else { System.out.println("FAIL"); }
	 */
	   
	   
	 //close the browser
	 driver.quit();  //close all windows & end webdriver session
	 //driver.close();  //close current focused window however the web driver session remains active
	 
	}	
	
}
