package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.loginpageobjectmodel;

public class logintestcase {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssr_b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login" );
		
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,loginpageobjectmodel.class );
		loginpageobjectmodel.email.sendKeys("user@phptravels.com");
		loginpageobjectmodel.password.sendKeys("demouser");
		loginpageobjectmodel.login.click();
		
		
		
		
	}

	}
