package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Auth popup- where two input field are present on alert
public class AuthPopUpHandle {

	public static void main(String[] args) 
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	
	
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth/");
	//one hack - we need to pass username/pswd in URL only
    //limition is that if usernmae/pswd have @ fileld then next text after @ will be consider as domain name
	 //  so whenever create new user userId/pswd should be created without @
	
	//otherway is pass string concentate
	String username="admin";
	String password="admin";
	driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth/");

	
	
	String msg=driver.findElement(By.xpath("//div[@id='content']//p")).getText();
	System.out.println(msg); //directly will print msg. Selenium will take care internally to handle poup
	}

}
