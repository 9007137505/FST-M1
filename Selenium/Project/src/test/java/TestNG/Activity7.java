package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//Goal: Reading a popup that contains additional information about the account/lead.

@Test
public class Activity7 {
	
WebDriver driver;
WebDriverWait wait;   
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  public void SalesLeadsMobileNumber() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
         	  
	  WebElement sales = driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
      sales.click(); 
      WebElement leads = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]"));
      leads.click(); 
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("module-title-text"), "LEADS"));
    //Cell value of second row, second column
      WebElement additionalInfo = driver.findElement(By.cssSelector("#adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab > span:nth-child(1)"));
      additionalInfo.click();
      WebElement mobilenum = driver.findElement(By.className("phone"));
      System.out.println("Mobile Number: "+ mobilenum.getText());
      
      
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
