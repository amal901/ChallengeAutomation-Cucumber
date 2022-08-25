package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DragAndDropPage {

	@FindBy(how = How.ID, using = "draggable")
	public static WebElement DragMe;
	
	@FindBy(how = How.ID, using = "droppable")
	public static WebElement dropHere;
	
	public DragAndDropPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	public void dropAndDroptUsingActions() {
		Actions actions = new Actions(Setup.driver);
		WebElement from = DragMe;
		WebElement to = dropHere;
		actions.dragAndDrop(from, to).perform();
	}

}
