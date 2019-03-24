package test.facebook.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;

public class FacebookEmailPass extends Config{
	

	@Test // test annotion - without this annotation, you can't execute any tes
	public void testFacebookEmailPass(){

		// Locators
		String email = "//*[@id='u_0_h']";
		String pass = "//input[@type='password']";
		// Values
		String emailVal = "taltekc@gmail.com";
		String passVal = "test.2324";

		// Enter firstName
		driver.findElement(By.xpath(email)).sendKeys(emailVal);
		// Enter lastName
		driver.findElement(By.xpath(pass)).sendKeys(passVal);
	}


}
