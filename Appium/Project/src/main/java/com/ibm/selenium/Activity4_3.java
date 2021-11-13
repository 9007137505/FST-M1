package com.ibm.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		//third header
        String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
      
        System.out.println("Third header text is: " + thirdHeader);
 
        //fifth header + colour
        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fith header's colour is: " + fifthHeaderColour);
 
        //violet button 
        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violetButtonClasses);
 
        //grey button 
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
		
		driver.close();
	}

}
