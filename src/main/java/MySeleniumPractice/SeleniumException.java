package MySeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.findElement(By.name("search")).sendKeys("macbook pro");

		// NoSuchElementException
		// ElementNotFoundException- not in selenium. its in java
		//driver.findElement(By.name("search11")).sendKeys("macbook pro");

		// List<WebElement>
		// footerLink=driver.findElements(By.xpath("//footer//naveen"));
		// System.out.println(footerLink.size());
		// return empty list--size-->0

		List<WebElement> list = driver.findElements(By.name("search"));
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("single search ele is present on the page");
		} else {
			System.out.println("no search mutiple search ele present");
		}

		// findelement will check only first element on page
		// .isDisplated() will check only element is present or not. it will not give correct result when mutiple elements are presents
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		if (flag) {
			System.out.println("search ele is present on the page");
		}
	}

	public static boolean isSingleElement(By locator) {

		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("single search ele is present on the page");
			return true;
		} else {
			System.out.println("mutiple search ele present");
			return false;
		}
	}
}
