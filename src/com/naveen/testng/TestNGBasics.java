package com.naveen.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//@AfterMethod and @BeforeMethod will execute after and before each and every test(@Test) method
//@AfterTest and @BeforeTest will execute after and before test method only once.
public class TestNGBasics {
	//pre conditions
  @BeforeSuite//1
  public void setup() {
	  System.out.println("setup before launching browser");
  }
  @BeforeTest//2
  public void launchBrowser() {
	  System.out.println("launch the browser");
  }
  @BeforeClass//3
  public void login() {
	  System.out.println("login to application");
  }
  @BeforeMethod//4
  public void enterData() {
	  System.out.println("Enter credentials");
  }
  @Test//5
  public void titleTest() {
	  System.out.println("google title test");
  }
  @Test//6
  public void imageTest() {
	  System.out.println("image test");
  }
  //post conditions
  @AfterMethod//7
  public void assertTitle() {
	  System.out.println("executed after each and every test method");
  }
  @AfterTest//9
  public void aftertest() {
	  System.out.println("executed after test");
  }
  @AfterClass//8
  public void closeBrowser() {
	  System.out.println("closes the browser");
  }
  @AfterSuite//10
  public void generateReport() {
	  System.out.println("after suite is excecuted");
  }
}
