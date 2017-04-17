package basicsAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {
	WebDriver driver;
	 private String URL = "https://www.cheapoair.com/";
	 
	 public void openFirefoxBrowser(){
		 System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
	 }
	 
	 public void launchCheapOair(){
		 driver.get(URL);
	 }

	public static void main(String[] args) {
		

	}

}
