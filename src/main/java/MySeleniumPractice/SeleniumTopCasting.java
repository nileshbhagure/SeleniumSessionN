package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) 
	{
	//1. Chrome/FF/Safari/Edge
	//Not topcasting but we can create object
    //valid but applicable only for Chrome. driver is pointing to only chrome
	//use case: when we need to used only chrome browser in company- specific browser 
	//	ChromeDriver driver=new ChromeDriver();
		
	//2. WD-CD valid -top casting: child class object can be refered as grand parent interface reference variable	
   // to run TC on locally
		//	WebDriver driver=new ChromeDriver();	
	 //same driver can point to others driver
//	 driver=new FirefoxDriver();
//	 driver=new SafariDriver();
//	 driver=new EdgeDriver();

	 //3. valid top casting but not useful(as only 2 method available findelement & findelements
	//	SearchContext driver=new ChromeDriver();
	 
		
	//4 valid & useful top casting- can acess all the method from remote web driver
      //if we want to launch our new own new browser so will get overides method from only RemotewebDriver so therewere we implement directly Webdriver Interface. we can write our own bussiness logic 
		//RemoteWebDriver driver=new ChromeDriver();
	
	//5 WD-RWD: valid & useful
	// to run test case on remote machine-cloud, server,grid, AWS             capabilities- which browser version we need to run                  
	//	WebDriver driver=new RemoteWebDriver(new URl("https://192.190.10.11/wd/hub"),capabilities);
		
	//6.SC--RWD- valid & not usedful
		
		
	}

}
