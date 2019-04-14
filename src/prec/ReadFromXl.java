package prec;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utils.Xls_Reader;
import base.Config;
import locators.facebookLocators;

public class ReadFromXl extends Config{

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//tc.xlsx");
	facebookLocators fl = new facebookLocators();
	
	@Test
	public void testReadFromXL(){
		//Xls_Reader xl = new Xls_Reader ("C:\\Users\\Hasan\\workspace//TestNG_Framework\\data.xlsx");
		// dynamic path - locators
		String value = xl.getCellData("fb", "Values", 2);
		driver.findElement(By.xpath(fl.email)).sendKeys(value);
		driver.findElement(By.xpath(fl.fnLoc)).sendKeys(xl.getCellData("fb", "Values", 3));
	}
	
	@Test
	public void testWriteInXl(){
		// Copy the text from fb website and enter in excel file
		String getTextValue = driver.findElement(By.xpath(fl.signUpText)).getText();
		String value = xl.setCellData("fb", "Values", 4, "");
		driver.findElement(By.xpath(fl.fnLoc)).sendKeys(xl.setCellData("fb", "Values", 4, ""));
	}
	
	
}
