package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle{

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		//page
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(3000);
		//switch iFrame
       driver.switchTo().frame("frame-one748593425");
      driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Nilesh"); 
	
	
	//switching back to main page
      driver.switchTo().defaultContent();
	
	 }      
}
