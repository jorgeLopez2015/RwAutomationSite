package rw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.utils.Wrapper;

public class ContactUsPage extends Wrapper {
	
	 public ContactUsPage(WebDriver driver) {
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
    
    
    //Fields
    By first_name_txtbox=By.id("input_2_11_3");
    By last_name_txtbox=By.id("input_2_11_6");
    By email_txtbox=By.id("input_2_3");
    By phone_txtbox=By.id("input_2_7");
    By website_txtbox=By.id("input_2_13");
    By company_txtbox=By.id("input_2_5");
    By job_txtbox=By.id("input_2_6");
    By subject_dropdown=By.id("input_2_8");
    By message_txtarea=By.id("input_2_10");
    
    //add locator to subject values
    By captcha_check_box=By.id("recaptcha-anchor");
    By submit_btn=By.id("gform_submit_button_2");
    
    By sales_mail=By.cssSelector("a[href='mailto:sales@rulesware.com']");
    By careers_mail=By.cssSelector("a[href='mailto:careers@rulesware.com']");
    
    By labor_notices_link=By.cssSelector("a[href='https://rulesware.com/labor-notices/']");
    
    //social media section
    By Facebook_icon_1 = By.cssSelector("a[href='https://www.facebook.com/Rulesware/']");
	By Instagram_icon_1 = By.cssSelector("a[href='https://www.instagram.com/rulesware/']");
	By LinkedIn_icon_1 = By.cssSelector("a[href='https://www.linkedin.com/company/rulesware?trk=biz-companies-cym']");
	By YouTube_icon_1 = By.cssSelector("a[href='https://www.youtube.com/user/Rulesware']");
	
	By our_offices_section=By.xpath("//h2[contains(text(), 'Our Offices')]");
	
	
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
    
    public void fillingContactInformation(String fname, String lname, String email, String phone, String website, String company, String jobTitle, String message) {
    	type(fname, first_name_txtbox);
    	type(lname, last_name_txtbox);
    	type(email, email_txtbox);
    	type(phone, phone_txtbox);
    	type(website, website_txtbox);
    	type(company, company_txtbox);
    	type(jobTitle, job_txtbox);
    	selectingDropdown(subject_dropdown);
    	type(message, message_txtarea);
    }
    
}
