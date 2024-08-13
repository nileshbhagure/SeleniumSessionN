package xpathseg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("https://classic.crmpro.com/index.html");

	  driver.findElement(By.name("username")).sendKeys("newautomation");
	  driver.findElement(By.name("password")).sendKeys("Selenium@1234");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	  Thread.sleep(3000);
	  
	  driver.switchTo().frame("mainpanel");
	  
	  driver.findElement(By.linkText("CONTACTS")).click();
	  

	//  selectContact("Nilesh Bhagure");
	  
	  /*In DOM- 
	  Left direction- upwards direction
	  downward mean- Right Direction
	  tr-> table row
	  td-> table data/coulmn
	  Right hand -following sibling
      going from below to up-> Precedding sibling
	  
	  sibling to sibling
	  child to parent-> /parent::htmltag
*/
//	  String cont_xpath= "//a[text()='Nilesh Bhagure']/parent::td/preceding-sibling::td/input[@type='checkbox']";  
//		driver.findElement(By.xpath(cont_xpath)).click();
	
//	
//	List<WebElement> contactList= driver.findElements(By.xpath("//a[text()='Kevin Froster']/parent::td/following-sibling::td"));   //gives 6 elements
//	ArrayList<String> contvalues=new ArrayList<String>();
//	for(int i=0; i<contactList.size()-1; i++)
//			{
//		String text=contactList.get(i).getText();			
//			System.out.println(text);
//			contvalues.add(text);
//			
//			}
//	           
//	}
	
	  getUserinfo("Nilesh Bhagure");
}	
	
	public static ArrayList<String> getUserinfo(String userName)
	{
		List<WebElement> contactList= driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));   //gives 6 elements
		ArrayList<String> contValues=new ArrayList<String>();
		for(int i=0; i<contactList.size()-1; i++)
		{
			String text=contactList.get(i).getText();
			System.out.println(text);
			contValues.add(text);
			
		}
	
		return contValues;
	}

	public static void selectContact(String userName)
	{
		    String cont_xpath= "//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";  
			driver.findElement(By.xpath(cont_xpath)).click();
	}
}
