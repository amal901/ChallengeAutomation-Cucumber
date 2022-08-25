package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DoubleClickDemoPage {
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement btnDoubleClick;
	
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement doubleClickMessage;
	
	public DoubleClickDemoPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	public void doubleClickOnElementUsingActions() {
		Actions actions = new Actions(Setup.driver);
		actions.doubleClick(btnDoubleClick).perform();
	}
}
