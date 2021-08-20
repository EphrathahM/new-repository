package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageobjectmodel {

	
	@FindBy(name = "username")
	public static WebElement email;
	
	
	@FindBy(name="password")
	public static WebElement password;
	
	
	@FindBy(xpath="//*[@id=\"loginfrm\"]/button")
	public static WebElement login;
	
}
