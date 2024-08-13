package xpathseg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//whenever you want to used go to grandparent tag used ancestor tag
//parent tag used to give immediate parent
// following-sibling give you immediate down next sibling
//preceding-sibling give immediate up sibling

public class CrickInfoTableHandling 
{
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/53350/eng-vs-aus-1st-test-the-ashes-2023");
		Thread.sleep(4000);
		
		//getWckTakerName("Ollie Pope");
	  
	  List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='Ollie Pope']//ancestor::span//following-sibling::span"));
	  
	  for(WebElement e:scoreList)
	  {
		  String text=e.getText();
          System.out.println(text);
}
	  
	}
	
	public static String getWckTakerName(String name)
	{
	      String wkt_Path="//a[text()='Ollie Pope']//ancestor::span//following-sibling::span";
	      String wktName= driver.findElement(By.xpath(wkt_Path)).getText();
		  System.out.println(wktName);
		 return wktName;
	}

}
