package xpathseg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath {
	public static void main(String[] args) {
		
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://app.hubspot.com/login");
		
/*Xpath- is not attribute or properites
    -Xpath is address of WebElement in DOM
	
	Two types of xpath
	1.Abosulte xpath: eg /html/body/header/div/div/div[2]/div/input
	   - from parent to child, sart with / slash
	   -not recommended to used as if any element added/remove then will not get desire elem
	2. Relative/Custom xpath
	   htmltagname[@attiributename='value']
	
	 -for single element
	   //input[@name='email']
	
	 -for mutiple element [used and keyword]
	 //input[@name='email' and @placeholder='E-Mail Address']
	 //input[@name='email' and @type='text']
	
	and- both should be satified
	or- either one should be satified
	//input[@class='form-control' or @type='text']
	
	Function in Xpath
	//1.text(): Its a function or properties
	 where we dont have any attribute
	 //htmltagname[text()='value']
	//h2[text()='Returning Customer']
	
	//text() with attribute- NEED to write entire text
	 //htmltag[@attr='value' and text()='value']
	  //a[@class='list-group-item' and text()='Wish List']
	  or swapping teSxt first()
	  //a[ text()='Wish List' and @class='list-group-item']
	
	using two attributes
	 //htmltag[@attr1='value' and @attr2='value'and text()='value']

	
	  2. Contains():
	   2.1 contains() with attr:
	   //htmltag[contains(@attr,'value')]
       //input[contains(@id,'email')]
       //input[contains(@id,'password')]
        
       // dynamic attr: where attribute changes dynamically
       //<input id='firstname_123'>
       //<input id='firstname_2345'>
        
       //input[contains(@id,'firstname_')]  
          
       2.2 contains() with text(); - PARTIAL text is fine
        //htmltag[contains(text(),'value')]
        //h2[contains(text(),'Returning')]
        //span[contains(text(),'Hello')]
        
        give those link which contains text amazon
        //a[contains(text(),'Amazon')]
         
       2.3 contains() with text and contains() with attr:
       //htmltag[contains(@attr,'value') and contains(text(),'value')]
       //htmltag[contains(text(),'value')and contains(@attr,'value')]

       //a[contains(@class,'nav_a') and contains(text(),'Sell on Amazon Business')]
	   //a[contains(text(),'Sell products on Amazon') and contains(@class,'nav_a')]
	 
	   2.4 contains() with text() and attr:
	   //htmltag[contains(text(), 'value') and @attr='value']
	    //a[contains(text(),'Sell products on Amazon') and @class='nav_a']
	
	   2.5 contains() with attr1 and without attr2
	   //htmltag[contains(@attr1,'value') and attr2='value']
	   //input[contains(@name,'keywords') and @id='twotabsearchtextbox']
	   
	   //a[contains(@href,'nav_cs_registry')]           //gives link of registry with ending nav_c
	    
	   3. starts-with();   //only value starting with should be mention
	    //htmltag[starts-with(@attr,'value')]
	    //input[starts-with(@name,'field')]
	    //a[starts-with(text(),'Fresh')]         //all links starting with fresh
	   
	   4.ends-with() in xpath: Not supported. depericted   
	   
	   5. index
	   -capture group- all the element. Reperesent in () brackets
	   -index starting with 1 not 0
	   (//input[@class='form-control'])[1]
	   
	   or using position() function
	   (//input[@class='form-control'])[position()=1]
	   
	   
	   using last() function- going to last element in capture group
	   (//input[@class='form-control'])[last()]
	   
	   going to 2nd last elment in captur group-    //used -1
	   (//input[@class='form-control'])[last()-1]
	   
	   we do not have first() function
	   
	   
	  find the last link on amazon HELP
	  (//div[@class='navFooterVerticalColumn navAccessibility']//a)[last()]

	*/
 //  ------------------------******-------------------------
   /*
   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nil@gmail.com");
      
   //if we pass incorrect xpath then it will give InvalidSelectorException
   //driver.findElement(By.xpath("//input[@id='11username']")).sendKeys("nil@gmail.com");
   
     */ 
  // compound class[multiple class] not supported for By. className locator
  //invalid
   // driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("nil@gmail.com");
   
   //compounted supported in xpath
   //valid
   //driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("nil1@gmail.com");
   
   //className- only one single class is allowed
   driver.findElement(By.className("login-email")).sendKeys("nil@gmail.com");
   driver.findElement(By.className("login-password")).sendKeys("nil@123");

   //For Class name: Xapth will work only if all mutiple class are mentioned. it considered as value
   //NoSuchElementException
   //driver.findElement(By.xpath("//input[@class='login-password m-bottom-3']")).sendKeys("nil1@gmail.com");

   
   //child to parent
 //div[@class='private-form__input-wrapper']/input[@id='username']
   
   //parent to child- using child keyword- not prefer
 //div[@class='private-form__input-wrapper']/child::input[@id ='username']
  
  //no keyword for grandchild
   
  //immediate parent- using parent keyword
 //input[@id ='username']/parent::div
   
 //backward traveselling using xpath- going into backdirection- using /.. forward slash with 2 dots
 //input[@id ='username']/../../..

 //for entire dom searching used *  dont used * which makes xpath perfomance slow
 //*[@id]- give all the element having id
 //*[@id ='username']
 //input[@id]- gives only those ID who is having input tag
	}

}
