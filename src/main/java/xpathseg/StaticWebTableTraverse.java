package xpathseg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableTraverse {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = getRowCount();
		System.out.println("rows no " + rowCount); // 6

		int columnCount = getColumnCount();
		System.out.println("column no " + columnCount);

		/*
		 * table xpath pattern is created so we need to change just table row count
		 * table rows //table[@id="customers"]/tbody/tr[2]/td[1]
		 * //table[@id="customers"]/tbody/tr[3]/td[1] //--
		 * //table[@id="customers"]/tbody/tr[7]/td[1]
		 * 
		 */

// 	System.out.println("-----------Company---------");
//
//    String beforeXpath="//table[@id='customers']/tbody/tr[";
//	String afterXpath="]/td[1]";
//	
//	//i= no of rows
//	//first column=company
//	for(int i=2; i<=getRowCount()+1; i++)
//	{
//	String actXpath=beforeXpath+ i + afterXpath;
//	//	System.out.println(actXpath); will print the xpath pattern
//	String text=driver.findElement(By.xpath(actXpath)).getText();
//	System.out.println(text);
//	}
// 
//	System.out.println("-----------Contacts---------");
//	//2nd column=contact
//	 String contactBeforeXpath="//table[@id='customers']/tbody/tr[";
//	 String contactAfterXpath="]/td[2]";
//	
//		for(int i=2; i<=getRowCount()+1; i++)
//		{
//		String actXpath=contactBeforeXpath+ i + contactAfterXpath;
//		String text=driver.findElement(By.xpath(actXpath)).getText();
//		System.out.println(text);
//		}
//	
//		
//		System.out.println("-----------country---------");
//	
//		//3rd column=country
//		 String countryBeforeXpath="//table[@id='customers']/tbody/tr[";
//		 String countryAfterXpath="]/td[3]";
//		
//			for(int i=2; i<=getRowCount()+1; i++)
//			{
//			String actXpath=countryBeforeXpath+ i + countryAfterXpath;
//			String text=driver.findElement(By.xpath(actXpath)).getText();
//			System.out.println(text);
//			}

//		getColumnData(1);
//		getColumnData(2);
//	  ArrayList<String> countryList= getColumnData(3);
//	  if(countryList.contains("UK"))
//	  {
//		  System.out.println("PASS");
//	  }

		getRowValues(2,3);
		
	}

	
	public static void getRowValues(int rowNum, int colCount)
	{
		for(int j=1; j<=colCount; j++)
		{
			String xpath="//table[@id=\"customers\"]/tbody/tr[" +rowNum+ "]/td["+ j +"]";
		    String text=driver.findElement(By.xpath(xpath)).getText();
		    System.out.println(text);
		}
	}
	
	
	public static ArrayList<String> getColumnData(int colNumber) {
		System.out.println("--------------------");
		String BeforeXpath = "//table[@id='customers']/tbody/tr[";
		String AfterXpath = "]/td[" + colNumber + "]";

		ArrayList<String> colValuesList=new ArrayList<String>();
		
		for (int i = 2; i <= getRowCount() + 1; i++) {
			String actXpath = BeforeXpath + i + AfterXpath;
			String text = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
			colValuesList.add(text);
		}
		return colValuesList;
	}

	public static int getColumnCount() {
		int cols = driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		return cols;

	}

	public static int getRowCount() {
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1; // was counting table
																								// column also so size-1																						// will give only total
																								// no rows
		return rows;
	}

}
