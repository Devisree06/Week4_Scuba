package BaseMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class projectMethods {
	public ChromeDriver driver;
	
	@BeforeTest
	public void login()

	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Devisree\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void logOut()
	{
		driver.close();
	}
}
