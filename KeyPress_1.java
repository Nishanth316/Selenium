import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPress_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	      driver.get("http://amazon.in");
	      driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).sendKeys(Keys.ENTER);
	      driver.findElement(By.xpath("//*[@id='shovlStateHeader']/div[1]/span[1]/div")).sendKeys(Keys.PAGE_DOWN);
	      driver.findElement(By.xpath("//*[@id='shovlStateHeader']/div[1]/span[1]/div")).sendKeys(Keys.PAGE_UP);
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@id='shovlStateHeader']/div[1]/span[1]/div")).sendKeys(Keys.BACK_SPACE);
	      
	}

}
