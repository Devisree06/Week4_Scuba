package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseMethods.projectMethods;

public class checkOutComplete extends projectMethods {
	public checkOutComplete(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public checkOutComplete printSuccessMessage()
	{
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		return this;
	}

}
