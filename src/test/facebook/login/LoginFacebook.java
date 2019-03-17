package test.facebook.login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	
	
	public static void main(String[] args) {
		
		// Tell the code where is your driver located
		System.setProperty("webdriver.chrome.driver", "C:/Users/TalentTEK/Documents/GitHub/Framework2019/drivers/chromedriver.exe");
		// init the chrome driver
		WebDriver driver = new ChromeDriver();
		// lets go to facebook.com
		driver.get("http://www.facebook.com");
		// maximize the window 
		driver.manage().window().maximize();
		// wait 30 second to wait all elements to load in the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Locators
		String fnLoc = "//input[@name='firstname']";
		String lnLoc = "//input[@name='lastname']";
		// Values
		String fnVal = "fnTest";
		String lnVal = "lnTest";
		
		// Enter firstName
		driver.findElement(By.xpath(fnLoc)).sendKeys(fnVal);
		// Enter lastName
		driver.findElement(By.xpath(lnLoc)).sendKeys(lnVal);

	}

}
