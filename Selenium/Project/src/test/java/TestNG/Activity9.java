package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//Goal: Open the leads page and print the usernames and full names from the table.
@Test
public class Activity9 {
	
WebDriver driver;
WebDriverWait wait;   
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  public void SalesLeadsNameAndUser() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
      //sales link   	  
	  WebElement sales = driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
      sales.click(); 
      //leads link
      WebElement leads = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]"));
      leads.click(); 
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("module-title-text"), "LEADS"));
    //Table rows reading
      //Read Name/User column data till 10th row and print it
        for(int row = 1; row < 11; row++){
        	WebElement colval1 = driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr["+row+"]/td[3]"));
            WebElement colval2 = driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr["+row+"]/td[8]"));
            System.out.println("Data in column Name in Row: "+row+" is "+ colval1.getText());
            System.out.println("Data in column User in Row: "+row+" is "+ colval2.getText());
        }
      
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
