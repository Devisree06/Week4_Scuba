package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseMethods.projectMethods;

public class yourCartPage extends projectMethods {
	public yourCartPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public checkOutPage clickCheckOutButton()
	{
		driver.findElement(By.id("checkout")).click();	
		
		return new checkOutPage(driver);
	}

}
