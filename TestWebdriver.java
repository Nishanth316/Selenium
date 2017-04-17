package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestWebdriver {
	static WebDriver oDriver;
	
	public void openBrowser(String sBrowserType,String sUrl) throws InterruptedException{
		if(sBrowserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
			oDriver = new FirefoxDriver();
		}
		else if(sBrowserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
			oDriver = new ChromeDriver();
				
			}
			else if(sBrowserType.equalsIgnoreCase("ie")){
			
				System.setProperty("webdriver.ie.driver", "C:\\softwares\\chromedriver_win32\\iedriver.exe");
				oDriver = new InternetExplorerDriver();
			}
		    if(sUrl.isEmpty()){
		    	sUrl ="about:blank";
		    }
		oDriver.manage().window().maximize();    
		oDriver.get(sUrl);
		String Title = oDriver.getTitle();
		System.out.println(Title);
		oDriver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(5000);
		String currentUrl = oDriver.getCurrentUrl();
		System.out.println(currentUrl);
		//String pageSource =oDriver.getPageSource();
		//System.out.println(pageSource);
		closeBrowser();		
		}
	
	public void closeBrowser(){
		if(oDriver != null){
			//oDriver.close();
			oDriver.quit();
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TestWebdriver driver = new TestWebdriver();
		driver.openBrowser("firefox","http://www.amazon.in");
		
		//driver.closeBrowser();

	}

}
