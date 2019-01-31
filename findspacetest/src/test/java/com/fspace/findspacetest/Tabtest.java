package com.fspace.findspacetest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tabtest {

	
	@Test
	public void tabcheck()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\subash\\selenium tool\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//**Navigate to given URL
		driver.navigate().to("https://kerb.works/");
		
		//**Open first Tab as Find Space and get confirm major heading appear on the page correctly.
		
		driver.findElement(By.xpath("//div[@class='tab-icon-wrapper']/span[text()='Find a space']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String ele1 = driver.findElement(By.xpath("//div[@class='col']/h1")).getAttribute("innerHTML");;
		System.out.println("Find Space Tab Major Heading:  " +ele1);
		Assert.assertTrue(ele1.contains("Find a space"));
		
		//**Open Second Tab as Lease a space and get confirm major heading appear on the page correctly.
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/nav/div/div[2]/ul/li[2]/a/div")).click();
		String ele2 = driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-8']/h1")).getAttribute("innerHTML");;
		System.out.println("Lease a space Tab Major Heading: " +ele2);
		Assert.assertTrue(ele2.contains("List your empty parking space"));
		
		//**Open Third Tab as Bookings and get confirm major heading appear on the page correctly.
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/nav/div/div[2]/ul/li[3]/a/div")).click();
		String ele3 = driver.findElement(By.xpath("//div[@class='media-body align-self-center ']/p")).getAttribute("innerHTML");;
		System.out.println("Bookings Tab Major Heading:    "+ele3);
		Assert.assertTrue(ele3.contains("Find someone who has an empty space where you can park your car, motorbike, boat, or helicopter."));
		
		 
		
	}
	
	
	
}
