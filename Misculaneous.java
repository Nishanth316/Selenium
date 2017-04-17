package basicsAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misculaneous {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.espncricinfo.com/ci/engine/match/1091907.html");
	WebElement table = driver.findElement(By.className("score-table"));
	List<WebElement> noofrows =table.findElements(By.tagName("tr"));
	System.out.println("no of row are" +noofrows.size());
	int i =0;
	
	for(WebElement eachrow:noofrows){
		
		List<WebElement>eachcolumn =eachrow.findElements(By.tagName("td"));
		i++;
		System.out.println("no of cloumn in"+ i +"th row are" + eachcolumn.size());
		for(WebElement text:eachcolumn){
			System.out.println(text.getText());
			
		}
	}
	}

}
