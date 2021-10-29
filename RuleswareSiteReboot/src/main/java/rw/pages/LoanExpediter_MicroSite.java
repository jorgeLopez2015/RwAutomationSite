package rw.pages;

import java.util.List;

import org.openqa.selenium.By;

public class LoanExpediter_MicroSite {
	
	     //Header 
		By rw_img_loanexp_= By.cssSelector("a[href='https://rulesware.com/loanexpediter/']");
		By homepage_page_menu_link= By.cssSelector("a[href='https://rulesware.com/']");
		By product_menu_link= By.cssSelector("a[href='/loanexpediter#product']");
		By resources_menu_link= By.cssSelector("a[href='/loanexpediter#resources']");
		By webinar_menu_link= By.cssSelector("a[href='/loanexpediter#webinar']");
		By about__menu_link= By.cssSelector("a[href='/loanexpediter#about']");
		By contact_menu_link=By.cssSelector("a[href='https://rulesware.com/loanexpediter/contact/'");
		
		//loan expediter page opens in a new tab
		By financial_services_guide_page=By.xpath("//img[@alt='financial services guide']");
		
		//titles
		By modern_lending_title=By.xpath("//h1[text()='Modern Lending Moves Fast.']");
		By fast_simple_preditable_title=By.xpath("//h1[text()='Fast. Simple. Predictable.']");
		By loan_exp_testimonial=By.xpath("//h3[contains(text(), 'exceeded')]");
		//for the elements on this section, add an explicit wait for loading elements when scrolling down
		By reinvent_modern_lending_exp= By.xpath("//h1[text()='Reinvent the Modern']");
		
		
	    //webinar buttons
		//List<WebElement> webinarwatchbuttons = findElements(locator);
		//**webinar video section 
		//webinarwatchbuttons.get(0).click();
		//**webinar resources section
		//webinarwatchbuttons.get(1).click();
		 
		
		By top_lenders_title=By.xpath("//h1[contains(text(), 'Lenders')]");
		By smarter_workflows_title=By.xpath("//h1[contains(text(), 'Smarter ')]");
		
		//contact us button
		By contact_us_button= By.cssSelector("a[href='https://rulesware.com/loanexpediter/contact/'");
		
		//Resources section
		By intelligent_resources_title=By.xpath("//h1[text()='Intelligent Resources for']");
		By relieving_pain_blog_link=By.cssSelector("a[href='https://rulesware.com/relieving-pain-in-the-loan-process-loan-expediter/']");
		By checklist_link=By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/FINAL-Rulesware-Checklist-04.pdf']");
		By ebook_download=By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/10/LoanExpediter-eBook.pdf'");
		By Four_key_success_factors_blog=By.cssSelector("a[href='https://rulesware.com/lending-automation-thought-leadership/']");
		By loan_expediter_data_sheet= By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/LoanExpediter-Data-Sheet.pdf'");
		By lending_compliance_gorilla_blog= By.cssSelector("a[href='https://rulesware.com/addressing-the-lending-compliance/']");
		
		
		//Loan Expediter page About section
		By about_loan_expediter_section=By.xpath("//h1[text()='We Make Lending Easier']");
		
		 //get in touch section
		By howcanhelpUrbusiness_text= By.xpath("//h2[contains(text(), 'Want to know')]");
		
		//pending issue to be resolved - wrong page is opened
		By get_in_touch_button= By.cssSelector("a[href='https://rulesware.com/contact/']");
		
		
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
