package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseMethods.projectMethods;

public class homePage  extends projectMethods{
	
	public homePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public homePage clickFirstItem()
	{
		driver.findElement(By.xpath("(//a/div[@class='inventory_item_name'])[1]")).click();
		return this;
	}
	public homePage clickSecondItem()
	{
		driver.findElement(By.xpath("(//a/div[@class='inventory_item_name'])[2]")).click();
		return this;
	}
	public homePage clickThirdItem()
	{
		driver.findElement(By.xpath("(//a/div[@class='inventory_item_name'])[3]")).click();
		return this;
	}
	public homePage clickFourthItem()
	{
		driver.findElement(By.xpath("(//a/div[@class='inventory_item_name'])[4]")).click();
		return this;
	}
	public homePage clickFifthItem()
	{
		driver.findElement(By.xpath("(//a/div[@class='inventory_item_name'])[5]")).click();
		return this;
	}
	
	public homePage clickAddToCart()
	{
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		return this;
	}
	public yourCartPage clickCartIcon()
	{
		driver.findElement(By.id("shopping_cart_container")).click();
		return new yourCartPage(driver);
	}

}
