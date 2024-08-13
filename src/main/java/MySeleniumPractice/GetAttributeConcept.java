package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//attribute can be have value as without value
//to capture the data enter from text field used "value" attribute. 
//getText() will not work
public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//	    String attrval=driver.findElement(By.id("input-email")).getAttribute("name");
//	    System.out.println(attrval);

//		WebElement email=driver.findElement(By.id("input-email"));
//	    email.sendKeys("test@gmail.com");
//	    String text= email.getAttribute("value");
//	     System.out.println(text);

		By emailTextField = By.id("input-email");
		By registerLink = By.linkText("Register");
		By logoImage = By.className("img-responsive");

		String text1 = doGetAttribute(emailTextField, "placeholder");
		String text2 = doGetAttribute(registerLink, "href");
		String text3 = doGetAttribute(logoImage, "src");
		String text4 = doGetAttribute(logoImage, "title");

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetAttribute(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);

	}

}
