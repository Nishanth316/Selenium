import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testSample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());
        /*WebElement element =driver.findElement(By.id("Email"));
        element.sendKeys("ganta.nishanth@gmail.com");
        
        element = driver.findElement(By.id("next"));
        element.click();
        
        Thread.sleep(3000);
        
        element = driver.findElement(By.name("Passwd"));
        element.sendKeys("Nishanth5");
        
        element = driver.findElement(By.xpath(".//*[@id='signIn']"));
        element.click();*/
        driver.findElement(By.id("Email")).sendKeys("ganta.nishanth@gmail.com");
        driver.findElement(By.id("next")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Passwd")).sendKeys("Nishanth5");
        driver.findElement(By.xpath(".//*[@id='signIn']")).click();
       System.out.println(driver.findElement(By.id("errormsg_0_Passwd")).getText());
        
        
        
	}

}
