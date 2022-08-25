package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class PatientHistoryPage {
	private ConfigFileReader configFileReader;
	
	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "input_71")
	public static WebElement gender;
	
	@FindBy(how = How.ID, using = "first_45")
	public static WebElement first_name;
	
	@FindBy(how = How.ID, using = "last_45")
	public static WebElement last_name;
	
	@FindBy(how = How.ID, using = "input_46_month")
	public static WebElement month;
	
	@FindBy(how = How.ID, using = "input_46_day")
	public static WebElement day;
	
	@FindBy(how = How.ID, using = "input_46_year")
	public static WebElement year;
	
	@FindBy(how = How.ID, using = "input_72")
	public static WebElement height;
	
	@FindBy(how = How.ID, using = "input_73")
	public static WebElement weight;
	
	@FindBy(how = How.ID, using = "input_74")
	public static WebElement email;
	
	@FindBy(how = How.ID, using = "input_50")
	public static WebElement reason;
	
	@FindBy(how = How.ID, using = "input_51")
	public static WebElement drug_allergies;
	
	@FindBy(how = How.ID, using = "input_52_0")
	public static WebElement anemia;
	
	@FindBy(how = How.ID, using = "input_52_8")
	public static WebElement fainting;
	
	@FindBy(how = How.ID, using = "input_55")
	public static WebElement other_illnesses;
	
	@FindBy(how = How.ID, using = "input_69")
	public static WebElement opeations;
	
	@FindBy(how = How.ID, using = "input_68")
	public static WebElement medications;
	
	@FindBy(how = How.ID, using = "input_80_1")
	public static WebElement exercice;
	
	@FindBy(how = How.ID, using = "input_81_2")
	public static WebElement diet;
	
	@FindBy(how = How.ID, using = "input_76_0")
	public static WebElement alcohol;
	
	@FindBy(how = How.ID, using = "input_77_1")
	public static WebElement caffeine;
	
	@FindBy(how = How.ID, using = "label_input_78_0")
	public static WebElement smoke;
	
	@FindBy(how = How.ID, using = "input_17")
	public static WebElement comments;
	
	@FindBy(how = How.ID, using = "input_14")
	public static WebElement submit;
	
	public PatientHistoryPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create methods */
	public void goToURL() {
		Setup.driver.get(configFileReader.getProperties("jetform.url"));
	}
	
	public void selectGender(String chooseGender) {
		Select select = new Select(gender);
		select.selectByVisibleText(chooseGender);
	}
	
	public void fillFisrstName(String text_first_name) {
		first_name.sendKeys(text_first_name);
		}
	
	public void fillLastName(String text_last_name) {
		last_name.sendKeys(text_last_name);
		}
	
	public void fillMonth(String text_month) {
		month.sendKeys(text_month);
		}
	
	public void fillDay(String text_day) {
		day.sendKeys(text_day);
		}
	
	public void fillyear(String text_year) {
		year.sendKeys(text_year);
		}
	
	public void fillHeight(String text_height) {
		height.sendKeys(text_height);
		}
	
	public void fillWeight(String text_weight) {
		weight.sendKeys(text_weight);
		}
	
	public void fillEmail(String mail) {
		email.sendKeys(mail);
		}
	
	public void fillReason(String text_reason) {
		reason.sendKeys(text_reason);
		}
	
	public void fillDrugAllergies(String text_drug_allergies) {
		drug_allergies.sendKeys(text_drug_allergies);
		}
	
	public void clickAnemia() {
		anemia.click(); 
		}
	
	public void clickFainting() {
		fainting.click();
		}
	
	public void fillOther_illnesses(String text_other_illnesses) {
		other_illnesses.sendKeys(text_other_illnesses);
		}
	
	public void fillOpeations(String text_opeations) {
		opeations.sendKeys(text_opeations);
		}
	
	public void fillMedications(String text_medications) {
		medications.sendKeys(text_medications);
		}
	
	public void clickExercice() {
		exercice.click();
		}
	
	public void clickDiet() {
		diet.click();
		}
	
	public void clickAlcohol() {
		alcohol.click();
		}
	
	public void clickCaffeine() {
		caffeine.click();
		}
	
	public void clickSmoke() {
		smoke.click();
		}
	
	public void fillComments(String text_comments) {
		comments.sendKeys(text_comments);
		}
	
	public void clickSubmit() {
		submit.click();
		}
	
}

