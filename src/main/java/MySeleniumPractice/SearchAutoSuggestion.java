package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAutoSuggestion {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macboo");
		Thread.sleep(4000);
		
		//doSearch("macbook air");
	}
//		
//		List<WebElement> sugglist = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div//div//div"));
//
//		for (WebElement e : sugglist) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.contains("macbook pro"))
//			{
//				e.click();
//				break;
//			}
//			
//		}
		
		public static void doSearch(String text)
		{
		    By suggLocator=By.xpath("//li[text()='"+text+"']");
			driver.findElement(suggLocator).click();
		
	}
}
