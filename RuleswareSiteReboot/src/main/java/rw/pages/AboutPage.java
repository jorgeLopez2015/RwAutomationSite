package rw.pages;

import org.openqa.selenium.By;

public class AboutPage {
	
	
	//Header 
		By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
		By expertise_menu= By.xpath("//href[text()='Expertise']");
		By solutions_menu= By.xpath("//href[text()='Solutions']");
		By careers_page= By.xpath("//href[text()='Careers']");
		By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
		
		//breadcrumbs
	    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
	    
	    
	   //First section
	    By complicated_business_problem_title=By.xpath("//h1[contains(text(), 'Complicated')]");
	    By we_know_pega=By.xpath("//h2[contains(text(), 'We Know Pega')]");
	    
	    //Rulesware difference section
	    By rulesware_differences= By.xpath("//h2[contains(text(), 'The Rulesware')]");
	   
	    //add a wait to this section  while elements appear
	    By expertise_title=By.xpath("//span[contains(text(), 'Expertise')]");
	    By education_title=By.xpath("//span[contains(text(), 'Education')]");
	    By people_title=By.xpath("//span[contains(text(), 'People')]");
	    By hand_off_title=By.xpath("//span[contains(text(), 'Hand Off')]");
	    
	    //rw awards section
	    By rw_awards=By.xpath("//span[contains(text(), '2021 Pega Partner Innovation Award')]");
	    
	    //team section
	    By meet_our_team_btn=By.cssSelector("a[href='https://rulesware.com/team/']");
	    
	    // get in touch section
		By howcanhelpUrbusiness_text = By.xpath("//h2[contains(text(), 'Want to know')]");
		By get_in_touch_button = By.cssSelector("a[href='https://rulesware.com/contact/']");

		// Footer links and icons
		By resources_link = By.cssSelector("a[href='https://rulesware.com/resources/']");
		By about_link = By.cssSelector("a[href='https://rulesware.com/about/']");
		By offices_link = By.cssSelector("a[href='https://rulesware.com/contact/#offices']");
		By contact_link = By.cssSelector("a[href='https://rulesware.com/contact/']");
		By pega_partner_link = By.cssSelector("a[href='https://rulesware.com/pega/']");
		By go_to_top_btn = By.xpath("//a[@class='elementor-icon __mPS2id']']");
		By rulesware_go_home_img = By.xpath("//img[@alt='RULESWARE'");
		By privacy_policy_link = By.cssSelector("a[href='https://rulesware.com/privacy-policy/']");
		By Terms_of_use_link = By.cssSelector("a[href='https://rulesware.com/terms-of-use/']");
		By Facebook_icon = By.cssSelector("a[href='https://www.facebook.com/Rulesware/']");
		By Instagram_icon = By.cssSelector("a[href='https://www.instagram.com/rulesware/']");
		By LinkedIn_icon = By.cssSelector("a[href='https://www.linkedin.com/company/rulesware?trk=biz-companies-cym']");
		By YouTube_icon = By.cssSelector("a[href='https://www.youtube.com/user/Rulesware']");
		
		
		
		//test de push
		
		test2
	    

}
