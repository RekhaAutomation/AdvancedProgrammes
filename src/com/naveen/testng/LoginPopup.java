package com.naveen.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPopup {

	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	/********************************************
	format to pass username and password in the url
    http://username:password@URL
	********************************************/
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String pageMsg=driver.findElement(By.cssSelector("p")).getText();
	System.out.println(pageMsg);
	

	}

}
