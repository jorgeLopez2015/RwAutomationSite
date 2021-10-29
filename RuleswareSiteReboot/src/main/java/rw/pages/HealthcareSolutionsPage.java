package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.Wrapper;

public class HealthcareSolutionsPage extends Wrapper{
	
	public HealthcareSolutionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

			//Header 
			By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
			By expertise_menu= By.xpath("//href[text()='Expertise']");
			By solutions_menu= By.xpath("//href[text()='Solutions']");
			By careers_page= By.xpath("//href[text()='Careers']");
			By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
			
			//breadcrumbs
		    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
		    By breadcrumbs_industries_link=By.cssSelector("a[href='https://rulesware.com/industries/']");
	
		    //first section
		    By healthcare_solutions_text= By.xpath("//h1[contains(text(), 'Healthcare')]");
		    By healthcare_insurance_op_text=By.xpath("//h2[contains(text(), 'Healthcare insurance')]");
		    By Streamline_text=By.xpath("//h3[contains(text(), 'Our milestones')]");
		    By streamlineSection = By.xpath("//h2[contains(text(), 'Streamline the flow')]");
		    
		    //Healthcare solutions section
		    By healthcare_solutions_title= By.xpath("//h2[contains(text(), 'Healthcare Solutions')]");
		    By enrollment_section= By.xpath("//span[contains(text(), 'Enrollment')]");
		    By authorizations_section= By.xpath("//span[contains(text(), 'Auth')]");
		    By claims_automation_section= By.xpath("//span[contains(text(), 'Claims Automation')]");
		    By customer_decision_hub_text=By.xpath("//span[contains(text(), 'Customer Decision')]");
		    By customer_decision_learn_more_button= By.cssSelector("a[href='https://rulesware.com/landing-page-customer-decision-hub-cdh/']");
		    
		    
		  //success story section
			By success_story_text=By.xpath("//h2[contains(text(), 'View')]");
			By success_story_link= By.xpath("//span[contains (text(), 'Health Insurer')]");
			
			//get in touch section
			By howcanhelpUrbusiness_text= By.xpath("//h2[contains(text(), 'Want to know')]");
			By get_in_touch_button= By.cssSelector("a[href='https://rulesware.com/contact/?subject=healthcare']");
			
			
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

		    public void scrollingHealthCarePage() {
		    	moveTo(healthcare_insurance_op_text);
		    	moveTo(streamlineSection);
		    	moveTo(Streamline_text);
		    	moveTo(healthcare_solutions_title);
		    	moveTo(success_story_text);
		    	moveTo(Terms_of_use_link);
		    }
		    
		    
		    
		    
		    
		    
}
