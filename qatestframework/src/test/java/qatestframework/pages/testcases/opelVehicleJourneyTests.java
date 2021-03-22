/**
 * 
 */
package qatestframework.pages.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import qatestframework.pages.LandingPage;
import qatestframework.pages.opelVehicleJourney;
import qatestframework.pages.selectRegisteredOwner;

/**
 * @author jiten
 *
 */
public class opelVehicleJourneyTests {
	
	
	@Test
	public void opelJourney1(){
	
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
	
	opelVehicleJourney opel = new opelVehicleJourney(driver);
	
	opel.opelJourney1();
	System.out.println("OpelJourney one is pass");
	driver.quit();
	
	}	
	
	@Test
	public void opelJourney2(){
	
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
	
	opelVehicleJourney opel = new opelVehicleJourney(driver);
	
	opel.opelJourney2();
	System.out.println("OpelJourney two is pass");
	driver.quit();
	
	}	
	
	@Test
	public void opelJourney3(){
	
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
	
	opelVehicleJourney opel = new opelVehicleJourney(driver);
	
	opel.opelJourney3();
	System.out.println("OpelJourney three is pass");
	driver.quit();
	
	}	
		
	
	
	
	
	
	
	
	
	
	

}
