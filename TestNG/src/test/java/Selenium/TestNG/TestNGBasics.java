package Selenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("setup chrome");
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeTest //2
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@BeforeMethod //4
	public void login() {
		System.out.println("login method");
	}
	
	@Test //5
	public void googleTest() {
		System.out.println("google test");
	}
	
	@AfterMethod //6
	public void logout() {
		System.out.println("logout method");
	}
	
	@AfterTest //8
	public void deleteCookies() {
		System.out.println("delete cookies");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite //9
	public void generateReport() {
		System.out.println("report geerate");
	}

}
