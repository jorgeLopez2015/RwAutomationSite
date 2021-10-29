package rw.pages;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.Wrapper;

public class Home extends Wrapper {

	public Home(WebDriver driver) {
		super(driver);
	}
	
	
	//Header 
	By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
	//Expertise Menu
	By expertise_menu= By.xpath("//a[text()='Expertise']");
	By healthcare_option = By.xpath("//a[text()='Healthcare']");
	By financial_option = By.xpath("//a[text()='Financial Services']");
	By customer_eng_option = By.xpath("//a[text()='Customer Engagement']");
	By services_option = By.xpath("//a[text()='Services']");
	//Solutions menu
	By solutions_menu= By.xpath("//href[text()='Solutions']");
	//Careers menu
	By careers_page= By.xpath("//href[text()='Careers']");
	//Resources menu
	By resources_menu= By.xpath("//a[text()='Resources']");
	
	//Buttons
	By financeSolutions_btn = By.xpath("//span[text()='Finance Solutions']");
    By healthcaresolutions_btn= By.xpath("//span[text()='Healthcare Solutions']");
    By cust_eng_solutions_btn= By.xpath("//span[text()='Customer Engagement Solutions']");
    By our_aproach_btn= By.xpath("//span[text()='Our Approach']");
    
    //Sections
    By unlock_digital_revolution_title=By.xpath("//h2[text()='Unlock the']");
    By best_in_class_txt= By.xpath("//span[contains(text(), 'Best in Class')]");
    By ultimate_competitive_advantage_title= By.xpath("//span[contains(text(), 'The Ultimate')]");
    By rockstar_solutions_txt= By.xpath("//span[contains(text(), 'Rock Star')]");
    By customer_first_approach_txt= By.xpath("//span[contains(text(), 'Customer-First')]");
    By testimonial=By.xpath("//h3[contains(text(), 'work with Rulesware')]");
    
    // slide
    //By circlebtn=By.xpath("//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets']");        
    By what_clients_say_title=By.xpath("//h2[text()='WHAT CLIENTS ARE SAYING']");
    By dot_1 = By.xpath("//span[@aria-label='Go to slide 1']");
    By dot_2 = By.xpath("//span[@aria-label='Go to slide 2']");
    By dot_3 = By.xpath("//span[@aria-label='Go to slide 3']");
    By dot_4 = By.xpath("//span[@aria-label='Go to slide 4']");
    By dot_5 = By.xpath("//span[@aria-label='Go to slide 5']");
    By dot_6 = By.xpath("//span[@aria-label='Go to slide 6']");
           	   
  	 //Case Study
    By featured_success_story_title=By.xpath("//h2[contains(text(), 'Featured')]"); 
    By case_study_link=By.xpath("//span[text()='View Case Study']");
    
    //Contact Us page
    
    By get_in_touch_btn=By.xpath("//span[text()='Get in Touch']");
   
    //Footer links and icons
    By resources_link= By.cssSelector("a[href='https://rulesware.com/resources/']");
    By about_link= By.cssSelector("a[href='https://rulesware.com/about/']");
    By offices_link= By.cssSelector("a[href='https://rulesware.com/contact/#offices']");
    By contact_link= By.xpath("//span[text()='Get in Touch']");
    By pega_partner_link= By.cssSelector("a[href='https://rulesware.com/pega/']");
    By go_to_top_btn=By.xpath("//a[@class='elementor-icon __mPS2id']']");
    By rulesware_go_home_img= By.xpath("//img[@alt='RULESWARE'");
    By privacy_policy_link= By.cssSelector("a[href='https://rulesware.com/privacy-policy/']");
    By Terms_of_use_link= By.cssSelector("a[href='https://rulesware.com/terms-of-use/']");
    By facebook_icon= By.cssSelector("a[href='https://www.facebook.com/Rulesware/']");
    By instagram_icon= By.cssSelector("a[href='https://www.instagram.com/rulesware/']");
    By linkedIn_icon= By.cssSelector("a[href='https://www.linkedin.com/company/rulesware?trk=biz-companies-cym']");
    By youTube_icon= By.cssSelector("a[href='https://www.youtube.com/user/Rulesware']");
    
    
    //scrolling down through home page
    public void scrollDown() throws InterruptedException {
        moveTo(unlock_digital_revolution_title);
        moveTo(best_in_class_txt);
        moveTo(ultimate_competitive_advantage_title);
        moveTo(rockstar_solutions_txt);
        moveTo(customer_first_approach_txt);
        moveTo(testimonial);
        moveTo(what_clients_say_title);
        moveTo(featured_success_story_title);
        moveTo(get_in_touch_btn);
        moveTo(Terms_of_use_link);
  	}
    
    
    public void clickingFinancialSolution() {
    	moveTo(financeSolutions_btn);
    	click(financeSolutions_btn);
    }
    
    public void clickingHealthCareSolution() {
    	moveTo(healthcaresolutions_btn);
    	click(healthcaresolutions_btn);
    }
    
    public void clickingCustomerEngagementSolutions() {
    	moveTo(cust_eng_solutions_btn);
    	click(cust_eng_solutions_btn);
    }
    
    public void clickingOurApproach() {
    	moveTo(our_aproach_btn);
    	click(our_aproach_btn);
    }
    
    public void clickingSlideButtons() {
    	moveTo(what_clients_say_title);
    	click(dot_1);
    	click(dot_2);
    	click(dot_3);
    	click(dot_4);
    	click(dot_5);
    	click(dot_6);
    }
    
    public void clickingContactUs() {
    	moveTo(contact_link);
    	click(contact_link);
    }
    
    public String reviewingExpertiseMenu(int option) throws InterruptedException {
    	String urlOpt = null;  	
    	switch(option) {
    		case 1:
    			hoverTo(expertise_menu, 0, healthcare_option, 0);
    			break;
    		case 2:
    			hoverTo(expertise_menu, 0, financial_option, 0);
    			break;
    		case 3:
    			hoverTo(expertise_menu, 0, customer_eng_option, 0);
    			break;
    		case 4:
    			hoverTo(expertise_menu, 0, services_option, 0);
    			break;
    	}
    	urlOpt = getUrl();
    	gobacktoMain();
    	return urlOpt;
    }
    
    public String clickingMediaButtons(int option) throws InterruptedException {
    	String mediaUrl = null;
    	String parent = driver.getWindowHandle();
    	switch(option) {
			case 1:
				moveTo(facebook_icon);
				click(facebook_icon);
				break;
			case 2:
				moveTo(instagram_icon);
				click(instagram_icon);
				break;
			case 3:
				moveTo(linkedIn_icon);
				click(linkedIn_icon);
				break;
			case 4:
				moveTo(youTube_icon);
				click(youTube_icon);
				break;
		}
    	Set<String> mSites = driver.getWindowHandles();
		for(String child:mSites) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				mediaUrl= getUrl();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
    	return mediaUrl;
    }
    
    
}