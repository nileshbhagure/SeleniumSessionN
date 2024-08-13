package MySeleniumPractice;
/*
 *driver.quit();  //close all windows & end webdriver session. Session id will be Null
 driver.close();  //close current focused window however the web driver session remains active. Will get exception session id will be invalid or expired

 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionID {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
		
		/*
		 * String title=driver.getTitle();
		 * System.out.println("the title of page is : "+title); //Google
		 * 
		 * //driver.quit(); //end the session & close all window //after quit try to
		 * access element from browser //System.out.println(driver.getTitle());
		 * //NoSuchSessionException: Session ID will be null. Using WebDriver after calling
		 * quit()?
		 * 
		 * //the new session id will be generated driver=new ChromeDriver();//launch
		 * chrome browser driver.get("https://www.amazon.com");
		 * System.out.println(driver.getTitle()); driver.quit();
		 */

		
		//for close
		
		driver.close(); //close current focused window however the web driver session remains active
		
	//after close if we try to access the element will get selenium.NoSuchSessionException: invalid session id	
   // howeever the session id will be active
	//System.out.println(driver.getTitle());  //invalid session id
		
		
	}

}
