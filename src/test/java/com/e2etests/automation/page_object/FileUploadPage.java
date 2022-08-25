package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class FileUploadPage {
	
	@FindBy(how = How.ID, using = "uploadfile_0")
	public static WebElement uploadFile;
	
	public FileUploadPage() {
		PageFactory.initElements(Setup.driver, this);	
	}
	
	public void goToURL(String url) {
		Setup.driver.get(url);
	}
	
	public void fileUpload(String upload_file) {
		uploadFile.sendKeys(upload_file);
	}

}
