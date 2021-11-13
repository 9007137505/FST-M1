package com.ibm.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
 
        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
 
        //Find the checkbox
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
        
        //Print status
        System.out.println("The text box is selected: " + textInput.isEnabled());
        
        driver.findElement(By.id("toggleInput")).click();
 
        //Print status
        System.out.println("The text box is selected: " + textInput.isEnabled());
        
        textInput.sendKeys("TEST DATA");
        System.out.println("The text entered succesfully " );
        
        //Close the browser
        driver.close();
 
	}

}
