package automatedScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoolgeSearchOneTime {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	WebDriver driver =  new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.id("lst-ib")).clear();
	driver.findElement(By.id("lst-ib")).sendKeys("vidya sagar yendluri");
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(3000);
	
	String pageTitle =driver.getTitle();
	System.out.println(pageTitle);
	boolean titleContainsTerm = pageTitle.contains("Google");
	System.out.println(titleContainsTerm);
	  
}
}
