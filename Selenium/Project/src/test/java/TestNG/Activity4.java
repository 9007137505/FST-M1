package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
//Goal: Open the site and login with the credentials provided
public class Activity4 {
	
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  @Test
  public void login() {
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
      
      //Read login message
      String loginMessage = driver.findElement(By.id("moduleTab_Home")).getText();
      System.out.println("Home Page text: "+ loginMessage);
      //Assert.assertEquals("Home", loginMessage);
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
