package basicsAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("NYC");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Salisbury-Hotel')]")).click();
		
		WebDriverWait d = new WebDriverWait(driver , 20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-Salisbury-Hotel')]")));
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Salisbury-Hotel')]")).click();
		

	}

}
