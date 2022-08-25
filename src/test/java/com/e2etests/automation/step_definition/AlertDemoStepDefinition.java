package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.AlertDemoPage;
import com.e2etests.automation.utils.WebActionHelperMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertDemoStepDefinition {
	
	private AlertDemoPage alertDemoPage;
	private WebActionHelperMethods webActionHelperMethods;
	
	public AlertDemoStepDefinition() {
		this.alertDemoPage = new AlertDemoPage();
		this.webActionHelperMethods = new WebActionHelperMethods();
	}

	@Given("J accede au site web Demoqa {string}")
	public void jAccedeAuSiteWebDemoqa(String url) {
		webActionHelperMethods.navigate(url);
	}
	
	@When("Je clique sue le bouton Click me")
	public void jeCliqueSueLeBoutonClickMe() throws InterruptedException {
		alertDemoPage.clickAlert();
		Thread.sleep(2000);
	}
	
	@When("J accepte l alerte")
	public void jAccepteLAlerte() throws InterruptedException {
		webActionHelperMethods.acceptAlert();
		Thread.sleep(2000);
	}
	
	@Then("l alerte disparait")
	public void lAlerteDisparait() {
	}



}
