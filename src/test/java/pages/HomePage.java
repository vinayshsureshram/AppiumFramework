package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import utils.iOSDriver;

public class HomePage extends BasePage {
	
	public static IOSDriver<IOSElement> driver = null;
	
	public HomePage(IOSDriver<IOSElement> driver)
	{
		this.driver = driver;
	}
	
	
	

}
