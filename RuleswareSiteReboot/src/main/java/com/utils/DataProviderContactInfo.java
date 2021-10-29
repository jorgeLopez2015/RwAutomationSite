package com.utils;

import org.testng.annotations.DataProvider;

public class DataProviderContactInfo {
	
	@DataProvider(name = "RequiredContactInformation")
	public Object[][] dataSetContactInfo(){
		return new Object[][]
				{
					{"Dany", "Magana", "daniela.magana@rulesware.com", "50370872828", "www.google.com", "Google Co", "QA Engineer", "Automating Web page for testing purposes"},
				};
	}
	
	@DataProvider(name = "ExpertiseMenuOptions")
	public Object[][] dataSetMenuOptions(){
		return new Object[][]
				{
					{1, "https://rulesware.com/industries/healthcare/"},
					{2, "https://rulesware.com/industries/financial/"},
					{3, "https://rulesware.com/landing-page-customer-decision-hub-cdh/"},
					{4, "https://rulesware.com/services/"}
				};
	}

}
