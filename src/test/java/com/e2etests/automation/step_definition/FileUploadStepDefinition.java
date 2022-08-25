package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.FileUploadPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FileUploadStepDefinition {
	
	private FileUploadPage fileUploadPage;
	public FileUploadStepDefinition() {
		this.fileUploadPage = new FileUploadPage();
	}
	
	@Given("J accede au site web Demo {string}")
	public void jAccedeAuSiteWebDemo(String url) {
	    fileUploadPage.goToURL(url);
	}
	@Given("Je clique sur choisir un fichier et j ouvre le fichier voulu {string}")
	public void jeCliqueSurChoisirUnFichierEtJOuvreLeFichierVoulu(String file_upload) {
		fileUploadPage.fileUpload(file_upload);
	}
	@Then("Le fichier sera selectione")
	public void leFichierSeraSelectione() {
	}






	
	
}
