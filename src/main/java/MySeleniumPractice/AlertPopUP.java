package MySeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUP {

	public static void main(String[] args) throws InterruptedException 
	{
//       //JS popup
//		   -In browser console we can write our custom alert method
//         -In order to identify JS popup we cannot inspect, there are not part of webelement where we cannot inspect & identify element
//	       -We need to switch driver to popup first inspect text
		//Alert popup
	    // java script popup
		//also call modal dialog popup
	
		/*Three types of Alert- Javascript methods
		 *  1.alert()
		 *  2.confirm()
		    3.prompt()		      
		*/ 
		
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//popup is display when we click on Sign in button
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(4000);
	
	//Alert is Interface. alert() method will give interface reference variable  
	//using alert reference  we can used various method
	Alert alert=driver.switchTo().alert();
	
	String text=alert.getText();
	System.out.println(text);
	
	//Entering the value in  popup
	//alert.sendKeys("testing");

	
	//accept the alert
	//will click on OK button
	alert.accept();
	
	//dismiss the alert
	//will click on CANCEL button
	//alert.dismiss();
	
	//alert.sendKeys("testing");
	}

}


/* 2.prompt('please enter name')
    - user get input text box to enter field
    - CTA OK & CANCEL
  
   3.confirm('are you sure you want to delete this user')
     - you will get text msg along with OK and CANCEL CTA

*/