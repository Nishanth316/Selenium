package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Locatortechniques2 {


		WebDriver driver;
		private String URL ="http://www.amazon.com";
		
		public void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");			 
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(URL);
			Thread.sleep(3000);
			findSomething();
			
			
			
		}
		public void findSomething(){
			driver.findElement(By.linkText("Today's Deals")).click();
		}
		

		public static void main(String[] args) {
			LocatorTechniques myobj = new LocatorTechniques();
			myobj.openBrowser();
			
			

		}

	
	}


