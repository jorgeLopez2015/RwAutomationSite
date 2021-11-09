package com.utils;

import org.testng.annotations.DataProvider;

public class DataProviderRWSite {
	
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
	
	@DataProvider(name = "MediaButtons")
	public Object[][] dataSetMediaButtons(){
		return new Object[][]
				{
					{1, "https://www.facebook.com/Rulesware/"},
					{2, "https://www.instagram.com/rulesware/"},
					{3, "https://www.linkedin.com/company/rulesware?trk=biz-companies-cym"},
					{4, "https://www.youtube.com/user/Rulesware"}
				};
	}
	
	@DataProvider(name = "RequiredAppyInformation")
	public Object[][] dataSetApplyInfo(){
		return new Object[][]
				{
					{"Dany", "Magana", "daniela.magana@rulesware.com", "50370872828", "www.google.com", "Google Co", "QA Engineer", "Automating Web page for testing purposes"},
				};
	}
	
	

}
