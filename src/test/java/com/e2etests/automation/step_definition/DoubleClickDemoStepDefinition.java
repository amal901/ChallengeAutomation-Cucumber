package com.e2etests.automation.step_definition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_object.DoubleClickDemoPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickDemoStepDefinition {

	private DoubleClickDemoPage doubleClickDemoPage;

	public DoubleClickDemoStepDefinition() {
		this.doubleClickDemoPage = new DoubleClickDemoPage();
	}

	@When("Je double clique sue le bouton Double Click Me")
	public void jeDoubleCliqueSueLeBoutonDoubleClickMe() throws InterruptedException {
		doubleClickDemoPage.doubleClickOnElementUsingActions();
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(5));
		DoubleClickDemoPage.doubleClickMessage = wait.until(ExpectedConditions.visibilityOf(DoubleClickDemoPage.doubleClickMessage));
		Thread.sleep(2000);
	}

	@Then("Un message s affiche au dessous de la page {string}")
	public void unMessageSAfficheAuDessousDeLaPage(String msg) {
		String message = DoubleClickDemoPage.doubleClickMessage.getText();
		Assert.assertTrue(message.contains(msg));
	}
}
