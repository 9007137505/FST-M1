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
//Goal: Open the accounts page and print the contents of the table
@Test
public class Activity8 {
	
WebDriver driver;
WebDriverWait wait;   
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  public void PrintOddRowsData() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
         	  
	 //click on sales 
      WebElement sales = driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
      sales.click(); 
      //click on Leads
      WebElement accounts = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Accounts\"]"));
      accounts.click(); 
      //Wait till Accounts page open
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("module-title-text"), "ACCOUNTS"));
    //Table rows reading
    //Get columns
      List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td"));
      //Get rows
      List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr"));

      //Number of columns
      System.out.println("Number of columns are: " + cols.size());
      //Number of rows
      System.out.println("Number of rows are: " + rows.size());

      //Get all row values and print them
       //for(WebElement cellValue : rows) {
          //System.out.println("Cell Value: " + cellValue.getText());
      //}
      
    //Get odd rows values and print them
      for(int row = 0; row < rows.size(); row = row+2){
          System.out.println(rows.get(row).getText());
      }
      
      
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
