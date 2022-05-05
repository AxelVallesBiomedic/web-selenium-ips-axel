package Ej2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeCompany {
  @Test
  public void f() {
	  
	//Linear scripting
	  ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.get("https://computer-database.gatling.io/computers"); // open the page
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("ASCI Thors Hammer"); //Fill the pc name in the searchbox
		driver.findElement(By.xpath("//input[@id='searchsubmit']")).click(); //click search button
		
		driver.findElement(By.xpath("//a[@href=\"/computers/383\"]")).click(); // click the option we get
		
		//////////////////////////Drop down//////////////////////////////////////
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//*[@id='company']"))); //Select apple inc from dropdown
					
		// Select the option by index
		se.selectByIndex(1);
		
		//////////////////////////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//input[@class=\"btn primary\"]")).click(); // click the save this computer button
		
		String valMessage = driver.findElement(By.xpath("//div[@class=\"alert-message warning\"]")).getText(); //Get the warning message into a string
		
		System.out.println(valMessage); // PRint the message in the console				
		
		Assert.assertEquals(valMessage, "Done ! Computer ASCI Thors Hammer has been updated"); //Compare warning message with what it should show
		
  }
}
