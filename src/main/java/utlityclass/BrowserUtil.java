package utlityclass;
//created template util class- A common code which can be used by all test script

import java.net.URL;

//wrapper class we have created

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	// not declare as static are static are stored in CMA common memory allocation. 
	// its does not support parellel execution as thread need to wait
	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 */

	public WebDriver launchBrowser(String browser) {
		System.out.println("The browser name is :" + browser);

		switch (browser.toLowerCase()) {

		case "chrome":
			//System.setProperty("webdriver.chrome.driver","D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
            //System.setProperty("webdriver.gecko.driver", "D:\\software\\Automation\\Browser\\Mozila\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		/* safari will not work on windows. No need to download .exe for mac. selenium will take care of it also for DriverManager
		 * case "safari": driver=new SafariDriver(); break;
		 */
		     

		default:
			System.out.println("pls pass right browser");
			break;
		}
		return driver;
	}

	//method ovrerloading launchURL
	public void launchUrl(URL url) throws Exception {
		String newUrl=String.valueOf(url);
		if (newUrl == null) {
			System.out.println("url is null");
			throw new Exception("URLisNull");
		}

		if (newUrl.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLIsBlank");
		}
	}
	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLisNull");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLIsBlank");
		}
		
		
		//https:www.amazon.com
		//indexof will return -1 if false
		if(url.indexOf("http")!=0 && url.indexOf("https")!=0) {
			System.out.println("http(s) is missing in url");
		    throw new Exception("HTTP(s)MissingException");
		}

		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title " + title);
		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title..");
			return null;
		}

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		if (url != null) {
			return url;
		} else {
			System.out.println("getting null url..");
			return url;
		}

	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed");
		}
	}

	public void quitBroswer() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed");

		}
	}

}
