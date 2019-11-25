package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;

public class HomePage extends BasePage {
	
	
	public HomePage(IOSDriver<IOSElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
/*	private static HomePage instance;
	
	public static HomePage getPageInstance()
	{
		
		if(instance == null) {
			instance = new HomePage();
		}

		return instance;
	}*/
	
	@iOSBy(xpath="//XCUIElementTypeStaticText[@name=\"Action Sheets\"]")
	private WebElement ActionsSheetButton;
	
	public WebElement getActionsSheetButton()
	{
		return ActionsSheetButton;
	}
	
}


