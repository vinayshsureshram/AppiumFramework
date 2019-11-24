package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import utils.iOSDriver;

public class HomePage extends BasePage {
	
	
	public HomePage(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSBy(xpath="//XCUIElementTypeStaticText[@name=\"Alert Views\"]")
	private WebElement ActionSheets;

	@iOSBy(xpath="//*[@value='Text Entry']")
	private WebElement TextEntry;

	@iOSBy(className="XCUIElementTypeTextField")
	private WebElement TextField;


public WebElement getAlertViews()
{
	System.out.println("Getting the Alerts Views link");
	return ActionSheets;
}

public WebElement getTextEntry()
{
	System.out.println("Getting Text Entry");
	return TextEntry;
}

public WebElement getTextField()
{
	System.out.println("Getting Text Field");
	return TextField;
}

}


