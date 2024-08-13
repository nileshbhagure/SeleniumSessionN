package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//WebDriverManager is an open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.) in a fully automated manner. 
//In addition, WebDriverManager provides other relevant features, such as the capability to discover browsers installed in the local system, building WebDriver objects (such as ChromeDriver, FirefoxDriver, EdgeDriver, etc.), and running browsers in Docker containers seamlessly.

//In order to avoid compatablity issues we used WebDriverManager
//WDM- Its third party library, not provide by selenium
// Chrome 100-> system--> .exe 100-> If browser version updated to 101 WDM will automatically change update to .exe to 101
public class WebDriverManagerConcept {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");	
        //.exe (100)- if chrome browser updated automatically then manually we need to update .exe file as well- in order to avoid this we used WDM
	    //Drivermanager download in locak cached located on -/cache/selenium by default
	//WebDriverManager is a class	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
    String title= driver.getTitle();
    System.out.println("Page title is " +title);
	
    String s=driver.getCurrentUrl();
    System.out.println(s);
    
    driver.quit();
	
	}

}
