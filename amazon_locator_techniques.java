package amazonAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon_locator_techniques {
	
	WebDriver driver;
	private String URL = "https://www.amazon.com";
	
	public void logintoAmazon() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(5000);
	}
	
	public void create_an_account_actionsmethod(){
		
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("//*[@id='nav-flyout-ya-newCust']/a"))).click().build().perform();
	}
	
	
	public void create_an_account(){
		driver.findElement(By.id("ap_customer_name")).sendKeys("Nishanth K");
		driver.findElement(By.name("email")).sendKeys("nishanthkumarg5516@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Sindhu316");
		driver.findElement(By.id("ap_password_check")).sendKeys("Sindhu316");
		driver.findElement(By.className("a-button-input")).click();
		
	}
	
	
	public void close_amazon_account(){
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"));
		action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"))).click().build().perform();
		
	}
	
	public void Click_Giftcards(){
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		Select select = new Select(driver.findElement(By.id("sort")));
		select.selectByVisibleText("price-asc-rank");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		amazon_locator_techniques alt = new amazon_locator_techniques();
		alt.logintoAmazon();
		alt.create_an_account_actionsmethod();
		alt.create_an_account();
		alt.Click_Giftcards();
		alt.close_amazon_account();
		
		 

	}

}
