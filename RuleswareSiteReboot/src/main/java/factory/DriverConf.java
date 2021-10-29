package factory;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class DriverConf {
	
	static String pathFormat = System.getProperty("user.dir")+"\\src\\main\\resources\\%s";
	public WebDriver driver;
	static String url = "https://www.rulesware.com";
	
	 
	@BeforeTest
	public void ConfiguringBrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

  @AfterTest
  public void CloseBrowser() throws InterruptedException{
	  driver.quit();
  }

}
