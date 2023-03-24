package testCases;

import org.testng.annotations.Test;

import BaseMethods.projectMethods;
import Pages.loginPage;

public class testCase2 extends projectMethods{

	@Test
	public void invalidLoginTestcase() {

String invalidUsername="standard_user1",invalidPassword="secret_sauce1";
	
		new loginPage(driver).userName(invalidUsername).PassWord(invalidPassword).errorMsg();
	}
	
}
