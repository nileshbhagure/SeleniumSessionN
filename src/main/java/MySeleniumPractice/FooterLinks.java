package MySeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    By footers=By.xpath("//footer//a");
	    ArrayList<String> actFooterList=getFooterLinks(footers);
	
	  if (actFooterList.contains("Contact Us"))
	  {
		  System.out.println("Pass");
	  }
	}	
	
	//all footer stored in list & give it back
	public static ArrayList<String> getFooterLinks(By locator)
	{
		List <WebElement> footerlist=driver.findElements(locator);
		System.out.println(footerlist.size());
		
		ArrayList<String> eleTextlist=new ArrayList<String>();
		
		for(WebElement e: footerlist)
		{
			String text=e.getText();
			System.out.println(text);
			eleTextlist.add(text);
		}
	    return eleTextlist;
	}
}
