/**
 * 
 */
package qatestframework.pages.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import qatestframework.pages.LandingPage;
import qatestframework.pages.audiVechileJourney;
import qatestframework.pages.selectRegisteredOwner;

/**
 * @author jiten
 *
 */
public class audiVechileJourneytests {
	
	@Test
	public void audiJourney1(){
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://hello.friday.de/quote/selectPrecondition");
	
	
	LandingPage cookieCheck = new LandingPage(driver);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	cookieCheck.AcceptCookie();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	cookieCheck.FirstPhase();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	cookieCheck.nextButton();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	selectRegisteredOwner owner = new selectRegisteredOwner(driver);

    owner.ownerValues();		
	owner.nextButton();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	audiVechileJourney audi = new audiVechileJourney(driver);
	
	
	audi.audiJourney1();
	System.out.println("AudiJourney one is pass");
	driver.quit();

}
	@Test
	public void audiJourney2(){
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://hello.friday.de/quote/selectPrecondition");
	
	
	LandingPage cookieCheck = new LandingPage(driver);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	cookieCheck.AcceptCookie();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	cookieCheck.FirstPhase();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	cookieCheck.nextButton();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	selectRegisteredOwner owner = new selectRegisteredOwner(driver);

    owner.ownerValues();		
	owner.nextButton();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	audiVechileJourney audi = new audiVechileJourney(driver);
	
	
	audi.audiJourney2();
	System.out.println("AudiJourney two is pass");
	driver.quit();

}
	@Test
	public void audiJourney3(){
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://hello.friday.de/quote/selectPrecondition");
	
	
	LandingPage cookieCheck = new LandingPage(driver);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	cookieCheck.AcceptCookie();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	cookieCheck.FirstPhase();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	cookieCheck.nextButton();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	selectRegisteredOwner owner = new selectRegisteredOwner(driver);

    owner.ownerValues();		
	owner.nextButton();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	audiVechileJourney audi = new audiVechileJourney(driver);
	
	
	audi.audiJourney3();
	System.out.println("AudiJourney three is pass");
	driver.quit();

}
}
