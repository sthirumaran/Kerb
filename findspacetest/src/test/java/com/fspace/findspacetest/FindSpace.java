package com.fspace.findspacetest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindSpace {

	
	
	@Test
	
	public void findsp() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\subash\\selenium tool\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//**Navigate to given URL
		driver.navigate().to("https://kerb.works/");
		
		//**Waiting for the search bar at the homepage  
		WebDriverWait wait = new WebDriverWait(driver,30); 
		WebElement element = wait.until( ExpectedConditions.elementToBeClickable(By.className("google-place-search-input")));
		
		//**Type “Brisbane” and select the first option from the list appear then click Find a Space button.
		element.sendKeys("Brisbane");
		driver.findElement(By.className("google-place-search-input")).sendKeys(Keys.DOWN, Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kerbApp\"]/div[2]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
		
		
		
	}

}
