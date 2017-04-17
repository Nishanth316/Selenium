package basicsAuto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelVelocity {
	 WebDriver driver;
	 private String URL = "https://www.travelocity.com/";
	 
	 public void openFirefoxBrowser(){
		 System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
	 }
	 public void flightsearch() throws InterruptedException{
		 driver.findElement(By.id("tab-flight-tab")).click();
	if(	driver.findElement(By.id("flight-type-roundtrip-label")).isEnabled()){
		Thread.sleep(5000);
		driver.findElement(By.name("type-one-way")).click();
	}
	
	 }
	 
	 public void toandfro(){
		 driver.findElement(By.id("flight-origin")).sendKeys("JFK");
		 driver.findElement(By.id("flight-origin")).click();
		 driver.findElement(By.id("flight-destination")).sendKeys("EWR");
		 driver.findElement(By.id("flight-destination")).click();
	 }
	 
	 public void calender(){
		 driver.findElement(By.id("flight-departing")).click();
		 DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
         Date date2 = new Date();

         String today = dateFormat2.format(date2); 

         //find the calendar
         WebElement dateWidget = driver.findElement(By.id("flight-departing-wrapper"));  
         List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

         //comparing the text of cell with today's date and clicking it.
         for (WebElement cell : columns)
         {
            if (cell.getText().equals(today))
            {
               cell.click();
               break;
            }
         }
          
	 }
	 public void launchTravelVelocity(){
		 driver.get(URL);
	 }
	 
	 public void searchbutton(){
		 driver.findElement(By.id("search-button")).click();
	 }
	 
	 public void advancedmethods(){
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("#advanced-options")).click();
		 driver.findElement(By.cssSelector("#advanced-flight-nonstop")).click();
		 driver.findElement(By.cssSelector("#advanced-flight-refundable")).click();
		 Select prefferdairline = new Select(driver.findElement(By.cssSelector("#flight-advanced-preferred-airline")));
		 prefferdairline.selectByValue("CX");
		 Select preferredclass = new Select(driver.findElement(By.id("flight-advanced-preferred-class")));
		 preferredclass.selectByIndex(1);
	 }

	public static void main(String[] args) throws InterruptedException {
		TravelVelocity TV = new TravelVelocity();
		TV.openFirefoxBrowser();
		TV.launchTravelVelocity();
		TV.flightsearch();
		TV.toandfro();
		TV.calender();
		TV.searchbutton();
		
		

	}

}
