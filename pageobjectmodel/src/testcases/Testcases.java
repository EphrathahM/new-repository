package testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonpackage.commonclass;
import pageobjectmodel.editpageobjectodel;

public class Testcases extends commonclass  {
	
    @Test(priority = 0)
    
    public void verifytitle() {
		
	String title= driver.getCurrentUrl();
		
	String expectedtitle="http://www.leafground.com/";
		Assert.assertEquals(title, expectedtitle);
		System.out.println("verifified title matches with the expected result:testcase passed");
	}
	
	
    @Test(priority = 1)
	public void editcheck() {
    	
    	PageFactory.initElements(driver, editpageobjectodel.class);

    	editpageobjectodel.clickedit.click();
    	
    	String title= driver.getCurrentUrl();
		
    	String expectedtitle="http://www.leafground.com/pages/Edit.html";
    		Assert.assertEquals(title, expectedtitle);
    		System.out.println("verifified title matches with the edit button working fine :testcase passed");
    	
    	
    }
	
	
    
    
	
	
	
}
