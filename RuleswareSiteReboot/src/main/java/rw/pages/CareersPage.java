package rw.pages;

import org.openqa.selenium.By;

public class CareersPage {
	
	 //Header 
	By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
	By expertise_menu= By.xpath("//href[text()='Expertise']");
	By solutions_menu= By.xpath("//href[text()='Solutions']");
	By careers_page= By.xpath("//href[text()='Careers']");
	By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
	
	//breadcrumbs
    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
    
    //browse jobs section
    By browse_jobs_button=By.cssSelector("a[href='#jobs']");
    By who_we_are_youtube_video=By.cssSelector("a[href='#elementor-action%3Aaction%3Dpopup%3Aopen%26settings%3DeyJpZCI6IjU5MzEiLCJ0b2dnbGUiOmZhbHNlfQ%3D%3D']");
    
    //hear from RW employees dynamic section
    By hear_from_employees_title=By.xpath("//h2[contains(text(), 'Hear from')]");
    
    //dynamic section?
    
     //Why section
    By why_section =By.xpath("h2[contains(text(), 'Why')]");
    
    //glassdoor section
    By glassdoor_section=By.xpath("//img[@src='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/glasstemp.png']");
    
    //Benefits section
    By benefits_title=By.xpath("//h2[contains(text(), 'benefit you')]");
    By competitive_pay= By.xpath("//div[contains(text(),'Competitive pay')]");
    By medical_insurance=By.xpath("//div[contains(text(),'Comprehensive medical')]");
    By dental_coverage=By.xpath("//div[contains(text(),'Dental')]");
    By savings_plan=By.xpath("//div[contains(text(),'Savings')]");
    By time_off=By.xpath("//div[contains(text(),'paid')]");
    By career_connnect=By.xpath("//div[contains(text(),'career')]");
    By professional_development=By.xpath("//div[contains(text(),'investment')]");
    By coaching_program=By.xpath("//div[contains(text(),'coach')]");
    By giving_program=By.xpath("/div[contains(text(),'employee giving')]");
    By work_from_home=By.xpath("//div[contains(text(),'work from home')]");
    By rewards_program=By.xpath("//div[contains(text(),'rewards')]");
    By company_events=By.xpath("//div[contains(text(),'summer events')]");
    
    //employee testimonial
    By employee_testimonial= By.xpath("//h3[contains(text(),'Since joining')]");
    
    //Rw jobs section
    By jobs_section_title=By.xpath("//h2[contains(text(),'Jobs')]");
    By jobs_link=By.cssSelector("a[href='https://jobs.jobvite.com/rulesware']");
    
    //get in touch section
  	By work_together_text= By.xpath("//h2[contains(text(), 'Want to know')]");
  	By get_in_touch_button= By.cssSelector("a[href='https://rulesware.com/contact/?subject=career']");
  		
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
