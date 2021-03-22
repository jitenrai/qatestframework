/**
 * 
 */
package qatestframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiten
 * 
 * 
 * This class will store locators and methods for selectRegisteredOwner page
 *
 */
public class selectRegisteredOwner {

		
		WebDriver driver;
		
		By register = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/button[1]");
		By purpose = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[3]/div[2]/button[1]");
		By next = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
		
		//initiliazing WebDriver
		public selectRegisteredOwner (WebDriver driver) {
			
			this.driver=driver;
			
		}
		
		
		public void ownerValues(){
			
			driver.findElement(register).sendKeys("Yes");
			driver.findElement(purpose).sendKeys("Yes");
			
		}
		
         public void nextButton(){
        	 driver.findElement(next).click();
         }    
	}




