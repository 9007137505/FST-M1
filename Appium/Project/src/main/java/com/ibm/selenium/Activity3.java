package com.ibm.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contactNum = driver.findElement(By.id("number"));
		firstName.sendKeys("Rajiv");
		lastName.sendKeys("Ranjan");
		email.sendKeys("rajanjan@in.ibm.com");
		contactNum.sendKeys("9087150537");
		WebElement submitButton = driver.findElement(By.cssSelector(".ui.green.button"));
		submitButton.click();
				
		driver.close();
		
	}

}
