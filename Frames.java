package basicsAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/droppable/");
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("#draggable")).click();
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.cssSelector("#draggable")), driver.findElement(By.id("droppable"))).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[2]/a")).click();
	}

}
