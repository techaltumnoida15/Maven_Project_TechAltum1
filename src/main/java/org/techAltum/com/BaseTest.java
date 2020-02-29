package org.techAltum.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.webDriver.listener.WebEventListener;

public class BaseTest {

	public WebDriver dr;
	public EventFiringWebDriver driver;
	public WebEventListener eventListener;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		String browserDriverEXE = projectPath + "\\browserDriverEXE";
		
		System.setProperty("webdriver.chrome.driver", browserDriverEXE + "\\chromedriver.exe");
		dr = new ChromeDriver();

		
		/*
		 * System.setProperty("webdriver.gecko.driver", browserDriverEXE +
		 * "\\geckodriver.exe"); driver = new FirefoxDriver();
		 */
		init();
		driver.manage().window().maximize();
	}
		
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}

	public void init() {
		driver = new EventFiringWebDriver(dr);
		eventListener = new WebEventListener();
		driver.register(eventListener);
	}
}
