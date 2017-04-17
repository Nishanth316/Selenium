package sleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdowns {

	
	
	

	public static void main(String[] args) {
		
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		
		  WebDriver	driver = new FirefoxDriver();
			driver.manage().deleteAllCookies(); 
			driver.manage().window().maximize();
			driver.get("http://www.spicejet.com/");
		    Select s = new Select(	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		    s.selectByIndex(3);
		    s.selectByValue("7");
		    s.selectByVisibleText("9");
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
			driver.findElement(By.cssSelector("#dropdownGroup1 > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();
			driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
			System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).isSelected());
			
		}
		

	}


