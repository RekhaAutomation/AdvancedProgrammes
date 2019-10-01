package com.navprogs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandleTest {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		WebElement date=driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[4]/button"));
		String dateval="21/06";
		selectDateByJS( driver,date, dateval);
	}
public static void selectDateByJS(WebDriver driver,WebElement element,String dateval) {
	JavascriptExecutor jse=((JavascriptExecutor) driver);
	jse.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	////div//button[@class='ui-datepicker-trigger']
	////*[@id="flightSearchContainer"]/div[4]/button
}
}
