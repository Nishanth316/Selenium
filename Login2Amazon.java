package amazonAutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login2Amazon {

	
		WebDriver driver;
	
	private String URL = "https://www.amazon.com";
	
	public void openFirefoxBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	
	public void openChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	
	
	public void openInternetExploreDriver(){
		System.setProperty("webdriver.ie.driver", "C:\\softwares\\IE.Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	public static void main(String[] args) {
		Login2Amazon L2A = new Login2Amazon();
		//L2A.openFirefoxBrowser();
		L2A.openChromeBrowser();
		//L2A.openInternetExploreDriver();
		
		

	}

}
