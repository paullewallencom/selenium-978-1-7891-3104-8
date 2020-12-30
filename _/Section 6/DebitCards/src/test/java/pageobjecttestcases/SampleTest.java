package pageobjecttestcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Banking.Flightfinder;
import Banking.loginPage;
import Banking.testBase;

public class SampleTest extends testBase{
	
	
	
	
	@Test
	public void LoginApp() throws IOException
	{
		//Need to login into Mercury Application
		
		//To Access the methods present in any class
		//You need to first create object for that class and then call
		//the methods of that class with the object
		
//Creating object means ivoking constructor method of class
		setup();
		loginPage lp=new loginPage(driver);
		lp.setUserid("test");
	    lp.setPassword("test");
	    lp.signin();
	    Flightfinder f=new Flightfinder(driver);
	   f.ContinueB();
	    
	    
	    
		
	}

}
