package automatedScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoolgeSearchThreeTimes {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.ie.driver", "C:\\softwares\\IE.Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com");
	WebElement searbox = driver.findElement(By.id("lst-ib"));
	searbox.clear();
	searbox.sendKeys("google");
	
	WebElement searchButton =driver.findElement(By.name("btnG"));
	String searchTerms[] ={"google","selenium","automation"};
	for (int i =0; i< searchTerms.length ; i++){
		searbox.clear();
		searbox.sendKeys(searchTerms[i]);
		searchButton.click();
		Thread.sleep(3000);
		
	}
	
	
	String pageTitle =driver.getTitle();
	System.out.println(pageTitle);
	boolean titleContainsTerm = pageTitle.contains("Google");
	System.out.println(titleContainsTerm);
	driver.quit();
	  
}
}
