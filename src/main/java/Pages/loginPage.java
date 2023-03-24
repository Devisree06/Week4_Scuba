package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import BaseMethods.projectMethods;

public class loginPage extends projectMethods {

	public loginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public loginPage userName(String uName)

	{
		driver.findElement(By.id("user-name")).sendKeys(uName);	
		return this;
	}
	
	public loginPage PassWord(String pWord)
	{
		driver.findElement(By.id("password")).sendKeys(pWord);	
		return this;
	}

	public homePage loginButton()
	{
		driver.findElement(By.id("login-button")).click();	
		
		return new homePage(driver);
	}
	
	public loginPage errorMsg()
	{
		driver.findElement(By.id("login-button")).click();	
		String errorMsg= driver.findElement(By.xpath("//button[@class='error-button']")).getText();
		String actualMsg="Epic sadface: Username and password do not match any user in this service";
		//Assert.assertEquals(actualMsg, errorMsg);
		
		if(actualMsg.matches(errorMsg))
		{
			System.out.println(actualMsg);

		}
		
		return this;
	}
	}