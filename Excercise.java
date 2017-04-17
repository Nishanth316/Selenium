package basicsAuto;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement cell = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(cell.findElements(By.tagName("a")).size());
		String Beforeclicking = null;
		String Afterclicking;
		
		for(int i=0 ; i<cell.findElements(By.tagName("a")).size(); i++){
			//System.out.println(cell.findElements(By.tagName("a")).get(i).getText());
			
			if(cell.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking =driver.getTitle();
				cell.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
			Afterclicking =driver.getTitle();
			if(Beforeclicking!=Afterclicking)
			{
				System.out.println("PASS");
			}
			else{
				System.out.println("FAIL");
			
			
		}
		
		
	}

	}
}

