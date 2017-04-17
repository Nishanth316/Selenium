package basicsAuto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class automateSeleniumMethods {
  WebDriver driver;
 private String URL = "https://www.cheapoair.com/";
 
 public void openFirefoxBrowser(){
	 System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.10.0-win64\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 
 }
 
 public void launchCheapOair(){
	 driver.get(URL);
 }
 
 public void typeofDestination(){
	 WebElement roundTrip = driver.findElement(By.cssSelector("#rtFlight1"));
	 System.out.println(roundTrip.isDisplayed());
	 System.out.println(roundTrip.isEnabled());
	 System.out.println(roundTrip.isSelected());
	 
	 WebElement oneway = driver.findElement(By.cssSelector("#owFlight"));
	 System.out.println(oneway.isDisplayed());
	 System.out.println( oneway.isEnabled());
	 System.out.println(oneway.isSelected());
	 
	 WebElement MutipleCities = driver.findElement(By.xpath(".//*[@id='mcFlight']"));
	 System.out.println(MutipleCities.isDisplayed());
	 System.out.println(MutipleCities.isEnabled());
	 System.out.println(MutipleCities.isSelected());
	 
	 
 }
 
 public void toandfro() throws InterruptedException{
	 driver.findElement(By.id("ember724")).sendKeys("DFW");
	 driver.findElement(By.id("ember724")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("ember735")).sendKeys("EWR");
	 driver.findElement(By.id("ember735")).click();
	 
 }
 /*public void departdate(){
	 driver.findElement(By.xpath(".//*[@id='ember708']/section/form/fieldset[2]/fieldset[2]/div[1]/label")).click();
	 driver.findElement(By.xpath(".//*[@id='calendarCompId']/section/nav/a[2]")).click();
	 
	 Thread.sleep(5000);
	 WebElement dateWidgetForm= driver.findElement(By.xpath("here xpath of calender"));
	 List<WebElement> columns = dateWidgetForm.findElements(By.tagName("td"));

	     for (WebElement cell: columns) {
	       String z=cell.getAttribute("class").toString();
	       if(z.equalsIgnoreCase("day")){
	       if (cell.getText().equals(today)) {
	         cell.click();
	         break;
	       }
	     }}
	     }*/
 
  public void mousehoveractions(){
	  Actions act = new Actions(driver);
	  WebElement more = driver.findElement(By.xpath(".//*[@id='nav-bar']/ul/li[8]"));
	  
	  act.moveToElement(more).build().perform();
	  WebElement Flightdeals = driver.findElement(By.xpath(".//*[@id='nav-bar']/ul/li[8]/ul/li[2]/ul/li[2]"));
	  act.moveToElement(Flightdeals).click().perform();
	  
	  
  }
	
  public void signin(){
	  String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	  String subWindowHandler = null;

	  Set<String> handles = driver.getWindowHandles(); // get all window handles
	  Iterator<String> iterator = handles.iterator();
	  while (iterator.hasNext()){
	      subWindowHandler = iterator.next();
	  }
	  driver.switchTo().window(subWindowHandler); // switch to popup window
	  driver.findElement(By.cssSelector(".signupClose")).click();                                           // perform operations on popup

	  driver.switchTo().window(parentWindowHandler); 
	  // switch back to parent window
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.id("signInLink")).click();
	  driver.findElement(By.id("signin-email-ember578")).sendKeys("nishanthkumarg5516@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='ember625']/button")).click();
	  
	  
  }
	public static void main(String[] args) throws InterruptedException {
		automateSeleniumMethods ASM = new automateSeleniumMethods();
		ASM.openFirefoxBrowser();
		ASM.launchCheapOair();
		Thread.sleep(5000);
		ASM.signin();
		
		
		
		

	}

}
