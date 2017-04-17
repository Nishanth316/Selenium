import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.rediff.com");
        driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
	}

}
