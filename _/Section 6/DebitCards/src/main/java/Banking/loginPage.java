package Banking;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
public class loginPage {
 
    WebDriver driver;
 
    By username = By.name("userName");
   
    By password= By.name("password");
    By signin= By.name("login");
    //all objects belongs to that page
            

   //Constructor
     public loginPage(WebDriver driver){
 
        this.driver = driver;
 
    }
     
     public void setUserid(String userid)
     {
    	driver.findElement(username).sendKeys(userid);
     }
     
     public void setPassword(String passwords)
     {
    	driver.findElement(password).sendKeys(passwords);
     }
     public void signin()
     {
    	driver.findElement(signin).click();
     }
     
 
   
 
     
 
    //Click on login button
 
 
 
}