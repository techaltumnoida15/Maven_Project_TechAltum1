package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.techAltum.com.BaseTest;
import org.testng.annotations.Test;

public class TC03 extends BaseTest{

	@Test
	public void selectDatesFromCalendar() {
		driver.get("http://www.cheapoair.com");
		
		//Open Cal
		WebElement departCal = driver.findElement(By.cssSelector("input[id='cal0']"));
		departCal.click();
		
		String a = "//div[@class='calendar__single-month active']/div[3]/div[";
		int i = 1;
		String b = "]/a";

		String xp = a + i + b;
		
		for(i = 1; i<=42; i++) {
			xp = a + i + b;
			try {
				String dateInCal = driver.findElement(By.xpath(xp)).getText();
				System.out.println(dateInCal);
			}
			catch(Exception ex) {
				System.out.println("No date found for xpath = " + xp);
			}
		}
	}
}
