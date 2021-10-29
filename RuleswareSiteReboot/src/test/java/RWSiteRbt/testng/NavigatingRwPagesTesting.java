package RWSiteRbt.testng;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utils.DataProviderContactInfo;

import factory.DriverConf;
import rw.pages.ContactUsPage;
import rw.pages.CustomerDecisionHubPage;
import rw.pages.FinancialServicesPage;
import rw.pages.HealthcareSolutionsPage;
import rw.pages.Home;


public class NavigatingRwPagesTesting extends DriverConf{
	
	
	@Test(enabled=false, priority=1)
	public void scrollingHomePage() throws InterruptedException {
		Home hpage = new Home(driver);
		hpage.scrollDown();
	}
	
	@Test(enabled=false)
	public void scrollingFinancialPage() {
		Home hpage = new Home(driver);
		FinancialServicesPage fspage = new FinancialServicesPage(driver);
		hpage.clickingFinancialSolution();
		fspage.scrollingFinancialPage();
	}
	
	@Test(enabled=false)
	public void scrollingHealthCarePage() {
		Home hpage = new Home(driver);
		HealthcareSolutionsPage hcpage = new HealthcareSolutionsPage(driver);
		hpage.clickingHealthCareSolution();
		hcpage.scrollingHealthCarePage();
	}
	
	@Test(enabled=false)
	public void scrollingCustomerEngagementSolutionPage() {
		Home hpage = new Home(driver);
		CustomerDecisionHubPage cdhpage = new CustomerDecisionHubPage(driver);
		hpage.clickingCustomerEngagementSolutions();
		cdhpage.scrollingCustomerDecisionPage();
	}
	
	@Test(enabled=false)
	public void scrollingOurApproachPage() {
		Home hpage = new Home(driver);
		hpage.clickingOurApproach();
	}
	
	@Test(enabled=false)
	public void clickingClientsSayDots() {
		Home hpage = new Home(driver);
		hpage.clickingSlideButtons();
	}
	
	@Test(enabled=false, dataProvider="RequiredContactInformation", dataProviderClass=DataProviderContactInfo.class)
	public void getinTouchPage(String fname, String lname, String email, String phone, String website, String company, String jobTitle, String message) {
		Home hpage = new Home(driver);
		ContactUsPage cpage = new ContactUsPage(driver);
		hpage.clickingContactUs();
		cpage.fillingContactInformation(fname, lname, email, phone, website, company, jobTitle, message);
	}
	
	@Test(enabled=true, priority=0, dataProvider="ExpertiseMenuOptions", dataProviderClass=DataProviderContactInfo.class)
	public void reviewHomeExpertiseMenu(int option, String oldUrl) throws InterruptedException {
		SoftAssert sassert = new SoftAssert();
		Home hpage = new Home(driver);
		String getUrl = hpage.reviewingExpertiseMenu(option);
		System.out.println(getUrl);
		sassert.assertEquals(oldUrl, getUrl, "Was not clicked on expected sub menu option");
	}

}
