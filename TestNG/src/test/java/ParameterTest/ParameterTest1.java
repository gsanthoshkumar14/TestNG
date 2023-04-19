package ParameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest1 {

	WebDriver driver;
	
	@Test
	@Parameters({"url", "username"})
	public void yahooSignIn(String url, String username) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login-username")).sendKeys(username);
		driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.id("login-passwd")).sendKeys("password");
		//driver.findElement(By.id("login-signin")).click();
		
	}
}
