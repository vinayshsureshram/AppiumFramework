package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class iOSDriver {
	
	
	private static IOSDriver<IOSElement> driver;

	public static IOSDriver<IOSElement> getDriver() throws MalformedURLException {
		
		if(driver==null)
		{
		
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		d.setCapability(MobileCapabilityType.APP, "/Users/vinaysh/Library/Developer/Xcode/DerivedData/UICatalog-gemkvmlugfsgigelltcqulnopmpm/Build/Products/Debug-iphonesimulator/UICatalog.app");
		
		driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		return driver;
	}
	
	
	

}
