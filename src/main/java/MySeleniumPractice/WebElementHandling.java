package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utlityclass.ElementUtil;

public class WebElementHandling {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.
		/*
		 * //create a webelement+ perform action(click, sendkeys, select, isDisplayed,
		 * getText) //By is class name, id is method name //
		 * driver.findElement(By.id("input-email")).sendKeys("nilesh@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("test123");
		 */

		// 2.create a webelement & stored in element & then used
		// WebElement is interface & we are creating interface reference variable
		/*
		 * WebElement email = driver.findElement(By.id("input-email")); 
		 * WebElement pwsd = driver.findElement(By.id("input-password"));
		 * 
		 * email.sendKeys("nilesh1@gmail.com"); 
		 * pwsd.sendKeys("test1234");
		 */

		//  - OR(object Repostrory)
		// 3 By locator

		/*
		 * By email=By.id("input-email");
		 * By password=By.id("input-password");
		 * 
		 * WebElement emailID=driver.findElement(email);
		 * WebElement pswd=driver.findElement(password); 
		 * emailID.sendKeys("nilesh121@gmail.com");
		 * pswd.sendKeys("test123");
		 */

		// 4.By locator+Generic function
		
//		  By email=By.id("input-email"); 
		//By pswd=By.id("input-password");
//		  getElement(email).sendKeys("nil12@gmail.com");
//		  getElement(pswd).sendKeys("test123");
//		  
		 //5.By locator+ getElement+action generic function
//		By email=By.id("input-email");
//		By pswd=By.id("input-password");
//
//		doSendKeys(email,"test12@gmail.com");
//		doSendKeys(pswd,"nil123");
//		// driver.quit();

		
		//6. By Locator+ ElementUtil-> generic functions
		By email=By.id("input-email");
     	By pswd=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(email, "nilesh11@gmail.com");
		eleUtil.doSendKeys(pswd, "nilesh123");
		
		//best approache
		//7: By locators+BrUtil+EleUtil
	}
	
	
	
}
