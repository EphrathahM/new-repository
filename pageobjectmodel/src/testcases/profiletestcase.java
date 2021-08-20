package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.loginpageobjectmodel;
import pageobjectmodel.profilepageobjectmodel;

public class profiletestcase {

	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssr_b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login" );
		
		Thread.sleep(2000);
		
		PageFactory.initElements(driver,loginpageobjectmodel.class );
		loginpageobjectmodel.email.sendKeys("user@phptravels.com");
		loginpageobjectmodel.password.sendKeys("demouser");
		loginpageobjectmodel.login.click();
	
		Thread.sleep(2000);
	
		PageFactory.initElements(driver,profilepageobjectmodel.class );
		profilepageobjectmodel.myprofile.click();
		profilepageobjectmodel.city.sendKeys("trichy");
		profilepageobjectmodel.phonenumber.sendKeys("98489038408");
		profilepageobjectmodel.submit.click();
		

	
	
	
	}
}
