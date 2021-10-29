package rw.pages;

import org.openqa.selenium.By;

public class BlogsPage {
	
	     //Header 
		By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
		By expertise_menu= By.xpath("//href[text()='Expertise']");
		By solutions_menu= By.xpath("//href[text()='Solutions']");
		By careers_page= By.xpath("//href[text()='Careers']");
		By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
		
		//breadcrumbs
	    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
		
		//slide blogs section
		By page_title=By.xpath("//h1[contains(text(),'Top')]");
		By blog_story1=By.xpath("(//a[contains(text(),'Scrum Basics – The Servant Leader & The Storytelle')])[1]");
		By blog_story2=By.xpath("(//a[normalize-space()='Rulesware Celebrates Executive Award Winner'])[1]");		
		By blog_story3=By.xpath("(//a[contains(text(),'Rulesware at PegaWorld iNspire 2021')])[1]");
		By blog_story4=By.xpath("(//a[contains(text(),'15 Years of Success: An Interview With Rulesware C')])[2]");
		
		//blog stories buttons
		//List<WebElement> change_story_buttons = findElements(locator);
		//story1
		//change_story_buttons.get(0).click();
		//story2
		//change_story_buttons.get(1).click();
		//story3
		//change_story_buttons.get(2).click();
		//story4
		//change_story_buttons.get(3).click();
		
		//categories buttons
		By all_filter_btn=By.xpath("//span[contains(text(),'All')]");
		By culture_filter_btn=By.xpath("//span[contains(text(),'Culture')]");
		By industry_filter_btn=By.xpath("//span[contains(text(),'Industry')]");
		
		//Blog Stories
		//page 1
		By woman_in_tech_webinar=By.cssSelector("a[href='https://rulesware.com/women-in-tech-webinar-a-success/']");
		By second_page_button=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/page/2/']");
		By third_page_button=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/page/3/']");
		By next_page_button= By.xpath("//a[contains(text(),'Next')]");
		
		//page 2
		By mexico_office_blog=By.cssSelector("a[href='https://rulesware.com/rulesware-mexico-office-is-open-for-business/']");
		By previous_page_button= By.xpath("//a[contains(text(),'Next')]");
		By first_page_button=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/']");
		By third_page_button_p2=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/page/3/']");
		By next_page_button_p2= By.xpath("//a[contains(text(),'Next')]");
		
		//page 3
		By bpm_blog_story=By.cssSelector("a[href='https://rulesware.com/bpm-transforms-business/']");
		By previous_page_button_p3= By.xpath("//a[contains(text(),'Next')]");
		By first_page_button_p3=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/']");
		By second_page_button_p3=By.cssSelector("a[href='https://rulesware.com/wp-admin/admin-ajax.php/page/2/']");
		
						
		//Footer links and icons
		By resources_link= By.cssSelector("a[href='https://rulesware.com/resources/']");
		By about_link= By.cssSelector("a[href='https://rulesware.com/about/']");
		By offices_link= By.cssSelector("a[href='https://rulesware.com/contact/#offices']");
		By contact_link= By.cssSelector("a[href='https://rulesware.com/contact/']");
		By pega_partner_link= By.cssSelector("a[href='https://rulesware.com/pega/']");
		By go_to_top_btn=By.xpath("//a[@class='elementor-icon __mPS2id']']");
		By rulesware_go_home_img= By.xpath("//img[@alt='RULESWARE']");
		By privacy_policy_link= By.cssSelector("a[href='https://rulesware.com/privacy-policy/']");
		By Terms_of_use_link= By.cssSelector("a[href='https://rulesware.com/terms-of-use/']");
		By Facebook_icon= By.cssSelector("a[href='https://www.facebook.com/Rulesware/']");
		By Instagram_icon= By.cssSelector("a[href='https://www.instagram.com/rulesware/']");
		By LinkedIn_icon= By.cssSelector("a[href='https://www.linkedin.com/company/rulesware?trk=biz-companies-cym']");
		By YouTube_icon= By.cssSelector("a[href='https://www.youtube.com/user/Rulesware']");
		
	
	
	
	
	
	
	
	

}
