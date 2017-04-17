package testNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Annotataions {
	WebDriver driver;
	
	@BeforeTest 
	public void launchingGmail(){
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	      driver.get("http://www.amazon.com");
	      
	  		
		
	}
	
	@Test
	public void EnteringInputs() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for men");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().alert().dismiss();
	}
	/*@Test
	public void FindingAnAccount(){
		driver.findElement(By.xpath(".//*[@id='gaia_firstform']/div/a")).click();
		driver.findElement(By.id("identifier")).sendKeys("nishanthkumarg5516@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.name("GivenName")).sendKeys("Nishanth");
		driver.findElement(By.name("FamilyName")).sendKeys("Ganta");
		driver.findElement(By.name(".//*[@id='submit']")).click();
		
		
		
	}*/
	
	@AfterTest
	public void ClosingBrowser(){
		driver.quit();
	}

}
