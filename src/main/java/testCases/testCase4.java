package testCases;

import org.testng.annotations.Test;

import BaseMethods.projectMethods;
import Pages.loginPage;

public class testCase4 extends projectMethods{
	@Test
	public void placeOrderForFive() {
String invalidUsername="standard_user",invalidPassword="secret_sauce";
		new loginPage(driver).userName(invalidUsername).PassWord(invalidPassword).loginButton().clickFirstItem().clickSecondItem().clickThirdItem().clickFourthItem().clickFifthItem().clickAddToCart()
		.clickCartIcon().clickCheckOutButton().enterFirstName().enterLastName().enterPostCode().clickContinue().clickFinish().printSuccessMessage();
	}
	

}
