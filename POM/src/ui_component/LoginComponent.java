package ui_component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.ServiceCall;

public class LoginComponent {

	@FindBy(name="userName")
	static WebElement usernameEditbox;
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	@FindBy(xpath="//*[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//font[text()][1]")
	static WebElement LoginVerificationText;
	
	public void login()
	{
		
		usernameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
	}
	
	
	public boolean verifyLoginFunc()
	{
	    login();
		String actualText = LoginVerificationText.getText();
		String expectedText= ServiceCall.getLoginverificationText();
		if(actualText.equals(expectedText))
	
		return true;
		else 
			
			return false;
	
   }
}
