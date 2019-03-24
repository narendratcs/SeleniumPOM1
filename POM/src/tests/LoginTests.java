package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ui_component.LoginComponent;

public class LoginTests extends AbstractTest{
	
	@Test(description="login test")
	public void verifyLogin()
	{
	
		Assert.assertTrue(logincomponent.verifyLoginFunc(), "message");
	}

}
