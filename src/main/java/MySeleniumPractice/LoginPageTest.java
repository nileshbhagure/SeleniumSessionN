package MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utlityclass.BrowserUtil;
import utlityclass.ElementUtil;

public class LoginPageTest {

	public static void main(String[] args) throws Exception {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By email=By.id("input-email");
		By pswd=By.id("input-password");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(email, "nil123@gmail.com");
		eleUtil.doSendKeys(pswd, "nil123");
		
		//brUtil.quitBroswer();
		
		
	}

}
