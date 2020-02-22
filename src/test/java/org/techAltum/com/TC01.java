package org.techAltum.com;

import java.util.List;

import org.dataReadres.com.ReadDataFrmXL;
import org.dataReadres.com.ReadDataFromPropFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC01 extends BaseTest{

	@Test
	public void testCase01() throws Exception{
		
		ReadDataFromPropFile rdPropFile = new ReadDataFromPropFile();
		String value = rdPropFile.readDataFromPropFile("url");
		
		ReadDataFrmXL readXL = new ReadDataFrmXL();
		String[][] xData = readXL.readDataFrmXL(1);
		
		driver.get(value);
		
		String departDate = xData[1][2];   //10
		//Get current date
		// add + departDate = Date
		//Date - Month/Day/Date
		//Date = 02 March 2020
		//Open Cal
		//Current Month = Feb

		
		
		//Enter From City  id_ToCity
		//WebElement fromCity = driver.findElement(By.id("BE_flight_origin_city"));
		//fromCity.sendKeys("New Delhi");
		
		WebElement fromCityElement = driver.findElement(By.id(rdPropFile.readDataFromPropFile("id_FromCity")));
		String fromCityText = xData[1][0];
		System.out.println("To City is = " + fromCityText);
		fromCityElement.click();
		fromCityElement.sendKeys(fromCityText);
		Thread.sleep(1000);
		
		String enteredCity = fromCityElement.getAttribute("value");
		System.out.println("enteredCity is " + enteredCity);
		
		if(!enteredCity.equalsIgnoreCase(fromCityText)) {
			fromCityElement.click();
			fromCityElement.sendKeys(fromCityText);
			Thread.sleep(1000);
		}
		
		//Wait for suggestion Box
		Thread.sleep(3000);
		
		//Select Value from auto suggestion
		String a = "//div[@class='viewport']/div/div/li[";
		int i = 1;
		String b = "]";

		String xp = a + i + b;
		
		List<WebElement> suggestionBoxes = driver.findElement(By.xpath("//div[@class='viewport']/div/div")).findElements(By.tagName("li"));
		System.out.println("Total Li tags are = " + suggestionBoxes.size());
		
		for(i = 1; i<suggestionBoxes.size(); i++) {
			String cityNameInSuggesionBox = suggestionBoxes.get(i).getText();
			System.out.println(cityNameInSuggesionBox);
			if(cityNameInSuggesionBox.contains(fromCityText)) {
				suggestionBoxes.get(i).click();
				break;
			}
		}
		//=================================================================
		//To City
		WebElement toCityElement = driver.findElement(By.id(rdPropFile.readDataFromPropFile("")));
		String toCityText = xData[1][1];
		System.out.println("To City is = " + toCityText);
		toCityElement.click();
		toCityElement.sendKeys(toCityText);
		Thread.sleep(1000);
		
		String enteredToCity = toCityElement.getAttribute("value");
		System.out.println("enteredCity is " + enteredCity);
		
		if(!enteredToCity.equalsIgnoreCase(toCityText)) {
			toCityElement.click();
			toCityElement.sendKeys(toCityText);
			Thread.sleep(1000);
		}
		
		//Handle Auto suggestion in To City
	}
}
