package com.naveen.testng;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewFiledownload {
	
	WebDriver driver;
	File folder;
	@BeforeMethod
	public void setUp() {
	//	folder=
		//System.setProperty("webdriver.chrome.driver", "C:\\chormedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("");
		}
  @Test
  public void f() {
  }
  @AfterMethod
  public void  tearDown() {
	  
  }
}
