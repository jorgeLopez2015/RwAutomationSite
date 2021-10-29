package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Wrapper;

public class FinancialServicesPage extends Wrapper {

	public FinancialServicesPage(WebDriver driver) {
		super(driver);
	}
	
	//Header 
		By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
		By expertise_menu= By.xpath("//a[text()='Expertise']");
		By solutions_menu= By.xpath("//a[text()='Solutions']");
		By careers_page= By.xpath("//a[text()='Careers']");
		By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
		
		//breadcrumbs
	    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
	    By breadcrumbs_industries_link=By.cssSelector("a[href='https://rulesware.com/industries/']");
		
	    //first section
	    By personalizeSection = By.xpath("//h2[contains(text(), 'Personalize every')]");
	    By extremely_satisfied_text_section= By.xpath("//h3[contains(text(), 'extremely satisfied')]");
		By rulesware_harnesses_text_section= By.xpath("//h2[contains(text(), 'Rulesware harness')]");
		By financialServiceClientSection = By.xpath("//h3[contains(text(), 'extremely satisfied')]");
		By financialSolutionSection = By.xpath("//h2[text()='Financial Solutions']");
		
		//loan expediter section
		By loanexp_text= By.xpath("//span[contains (text(), 'LoanExp')]");
		By loanexp_btn=By.cssSelector("a[href='https://rulesware.com/loanexpediter/']");
		
		//launchpoint section 
		By launchDescription = By.xpath("//div[contains(text(), 'Omnichannel')]");
		By launchpoint_btn=By.cssSelector("a[href='https://rulesware.com/launchpoint/']");
		By disputesDescription = By.xpath("//div[contains(text(), 'external chargebacks')]");
		By disputes_text= By.xpath("//span[contains (text(), 'Disputes')]");
		
		//success story section
		By success_story_text=By.xpath("//h2[contains(text(), 'Featured')]");
		By success_story_link= By.xpath("//span[contains (text(), 'View Case')]");
		
		//get in touch section
		By howcanhelpUrbusiness_text= By.xpath("//h2[contains(text(), 'Want to know')]");
		By get_in_touch_button= By.cssSelector("a[href='https://rulesware.com/contact/?subject=financial']");
		
		
		//Footer links and icons
	    By resources_link= By.cssSelector("a[href='https://rulesware.com/resources/']");
	    By about_link= By.cssSelector("a[href='https://rulesware.com/about/']");
	    By offices_link= By.cssSelector("a[href='https://rulesware.com/contact/#offices']");
	    By contact_link= By.cssSelector("a[href='https://rulesware.com/contact/']");
	    By pega_partner_link= By.cssSelector("a[href='https://rulesware.com/pega/']");
	    By go_to_top_btn=By.xpath("//a[@class='elementor-icon __mPS2id']']");
	    By rulesware_go_home_img= By.xpath("//img[@alt='RULESWARE'");
	    By privacy_policy_link= By.cssSelector("a[href='https://rulesware.com/privacy-policy/']");
	    By Terms_of_use_link= By.cssSelector("a[href='https://rulesware.com/terms-of-use/']");
	    By Facebook_icon= By.cssSelector("a[href='https://www.facebook.com/Rulesware/']");
	    By Instagram_icon= By.cssSelector("a[href='https://www.instagram.com/rulesware/']");
	    By LinkedIn_icon= By.cssSelector("a[href='https://www.linkedin.com/company/rulesware?trk=biz-companies-cym']");
	    By YouTube_icon= By.cssSelector("a[href='https://www.youtube.com/user/Rulesware']");
	    
	    
		public void scrollingFinancialPage() {
			moveTo(personalizeSection);
			moveTo(rulesware_harnesses_text_section);
			moveTo(financialServiceClientSection);
			moveTo(financialSolutionSection);
			moveTo(launchDescription);
			moveTo(disputesDescription);
			moveTo(success_story_text);
			moveTo(Terms_of_use_link);
		}

}
