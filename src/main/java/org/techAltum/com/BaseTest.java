package org.techAltum.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		String browserDriverEXE = projectPath + "\\browserDriverEXE";
		
		System.setProperty("webdriver.chrome.driver", browserDriverEXE + "\\chromedriver.exe");
		driver = new ChromeDriver();

		
		/*
		 * System.setProperty("webdriver.gecko.driver", browserDriverEXE +
		 * "\\geckodriver.exe"); driver = new FirefoxDriver();
		 */
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}
