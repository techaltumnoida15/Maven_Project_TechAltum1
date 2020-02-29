package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.techAltum.com.BaseTest;
import org.testng.annotations.Test;

public class TC02 extends BaseTest{

	@Test
	public void handleMultipleWindows() throws Exception{
		driver.get("http://www.naukri.com");
		Thread.sleep(4000);
		
		//Handle multiple wins
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		System.out.println(windowHandles);
		
		List<String> myL = new ArrayList<String>();
		Iterator<String> Itr = windowHandles.iterator();
		
		
		  for(int i = 0; i<windowHandles.size(); i++) {
			  myL.add(Itr.next()); 
		  }
		 
		
		driver.switchTo().window(myL.get(2));
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
		
		driver.switchTo().window(myL.get(1));
		String pageTitle2 = driver.getTitle();
		System.out.println(pageTitle2);
		driver.close();
		
		//Switch back to parent window
		driver.switchTo().window(myL.get(0));
		System.out.println(driver.getTitle());
		
		//Scroll Down
		((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
		Thread.sleep(4000);
		
		//Scroll Up
		((JavascriptExecutor)driver).executeScript("scroll(500, 0);");
	}
}
