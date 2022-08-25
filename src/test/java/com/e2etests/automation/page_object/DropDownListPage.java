package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class DropDownListPage {
	
	@FindBy(how = How.ID, using= "oldSelectMenu")
	public static WebElement selectMenu;
	
	@FindBy(how = How.XPATH, using= "//*[contains(text(),'Violet')]")
	public static WebElement violet_Color;
	
	public DropDownListPage() {
		PageFactory.initElements(Setup.driver, this);	
	}

	public void selectColor(String color_select) {
		Select select = new Select(selectMenu);
		select.selectByVisibleText(color_select);
	}

}
