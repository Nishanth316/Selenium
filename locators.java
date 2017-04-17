package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {
	WebDriver driver;
	private String URL = "https://www.amazon.com";
	
	public void opeanBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		findSomething();
		
		
	}
	
	public void findSomething(){
		driver.findElement(By.linkText("Today's Deals")).click();
	}

	public static void main(String[] args) {
		locators myObj = new locators();
		myObj.opeanBrowser();

	}

}
