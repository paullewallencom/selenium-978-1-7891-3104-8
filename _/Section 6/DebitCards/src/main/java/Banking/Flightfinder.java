package Banking;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
public class Flightfinder {
 
    WebDriver driver;
 
    By username = By.name("userName");
   
    By continuebutton= By.name("findFlights");
    By signin= By.name("login");
    //all objects belongs to that page
            

   //Constructor
     public Flightfinder(WebDriver driver){
 
        this.driver = driver;
 
    }
     
     public void ContinueB()
     {
    	driver.findElement(continuebutton).click();
     }

		
	}
     
    
     
 
   
 
     
 
    //Click on login button
 
 
 
