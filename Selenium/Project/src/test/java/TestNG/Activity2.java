package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
//import junit.framework.TestCase;
//Goal: Print the url of the header image to the console
public class Activity2 {
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    
     
    
    @Test
    public void testCase1() {
       
    	WebElement headerimage =driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        //getAttribute() to get src of image
        System.out.println("Src attribute is: "+ headerimage.getAttribute("src"));
        		
    }
    
    

    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}