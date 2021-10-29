package rw.pages;

import org.openqa.selenium.By;

public class ClientStoriesPage {
	
	  		//Header 
			By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
			By expertise_menu= By.xpath("//href[text()='Expertise']");
			By solutions_menu= By.xpath("//href[text()='Solutions']");
			By careers_page= By.xpath("//href[text()='Careers']");
			By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
			
			//breadcrumbs
		    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
		    
		    By title_section=By.xpath("//h1[contains(text(),'measure our own')]");
		    By client_story1=By.cssSelector("a[href='https://rulesware.com/streamline-vehicle-warranty-repairs/']");
		    By client_story2=By.cssSelector("a[href='https://rulesware.com/robust-back-office-automation/']");
	
		    //categories buttons
		  	By all_filter_btn=By.xpath("//span[text()='All']");
			By financial_filter_btn=By.xpath("//span[text()='Financial']");
			By healthcare_filter_btn=By.xpath("//span[text()='Healthcare']");
			By insurance_filter_btn=By.xpath("//span[text()='Insurance']");
			By manufacturing_filter_btn=By.xpath("//span[text()='Manufacturing']");
			
			//Financial Story
			By consolidation_story= By.cssSelector("a[href='https://rulesware.com/consolidation-of-disparate/']");
			
			//Healthcare Story
	        By pharmacy_processing= By.cssSelector("a[href='https://rulesware.com/pharmacy-claims-processing/']");
	        
	        //Insurance Story
	        By policy_management= By.cssSelector("a[href='https://rulesware.com/proposal-and-policy-management/']");
	        
	        //Manufacturing Story
	        By automobile_claims= By.cssSelector("a[href='https://rulesware.com/automobile-claims-analysis-and-reporting/']");
	        
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
	        
	

}
