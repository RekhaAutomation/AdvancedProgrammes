package com.navprogs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/register/");
		//isDisplayed
		Boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);
		//isEnabled
		Boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		//isSelected
		Boolean chkbox=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chkbox);
		
		driver.findElement(By.name("agreeTerms")).click();
		Boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		
	}

}
