package com.navprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShutterflyTest {
	
	WebDriver driver;
	
	
	@Test
	public void  test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shutterfly.com");
		List<WebElement> list1=driver.findElements(By.xpath("//div[@id='subNavWrapper']"));
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).getText());
		}
		
	}

}
