package com.ibm.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
 
        //Find checkbox and toggle button
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        
        //Click the toggle button
        toggleCheckboxButton.click();
        System.out.println("Button clicked" );
        
        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("waiting" );
        //Click toggle button again
        toggleCheckboxButton.click();
        System.out.println("Button clicked again" );
        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        System.out.println("checkbox clicked" );
        //Close browser
        driver.close();
	}

}
