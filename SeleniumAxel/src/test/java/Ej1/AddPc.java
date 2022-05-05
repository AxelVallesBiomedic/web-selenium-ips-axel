package Ej1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddPc {
  @Test
  public void f() {
	  
	  
	  String pc = "AxelPC";
	  //Linear scripting
	  ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.get("https://computer-database.gatling.io/computers"); // open the page
		
		driver.findElement(By.xpath("//a[@id=\"add\"]")).click(); //click the add computer button
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(pc); //fill computer name textbox
		
		driver.findElement(By.xpath("//input[@id=\"introduced\"]")).sendKeys("2022-05-04"); // fill date introduced textbox
		
		//////////////////////////Drop down//////////////////////////////////////
	
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//*[@id='company']"))); //Select samsung electronics from dropdown
					
		// Select the option by index
		se.selectByIndex(42);
		
		//////////////////////////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//input[@class=\"btn primary\"]")).click();  // Click the create this computer button
		
		String valMessage = driver.findElement(By.xpath("//div[@class=\"alert-message warning\"]")).getText(); //Get the warning message into a string
		
		System.out.println(valMessage); // PRint the message in the console				
		
		Assert.assertEquals(valMessage, "Done ! Computer AxelPC has been created"); //Compare warning message with what it should show
  }
}
