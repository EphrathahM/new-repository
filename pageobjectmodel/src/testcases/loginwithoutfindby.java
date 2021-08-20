package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginwithoutfindby {
 
	public static WebElement  txtUsername; 
	public static WebElement  txtPassword;
	public static WebElement  btnLogin;
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssr_b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		PageFactory.initElements(driver, loginwithoutfindby.class);
		loginwithoutfindby.txtUsername.sendKeys("Admin");
		loginwithoutfindby.txtPassword.sendKeys("admin123");
        loginwithoutfindby.btnLogin.click();
	}
	
	

}
