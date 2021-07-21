package seleniumgluecode;

import cucumber.api.java.en.Given;

public class stepdefinitions {
	
	@Given("^Take screenshot of page$")
	public void take_screenshot_of_page() throws Throwable {
		//steps.openPageAndTakeScreenshot();
	}
	
	@Given("^Automate Amazon Affiliates Products CreationAutomate Amazon Affiliates Products Creation")
	public void automateAmazonAffiliatesProductsCreation() throws Throwable {
		//steps.automateAmazonAffilationCSVCreation();
	}
	
	@Given("^IWA OUUUVRE MOI DAKCHI W KHEREJ LIA DAKCHI")
	public void ouvreAsahbiDakchi() throws Throwable {
		//steps.ouvreAsahbiDakchi();
		steps.checkIfResidenceAvailable();
	}
}

