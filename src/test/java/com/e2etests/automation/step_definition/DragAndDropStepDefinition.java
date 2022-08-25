package com.e2etests.automation.step_definition;

import org.junit.Assert;

import com.e2etests.automation.page_object.DragAndDropPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	private DragAndDropPage dragAndDropPage;
	public DragAndDropStepDefinition() {
		this.dragAndDropPage = new DragAndDropPage();
	}
	
	@When("Je glisse et je lache l element Drag me vers Drop here")
	public void jeGlisseEtJeLacheLElementDragMeVersDropHere() {
		dragAndDropPage.dropAndDroptUsingActions();
	}
	@Then("Un message s affiche {string} dans le rectangle bleu")
	public void unMessageSAfficheDansLeRectangleBleu(String msg) {
		String message = DragAndDropPage.dropHere.getText();
		Assert.assertTrue(message.contains(msg));
	}




}
