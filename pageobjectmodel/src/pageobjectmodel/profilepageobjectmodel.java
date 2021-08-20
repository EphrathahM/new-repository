package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class profilepageobjectmodel {

	
	
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a" )
	public static WebElement myprofile;
	
	
	@FindBy(name = "city")
	public static WebElement city;
	
	
	@FindBy(name = "phone")
	public static WebElement phonenumber;
	
	
	@FindBy(xpath="//*[@id=\'profilefrm\']/div/div/div[7]/div/button")
	public static WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
