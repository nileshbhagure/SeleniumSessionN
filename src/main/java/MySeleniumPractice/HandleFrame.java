package MySeleniumPractice;
/* to secure the UI Data frame is used
 *   eg banking application- login added in frames
 * 
 * Two type of frame
 *  1. Frame- 
 *     Not in used. 
 *     deprecreted from market, 
 *     n no of frame we can add,  can move Iframe
 *  2. IFrame
 * 
 * - same three method to used whether its frame or Iframe
 * 
 * Frame- Is also type of WebELement
 *      - it has it own HTML dom
 *      -it has own no of elements and attributes
        - Need to come inside the frame & interact with the frame
        -Three method we have in frame 
            -1.using index 
            -2.using frame name or Id
            -3.passing as a WebElement for frameelement

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("http://www.londonfreelance.org/courses/frames/index.html");
      
      //1.using index 
      //driver.switchTo().frame(2);
      
      //2.using frame name or Id
      //driver.switchTo().frame("main");
      
      //3. passing as a WebElement for frameelement
      driver.switchTo().frame(driver.findElement(By.name("main")));
       
      String text=driver.findElement(By.xpath("/html/body/h2")).getText();
	  System.out.println(text);
	}

}
