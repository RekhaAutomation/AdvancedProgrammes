package com.navprogs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("http://www.freecrm.com");
        driver.findElement(By.name("username")).sendKeys("rekhanag");
        driver.findElement(By.name("password")).sendKeys("rekhanag@2007");
        driver.findElement(By.xpath("//input[contains(@type,submit)]")).submit();
	}
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].style.backgroundColor="+color+"'",element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	jse.executeScript("argument[0].", arg1)
		
		
	}
}