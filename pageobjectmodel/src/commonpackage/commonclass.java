package commonpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class commonclass {
public WebDriver driver;
	public commonclass() {
		// TODO Auto-generated constructor stub
	}

	@BeforeSuite
	public void startbrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ssr_b\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		
		}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		
			}
	
	
	
}
