package test.facebook.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.facebookLocators;
import values.fbValues;

public class FacebookEmailPass extends Config{
	
	facebookLocators 	fbl = new facebookLocators();
	fbValues			fbv = new fbValues();

	@Test // test annotion - without this annotation, you can't execute any tes
	public void testFacebookEmailPass(){

		// Enter firstName
		driver.findElement(By.xpath(fbl.email)).sendKeys(fbv.emailVal);
		// Enter lastName
		driver.findElement(By.xpath(fbl.pass)).sendKeys(fbv.passVal);
	}


}
