/**
 * 
 */
package qatestframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author jiten
 * 
 * 
 * This class will store locators and methods for landing page
 *
 */
public class LandingPage {
	
	WebDriver driver;
	
	By cookie = By.xpath("//*[@id='uc-btn-accept-banner']");
	By buyingvalue = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[1]/button[2]");
	By inceptiondate = By.name("inceptionDate");
	By banner = By.id("uc-banner-text");
	By next = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button");
	
	//initiliazing WebDriver
	public LandingPage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public void AcceptCookie(){
		
		driver.findElement(banner).isEnabled();
		driver.findElement(cookie).click();
		
	}
	
	public void FirstPhase(){
		driver.findElement(buyingvalue).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(inceptiondate).sendKeys("24.04.2021");
	}

	public void nextButton(){
		driver.findElement(next).click();
	}
}
