package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeFullScreen {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();

	//window()- browser window
    driver.manage().window().maximize();  //gives full screen
   // driver.manage().window().fullscreen(); //does not give full screen gives medium size depends upon machine 
    driver.get("https://www.google.com");
    
    
   //no use case
   // driver.manage().window().minimize();
    
    driver.quit();
    
	}

}
