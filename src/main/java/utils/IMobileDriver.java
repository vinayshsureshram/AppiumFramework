package utils;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public interface IMobileDriver {
	
	public IOSDriver<IOSElement> getDriver() throws MalformedURLException;

}
