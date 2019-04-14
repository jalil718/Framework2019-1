package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Config {

	
	public WebDriver driver;
	
	@BeforeMethod
	public void beforeEachTest(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		// init the chrome driver
		driver = new ChromeDriver();
		// lets go to facebook.com
		driver.get("http://www.facebook.com");
		// maximize the window 
		driver.manage().window().maximize();
		// wait 30 second to wait all elements to load in the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterEachTest(){
		//driver.close();
	}
}
