package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//Goal: Get the color of the navigation menu
public class Activity5 {
	
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
  @Test
  public void NavigationBarcolor() {
	  //Find the username and password fields
      WebElement username = driver.findElement(By.id("user_name"));
      WebElement password = driver.findElement(By.id("username_password"));
      
      //Enter credentials
      username.sendKeys("admin");
      password.sendKeys("pa$$w0rd");
      
      //Click login
      driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
         	  
	  //String ajaxText = driver.findElement(By.xpath("/html/body/div[4]/nav/div/div[2]/ul").className("color");
      WebElement ajaxText = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"));
      System.out.println("Navigation Bar color: "+ ajaxText.getCssValue("color"));
	       
  }
  
  @AfterTest
  public void afterMethod() {
      //Close the browser
      driver.close();
  }
}
