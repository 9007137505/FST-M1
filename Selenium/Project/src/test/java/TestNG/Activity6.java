package TestNG;
//Goal: Make sure that the “Activities” menu item exists and is clickable

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Activity6 {
	
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  @Test
  public void navTextActivity() {
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
         	  
	  WebElement navText = driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]"));
      System.out.println("Activities Text: "+ navText.getText());
	  Assert.assertEquals(navText.getText(), "ACTIVITIES");     
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
