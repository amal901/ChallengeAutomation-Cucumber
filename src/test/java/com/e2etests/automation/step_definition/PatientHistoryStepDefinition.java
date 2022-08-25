package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.PatientHistoryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientHistoryStepDefinition {
	
	private PatientHistoryPage patientHistoryPage;
	public PatientHistoryStepDefinition() {
		this.patientHistoryPage = new PatientHistoryPage();
	}

	@Given("J accede a l application Jetform")
	public void jAccedeALApplicationJetform() {
		patientHistoryPage.goToURL();
	}
	@When("Je selectionne Female dans Pateient Gende {string}")
	public void jeSelectionneFemaleDansPateientGende(String gender) {
		patientHistoryPage.selectGender(gender);
	}
	@When("Je saisis le prenom dans First Name {string}")
	public void jeSaisisLePrenomDansFirstName(String first_name) {
	    patientHistoryPage.fillFisrstName(first_name);;
	}
	@When("Je saisis le nom dans Last Name {string}")
	public void jeSaisisLeNomDansLastName(String Last_name) {
	    patientHistoryPage.fillLastName(Last_name);
	}
	@When("Je saisis le mois dans Month {string}")
	public void jeSaisisLeMoisDansMonth(String month) {
	    patientHistoryPage.fillMonth(month);
	}
	@When("Je saisis le jour dans Day {string}")
	public void jeSaisisLeJourDansDay(String day) {
	    patientHistoryPage.fillDay(day);
	}
	@When("Je saisis l annee dans Year {string}")
	public void jeSaisisLAnneeDansYear(String year) {
	    patientHistoryPage.fillyear(year);
	}
	@When("Je saisis l hauter dans Height {string}")
	public void jeSaisisLHauterDansHeight(String height) {
	    patientHistoryPage.fillHeight(height);
	}
	@When("Je saisis le poid dans Weight {string}")
	public void jeSaisisLePoidDansWeight(String weight) {
	    patientHistoryPage.fillWeight(weight);
	}
	@When("Je saisis l adesse email dans E-mail {string}")
	public void jeSaisisLAdesseEmailDansEMail(String email) {
	    patientHistoryPage.fillEmail(email);
	}
	@When("Je saisis la raison dans Reason for seeing doctor {string}")
	public void jeSaisisLaRaisonDansReasonForSeeingDoctor(String reason) {
	    patientHistoryPage.fillReason(reason);
	}
	@When("Je saisis l allergie dans drug allergies {string}")
	public void jeSaisisLAllergieDansDrugAllergies(String string) {
	    patientHistoryPage.fillDrugAllergies(string);
	}
//	@When("Je coche une maladie dans Have you ever had")
//	public void jeCocheUneMaladieDansHaveYouEverHad() {
//		patientHistoryPage.clickFainting();
//	    patientHistoryPage.clickAnemia();
//	}
	@When("Je saisis une autre maladie dans Other illnesses {string}")
	public void jeSaisisUneAutreMaladieDansOtherIllnesses(String other_illnesses) {
	    patientHistoryPage.fillOther_illnesses(other_illnesses);
	}
	@When("Je saisis l operation dans Please list any Operations and date of each {string}")
	public void jeSaisisLOperationDansPleaseListAnyOperationsAndDateOfEach(String opeations) {
	    patientHistoryPage.fillOpeations(opeations);
	}
	@When("Je saisis le medicament dans Please list your Curent Medications {string}")
	public void jeSaisisLeMedicamentDansPleaseListYourCurentMedications(String medications) {
	    patientHistoryPage.fillMedications(medications);
	}
	@When("Je coche {int}-{int} days dans Exercice")
	public void jeCocheDaysDansExercice(Integer int1, Integer int2) {
	    patientHistoryPage.clickExercice();
	}
	@When("Je coche I dont have diet dans Eating following a diet")
	public void jeCocheIDontHaveDietDansEatingFollowingADiet() {
	    patientHistoryPage.clickDiet();
	}
	@When("Je coche I dont drink dans Alcohol Consumption")
	public void jeCocheIDontDrinkDansAlcoholConsumption() {
	    patientHistoryPage.clickAlcohol();
	}
	@When("Je coche {int}-{int} cups\\/day dans Caffeine Consumption")
	public void jeCocheCupsDayDansCaffeineConsumption(Integer int1, Integer int2) {
	    patientHistoryPage.clickCaffeine();
	}
	@When("Je coche No dans Do you smoke")
	public void jeCocheNoDansDoYouSmoke() {
	    patientHistoryPage.clickSmoke();
	}
	@When("Je saisis un commentaire dans Include other comments {string}")
	public void jeSaisisUnCommentaireDansIncludeOtherComments(String comments) {
	    patientHistoryPage.fillComments(comments);
	}
	@When("Je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
	    patientHistoryPage.clickSubmit();
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
	    
	}
}
