/**
 * 
 */
package qatestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiten
 *
 *Locators for opel
 *
 */
public class opelVehicleJourney {
	
    WebDriver driver;
	
	By opel = By.xpath("/html/body/section/div/div[3]/div/div[2]/div/div/div/form/div[3]/div[2]/div[1]/button[2]");
	
	By oplecorsa = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[2]");
	By oplecorsa1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button");
	By oplecorsa2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	By opelcorsa3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	By opelinsignia = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[4]");
	By opelinsignia1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[2]");
	By opelinsignia2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[3]");
	By opelinsignia3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By opelinsignia4 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");	
	
			
	By opelmeriva = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[5]");
	By opelmeriva1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[3]");
	By opelmeriva2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button");
	By opelmeriva3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	
	public opelVehicleJourney (WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	
	public void opelJourney1(){
		
		driver.findElement(opel).click();
		driver.findElement(oplecorsa).click();
		driver.findElement(oplecorsa1).click();
		driver.findElement(oplecorsa2).sendKeys("01.2020");
		driver.findElement(opelcorsa3).click();
		
				
	}
	
	public void opelJourney2(){
		
		
		driver.findElement(opel).click();
		driver.findElement(opelinsignia).click();
		driver.findElement(opelinsignia1).click();
		driver.findElement(opelinsignia2).click();
		driver.findElement(opelinsignia3).sendKeys("01.2020");
		driver.findElement(opelinsignia4).click();
				
	}
	
	public void opelJourney3(){
		
		driver.findElement(opel).click();
		driver.findElement(opelmeriva).click();
		driver.findElement(opelmeriva1).click();
		driver.findElement(opelmeriva2).sendKeys("01.2020");
		driver.findElement(opelmeriva3).click();
		
				
	}
}
