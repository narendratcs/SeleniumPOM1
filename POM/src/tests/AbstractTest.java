package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ui_component.FlightfinderComponent;
import ui_component.LoginComponent;

public class AbstractTest {
	
	LoginComponent logincomponent;
	FlightfinderComponent flightfindercomponent;
	
	WebDriver driver;
	
	public AbstractTest()
	{
		logincomponent = new LoginComponent();
		flightfindercomponent = new FlightfinderComponent();
	}

	@BeforeTest
	public void setupEnvironment()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Kumar\\Desktop\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		PageFactory.initElements(driver, logincomponent);
		PageFactory.initElements(driver, flightfindercomponent);
	}
	
	@AfterTest
	
	public void closeEnvironment()
	{
		driver.close();
		
	}
	
}
