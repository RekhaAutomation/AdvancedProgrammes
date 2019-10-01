package com.naveen.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("http://www.w3schools.com/html/html_tables.asp");
	
	String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
	String afterXpath="]/td[1]";
	////*[@id="main"]/div[3]/h3
	////*[@id="customers"]
	//*[@id="customers"]/tbody/tr[1]
	//*[@id="customers"]
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	int rowCount=rows.size();
	System.out.println("Total number of rows in webtable---->"+rowCount);
	
	for(int i=2;i<=rowCount;i++) {
		String actualXpath=beforeXpath+i+afterXpath;
		WebElement element=driver.findElement(By.xpath(actualXpath));
		System.out.println(element.getText());
		if(element.getText().equals("Island Trading")) {
			System.out.println("company name---"+element.getText()+"is found at position"+(i-1));
			break;
		}
		  
	}
	System.out.println("***************************");
	String afterXpathcon="]/td[2]";
	for(int j=2;j<=rowCount;j++) {
	String actualXpathcon=beforeXpath+j+afterXpathcon;
	WebElement element=driver.findElement(By.xpath(actualXpathcon));
	System.out.println(element.getText());
	if(element.getText().equals("Yoshi Tannamuri")) {
		System.out.println("company name---"+element.getText()+"is found at position"+(j-1));
		break;
	}
	}
	
	System.out.println("***************************");
	String afterXpathcountry="]/td[3]";
	for(int k=2;k<=rowCount;k++) {
	String actualXpathcountry=beforeXpath+k+afterXpathcountry;
	WebElement element=driver.findElement(By.xpath(actualXpathcountry));
	System.out.println(element.getText());
	if(element.getText().equals("Canada")) {
		System.out.println("Country name---"+element.getText()+"is found at position"+(k-1));
		break;
	}
	}
	//handle webtable colomns::
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//*[@id="customers"]/tbody/tr[1]/th[2]
	//*[@id="customers"]/tbody/tr[1]/th[3]
	
	String colbeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
	String colAfterXpath="]";
	
	List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
			int colCount=cols.size();
			System.out.println("Total number of colomns are----->+colCount");
			System.out.println("Colom values are ");
			for (int n = 1; n <=colCount; n++) {
				String actualColXpath=colbeforeXpath+n+colAfterXpath;
				WebElement element2=driver.findElement(By.xpath(actualColXpath));
				System.out.println(element2.getText());
			}
	
	}

}
////*[@id="customers"]/tbody/tr[2]/td[1]
////*[@id="customers"]/tbody/tr[3]/td[1]
////*[@id="customers"]/tbody/tr[4]/td[1]
//*[@id="customers"]/tbody/tr[5]/td[1]
//*********************************
////*[@id="customers"]/tbody/tr[2]/td[2]
//*[@id="customers"]/tbody/tr[3]/td[2]
//*[@id="customers"]/tbody/tr[4]/td[2]
//*[@id="customers"]/tbody/tr[5]/td[2]
//*[@id="customers"]/tbody/tr[6]/td[2]
//country
//*[@id="customers"]/tbody/tr[2]/td[3]
//*[@id="customers"]/tbody/tr[3]/td[3]
//*[@id="customers"]/tbody/tr[4]/td[3]
//*[@id="customers"]/tbody/tr[5]/td[3]
//*[@id="customers"]/tbody/tr[6]/td[3]