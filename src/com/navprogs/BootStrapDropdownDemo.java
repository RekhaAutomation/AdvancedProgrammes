package com.navprogs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//label"));
		System.out.println("size of the list is ---" + list.size());
		/*
		 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
		 * if(list.get(i).getText().contains("Angular")) { list.get(i).click(); break; }
		 */
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			list.get(i).click();

		}*/ 
		for(int i=0;i<list.size();i++) {
			if(((list.get(i)).isSelected())==false) {
				list.get(i).click();
			}
		}
		driver.close();
	}

}
