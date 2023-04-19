package Selenium.TestNG;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("LoginTest");
		int x = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("HomePageTest");
	}
	
	@Test
	public void searchPageTest() {
		System.out.println("SearchPageTest");
	}

}
