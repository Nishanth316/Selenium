package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTechniques {
	WebDriver driver;
	private String URL ="http://www.amazon.com";
	
	public void openBrowser() {
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.linkText("Today's Deals")).click();
		
		
		
	}
	

	public static void main(String[] args) {
		LocatorTechniques myobj = new LocatorTechniques();
		myobj.openBrowser();
		

	}

}
