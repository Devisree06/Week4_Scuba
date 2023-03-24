package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseMethods.projectMethods;

public class checkOutOverview extends projectMethods{
	
	public checkOutOverview(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public checkOutComplete clickFinish()
	{
		driver.findElement(By.xpath("//div/button[@id='finish']")).click();		
		return new checkOutComplete(driver);
	}

}
