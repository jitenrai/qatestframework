/**
 * 
 */
package qatestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiten
 *
 *
 *Locators for audi
 */
public class audiVechileJourney {
	
	WebDriver driver;
	   
	By audi = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/div/form/div[3]/div[2]/div[1]/button[5]");


	By audia1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[1]"); 
	By audia11 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[2]");
	By audia12 = By.xpath("/html/body/section/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia13 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia14 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");				
	By audia15 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
					
	By audia3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[2]");
	By audia31 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[2]");
	By audia32 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia33 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia34 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	By audia35 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	By audia4 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[3]");
    By audia41 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia42 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia43 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia44 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By audia45 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	By audia46 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	
	public audiVechileJourney (WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
public void audiJourney1(){
		
		driver.findElement(audi).click();
		driver.findElement(audia1).click();
		driver.findElement(audia11).click();
		driver.findElement(audia12).click();
		driver.findElement(audia13).click();
		driver.findElement(audia14).sendKeys("01.2020");
		driver.findElement(audia15).click();		
	}
public void audiJourney2(){
	
	   driver.findElement(audi).click();
	   driver.findElement(audia31).click();
	   driver.findElement(audia32).click();
	   driver.findElement(audia33).click();
	   driver.findElement(audia34).sendKeys("01.2020");
	   driver.findElement(audia35).click();	
}
public void audiJourney3(){
	
	   driver.findElement(audi).click();
	   driver.findElement(audia4).click();
	   driver.findElement(audia41).click();
	   driver.findElement(audia42).click();
	   driver.findElement(audia43).click();
	   driver.findElement(audia44).click();	 
       driver.findElement(audia45).sendKeys("01.2020");
       driver.findElement(audia46).click();


}
	
}
