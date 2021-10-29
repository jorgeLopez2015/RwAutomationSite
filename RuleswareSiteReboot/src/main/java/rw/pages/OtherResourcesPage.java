package rw.pages;

import org.openqa.selenium.By;

public class OtherResourcesPage {

	// Header
	By rw_img_home = By.xpath("//img[@class='attachment-large size-large']");
	By expertise_menu = By.xpath("//href[text()='Expertise']");
	By solutions_menu = By.xpath("//href[text()='Solutions']");
	By careers_page = By.xpath("//href[text()='Careers']");
	By resources_menu = By.xpath("//a[@id='sm-16337018523791755-5']");

	// breadcrumbs
	By breadcrumbs_home_link = By.cssSelector("a[href='https://rulesware.com']");

	By title_section = By.xpath("//h1[contains(text(), 'Helpful Resources')]");
	By loan_exp_calculator_section = By.xpath("//span[contains(text(), 'LoanExpediter™ Calculator Coming Soon!')]");

	// Downloads section
	By downloads_title = By.xpath("//h2[contains(text(), 'DOWNLOADS')]");
	By data_sheet_button = By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/rulesware-loanexpediter-infographic.pdf/']");
	By checklist_button = By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/FINAL-Rulesware-Checklist-04.pdf']");
	By infographic_button = By.cssSelector("a[href='https://2kl2fy4absb414pruh2tuaju-wpengine.netdna-ssl.com/wp-content/uploads/2021/09/rulesware-loanexpediter-infographic.pdf']");

	// Video Library Section
	By video1=By.xpath("//span[contains(text(), 'Play')]");

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
