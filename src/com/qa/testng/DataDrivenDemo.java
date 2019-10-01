package com.qa.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenDemo {
	
	WebDriver driver;
  @BeforeMethod
    public void setUp () {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
  }
  
  public void getData() {
	  
  }
  @Test
  public void regPageTest(String fname,String lname,String mailid,String pwd) {
	  driver.findElement(By.id("firstname")).clear();;
	  driver.findElement(By.id("firstname")).sendKeys(fname);
	  
	  driver.findElement(By.id("lastname")).clear();;
	  driver.findElement(By.id("lastname")).sendKeys(lname);
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(mailid);
	  
	  driver.findElement(By.id("PASSWORD")).clear();
	  driver.findElement(By.id("PASSWORD")).sendKeys(pwd);
	  
	  
  }
  
  @AfterTest
  public void tearDown() {
	  driver.close();
  }
}
