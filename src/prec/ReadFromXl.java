package prec;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import base.Xls_Reader;
import locators.facebookLocators;
import values.fbValues;

public class ReadFromXl extends Config {

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//data.xlsx");
	facebookLocators fl = new facebookLocators();
	fbValues fv = new fbValues();
	
	@Test
	public void readingFromXL(){
		// how to read data from excel file
		//driver.findElement(By.xpath(fl.email)).sendKeys(fv.emailVal);
		String locators = xl.getCellData("fb", "Values", 2);
		driver.findElement(By.xpath(fl.email)).sendKeys(locators);
		
		
	}
}
