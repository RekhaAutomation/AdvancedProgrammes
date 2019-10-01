package com.navprogs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("rekhanag");
		driver.findElement(By.name("password")).sendKeys("rekhanag@2007");
		driver.findElement(By.xpath("//input[contains(@type,submit)]")).submit();
		driver.switchTo().frame("mainpanel");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of linklist size including image links-------->" + linklist.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		// iterating linklist to filter active links
		for (int i = 0; i < linklist.size(); i++) {
			if (linklist.get(i).getAttribute("href") != null
					&& !(linklist.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linklist.get(i));
			}
		}
		System.out.println("Size of active link list is ----->" + activeLinks.size());
		for (int j = 0; j < activeLinks.size(); j++) {
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
						.openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println("Active links are ------>" + activeLinks.get(j).getAttribute("href")
						+ "-------response code is---->" + response);
			} catch (MalformedURLException e) {
//				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
