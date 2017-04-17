package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTech {
	
	WebDriver driver;
	private String URL ="http://www.amazonm.com";
	
	public void PlacingAnOrder() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fossil watches for men");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='result_1']/div/div[3]/div[1]/a/h2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("ganta.nishanth@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Nishanth355");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='address-book-entry-6']/div[2]/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("order_0_ShippingSpeed_sss-us")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='wrapper-new-cc']/div[2]/a")).click();
		driver.findElement(By.id("ccName")).sendKeys("Nishanth Kumar Ganta");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='addCreditCardNumber']")).sendKeys("7854129638541276");
		driver.findElement(By.id("ccAddCard")).click();
		
		
		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		LocatorTech abc1 = new LocatorTech();
		abc1.PlacingAnOrder();
		
		

	}

}
