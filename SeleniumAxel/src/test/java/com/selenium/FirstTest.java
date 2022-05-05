package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	
	
  @Test
  public void f() {
	  
	  //Linear scripting
	  ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.get("https://computer-database.gatling.io/computers");
		
		//relative Xpath -> //input[@id='searchbox']
		
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ACE");
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click();
	String val = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a")).getText();
		
		System.out.println(val);
		
		
		//Framework de pruebas
		// TEST NG
		
		Assert.assertEquals("ACE", val);
		
  }
}
