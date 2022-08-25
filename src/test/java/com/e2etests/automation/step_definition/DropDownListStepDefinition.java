package com.e2etests.automation.step_definition;

import org.junit.Assert;

import com.e2etests.automation.page_object.DropDownListPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownListStepDefinition {

	private DropDownListPage dropDownListPage;
	public DropDownListStepDefinition() {
		this.dropDownListPage = new DropDownListPage();
	}
	
	@When("Je selecionne la couleur Violet dans las liste Old Style Select Menu {string}")
	public void jeSelecionneLaCouleurVioletDansLasListeOldStyleSelectMenu(String select_Color) {
		dropDownListPage.selectColor(select_Color);
	}

	@Then("Verifier que la couleur violet a ete selectionne")
	public void verifierQueLaCouleurVioletAEteSelectionne() {
		String message = DropDownListPage.selectMenu.getText();
		Assert.assertTrue(message.contains("Voilet"));

	}
}