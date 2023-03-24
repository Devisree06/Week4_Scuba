package testCases;




import org.testng.annotations.Test;

import BaseMethods.projectMethods;
import Pages.loginPage;

public class testCase1 extends projectMethods{
	
	
	
	@Test
	public void loginTestcase() {
		String validUsername="standard_user",validPassword="secret_sauce";
		new loginPage(driver).userName(validUsername).PassWord(validPassword).loginButton();
	}

}