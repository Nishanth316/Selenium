import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Key_Pressevents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	      driver.get("http://gmail.com");
	      driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ganta.nishanth@gmail.com");	
	      driver.findElement(By.xpath(".//*[@id='next']")).sendKeys(Keys.ENTER);
	      Thread.sleep(5000);
	      driver.findElement(By.id("Passwd")).sendKeys("Nishanth5");
	      driver.findElement(By.xpath(".//*[@id='signIn']")).sendKeys(Keys.ENTER);
	      driver.findElement(By.xpath("//*[@id='link-forgot-passwd']")).click();
	      driver.findElement(By.xpath("//*[@id='yDmH0d']/div[1]/div[1]/div/div")).sendKeys(Keys.PAGE_DOWN);
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id='yDmH0d']/div[1]/div[1]/div/div")).sendKeys(Keys.PAGE_UP);
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@id='yDmH0d']/div[1]/div[1]/div/div")).sendKeys(Keys.BACK_SPACE);
	      
	      
	}

}
