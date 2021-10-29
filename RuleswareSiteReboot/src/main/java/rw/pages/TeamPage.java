package rw.pages;

import org.openqa.selenium.By;

public class TeamPage {
		
	          //Header 
			By rw_img_home= By.xpath("//img[@class='attachment-large size-large']");
			By expertise_menu= By.xpath("//href[text()='Expertise']");
			By solutions_menu= By.xpath("//href[text()='Solutions']");
			By careers_page= By.xpath("//href[text()='Careers']");
			By resources_menu= By.xpath("//a[@id='sm-16337018523791755-5']");
			
			//breadcrumbs
		    By breadcrumbs_home_link= By.cssSelector("a[href='https://rulesware.com']");
	
		    //consultants section
		    By consultants_title= By.xpath("//h2[contains(text(), 'Unsurpassed')]");
		    By Anthony_img=By.xpath("//img[@alt='Anthony Lee']");
		    By Ji_Yoon_img=By.xpath("//img[@src='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/08/1.jpg']");
		    By Aponte_img=By.xpath("//img[@alt='Carlos Aponte']");
		    By Molly_img=By.xpath("//img[@alt='Molly Eddington']");
		    By Dana_img=By.xpath("//img[@alt='Dana Reiner']");
		    By DavidB_img=By.xpath("//img[@alt='David Bliss']");
		    By Ashish_img=By.xpath("//img[@alt='Ashish Sharma']");
		    By JonP_img=By.xpath("//img[@alt='Jon Pellant']");
		    By DavidM_img=By.xpath("//img[@alt='David McPhail']");
		    By Alexis_img=By.xpath("//img[@alt='Alexis Ayala']");
		    By Carlos_A_img=By.xpath("//img[@alt='Carlos Alas']");
		    By Logan_img=By.xpath("//img[@alt='Logan McCune']");
		    By JohnT_img=By.xpath("//img[@alt='John Timmons']");
		    By Seth_img=By.xpath("//img[@alt='Seth Oster']");
		    By Pramila_img=By.xpath("//img[@alt='Pramila Gardner']");
		    
		    
		    //testimonial
		    By testimonial=By.xpath("//div[contains(text(),'Since joining')]");
		    
		    
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
		   
		

}
