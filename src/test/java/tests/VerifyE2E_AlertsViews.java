package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pages.HomePage;
import utils.iOSDriver;

public class VerifyE2E_AlertsViews {
	
	public IOSDriver<IOSElement> driver;
	
	@Test
	public void AlertsViewsE2E_TC() throws MalformedURLException
	{
		driver = iOSDriver.getDriver();
		
		HomePage hp = new HomePage(driver);
		hp.getActionsSheetButton().click();
	}

}
