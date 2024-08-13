package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestionlist {
    static WebDriver driver;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://google.com");
	
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	List<WebElement> sugList=driver.findElements(By.xpath(""));
	System.out.println(sugList.size()-1);
	
	for(WebElement e: sugList)
	{
	 	String text=e.getText();
	 	System.out.println(text);
	 	if(text.equals("selenium testing"))
	 	{
	 		e.click();
	 		break;
	 	}
	}
	}

}
