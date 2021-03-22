/**
 * 
 */
package qatestframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiten
 *
 *locators for ford
 */
public class fordVechileJourney {
	
	
	WebDriver driver;
	   
	   
	By ford = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/div/form/div[3]/div[2]/div[1]/button[4]");
	
	
	By fordfiesta = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[2]");
	//By fordfiesta1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[3]");
	By fordfiesta2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button");
	By fordfiesta3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	By fordfiesta4 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	By fordfocus1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[3]");
	By fordfocus2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[2]");
	By fordfocus3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[3]");
	By fordfocus4 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By fordfocus5 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div[1]/input");
	By fordfocus6 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	By fordka = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/div[1]/button[5]");
    By fordka1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By fordka2 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button[1]");
	By fordka3 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div[2]/div[2]/button");
	By fordka4 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/div/div[2]/div/div/input");
	By fordka5 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/div/div/form/section/div/div/div/button[2]");
	
	public fordVechileJourney (WebDriver driver) {
		
		this.driver=driver;
		
		
	}

	
public void fordJourney1(){
		
		driver.findElement(ford).click();
		driver.findElement(fordfiesta).click();
		driver.findElement(fordfiesta2).click();
		driver.findElement(fordfiesta3).sendKeys("01.2020");
		driver.findElement(fordfiesta4).click();		
	}


public void fordJourney2(){
	
	driver.findElement(ford).click();
	driver.findElement(fordfocus1).click();
	driver.findElement(fordfocus2).click();
	driver.findElement(fordfocus3).click();
	driver.findElement(fordfocus4).click();
	driver.findElement(fordfocus5).sendKeys("01.2020");
	driver.findElement(fordfocus6).click();
			
}



public void fordJourney3(){
	
	driver.findElement(ford).click();
	driver.findElement(fordka1).click();
	driver.findElement(fordka2).click();
	driver.findElement(fordka3).click();
	driver.findElement(fordka4).sendKeys("01.2020");
	driver.findElement(fordka5).click();		
}


}
