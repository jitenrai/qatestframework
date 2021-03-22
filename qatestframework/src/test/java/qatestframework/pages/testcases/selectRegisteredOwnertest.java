/**
 * 
 */
package qatestframework.pages.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import qatestframework.pages.LandingPage;
import qatestframework.pages.selectRegisteredOwner;


/**
 * @author jiten
 *
 */
public class selectRegisteredOwnertest {
	
	
	@Test
	public void registeredOwner(){
		
	
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
		
		System.out.println("Registration tests passed");
		
		driver.quit();
	}

}
