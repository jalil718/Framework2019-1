package test.facebook.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/TalentTEK/Documents/GitHub/Framework2019/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MyFirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("LName");

	}

}
