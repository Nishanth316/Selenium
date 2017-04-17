package basicsAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UIActions {
	
	WebDriver driver;
	
	public void openfirefoxbrowser(){
	System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.10.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");
		
	}
	
	public void openChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	}
	
	public void openInternetExplorerDriver(){
		System.setProperty("webdriver.ie.driver", "C:\\softwares\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	

	public static void main(String[] args) {
		
		UIActions UIA = new UIActions();
		UIA.openfirefoxbrowser();
		
		

	}

}
