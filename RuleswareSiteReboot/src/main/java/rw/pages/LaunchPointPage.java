package rw.pages;

import org.openqa.selenium.By;

public class LaunchPointPage {
	
	     //Header 
		By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
		By expertise_menu= By.xpath("//href[text()='Expertise']");
		By solutions_menu= By.xpath("//href[text()='Solutions']");
		By careers_page= By.xpath("//href[text()='Careers']");
		By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
		
		//breadcrumbs
	    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
	    
	    By customer_of_financial_institutions_title= By.xpath("//h2[contains(text(), 'cumbersome')]");
	   
	    //two columns section
	    By customers_looking_for_help_title=By.xpath("//h3[contains(text(), 'account')]");
	    By financial_institutions_hope_to_title=By.xpath("//h3[contains(text(), 'Financial Institutions')]");
	  
	    
	    By launchpoint_paragraph=By.xpath("//h2[contains(text(), 'specific situation')]");
	    By richer_onboarding_funnel= By.xpath("//span[contains(text(), 'Funnel')]");
	    
	    
	     //get in touch section
		By howcanhelpUrbusiness_text= By.xpath("//h2[contains(text(), 'Discover')]");
		By get_in_touch_button= By.cssSelector("a[href='https://rulesware.com/contact/?subject=launch']");
		
		
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
