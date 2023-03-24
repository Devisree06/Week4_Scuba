package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseMethods.projectMethods;

public class checkOutPage extends projectMethods {
	
	public checkOutPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	

	public checkOutPage enterFirstName()
	{
		driver.findElement(By.name("firstName")).sendKeys("Devisree");
		return this;
	}
	public checkOutPage enterLastName()
	{
		driver.findElement(By.id("last-name")).sendKeys("K");
		return this;
	}
	public checkOutPage enterPostCode()
	{
		driver.findElement(By.xpath("//div/input[@data-test='postalCode']")).sendKeys("6000574");
		return this;
	}
	public checkOutOverview clickContinue()
	{
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		return new checkOutOverview(driver);
	}
}
