package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//simulation of navigate
public class NavigationMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\software\\Automation\\Browser\\chrome\\chromedriver.exe");	
    WebDriver driver=new ChromeDriver();
	
	//driver.get() & driver.navigate() both method are same. exact synomnys. implementation wise both are same
    //only difference is navigate method is overloaded method where we have URL type 
    //in navigate method we have back(), forward(), refresh()
    //working on main app we can used get & navigate when we want to go to external link like social media etc
    driver.get("https://www.google.com");
    System.out.println(driver.getTitle());
    
    //navigate() method is used when we need to go to external link like to check social media pages link from home page
    driver.navigate().to("https:\\www.amazon.com");
   // driver.navigate().to(new URL("www.amazon.com"));
    System.out.println(driver.getTitle());
    
    driver.navigate().back();
    System.out.println(driver.getTitle());

    driver.navigate().forward();
    System.out.println(driver.getTitle());

    driver.navigate().back();
    System.out.println(driver.getTitle());
    
    //refresh the page
    driver.navigate().refresh();
    

    driver.quit();

	}

}
