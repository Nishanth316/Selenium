package uiAutomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

WebDriver driver;
	
	private String URL = "https://www.aa.com/homePage.do";
	
	public void openFirefoxBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	public void Loginbutton() throws InterruptedException{
		//Before Clicking on login button
		System.out.println(driver.getTitle());
		driver.findElement(By.id("loginLogoutLink")).click();
		Thread.sleep(5000);	}
		//driver.findElement(By.id("utilityHomeLink")).click();	
	
	
	
	public void languageSelector() throws InterruptedException{
		driver.findElement(By.cssSelector(".js-dropdown-trigger")).click();
		WebElement CountySelector = driver.findElement(By.cssSelector("#aa-country-selector"));
		Select country = new Select(CountySelector);
		country.selectByIndex(5);
		Thread.sleep(5000);
		country.selectByValue("en_US");
		Thread.sleep(5000);
		
		WebElement LanguageSelector = driver.findElement(By.cssSelector("#aa-language-selector"));
		Select Language = new Select(LanguageSelector);
		Language.selectByIndex(1);
		Language.selectByValue("url=https://www.aa.com?locale=en_US");
	}
	public void joinaaadvantage() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='login']/small/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='personalInformationForm.firstName']")).sendKeys("Nishanth");
		WebElement title = driver.findElement(By.id("personalInformationForm.title"));
		Select Title = new Select(title);
		Title.selectByVisibleText("MASTER");
		
		driver.findElement(By.id("personalInformationForm.middleName")).sendKeys("K");
		driver.findElement(By.id("personalInformationForm.lastName")).sendKeys("GANTA");
		driver.findElement(By.xpath(".//*[@id='personalInformationForm.preferredFirstName']")).sendKeys("Nishu");
		
		WebElement month = driver.findElement(By.id("personalInformationForm.dateOfBirth.month"));
		Select Month = new Select(month);
		Month.selectByIndex(5);
		
		WebElement date = driver.findElement(By.xpath(".//*[@id='personalInformationForm.dateOfBirth.day']"));
		Select Date = new Select(date);
		Date.selectByValue("25");
		
		WebElement year = driver.findElement(By.xpath(".//*[@id='personalInformationForm.dateOfBirth.year']"));
		Select Year = new Select(year);
		Year.selectByVisibleText("1991");
		
		WebElement gender = driver.findElement(By.xpath(".//*[@id='personalInformationForm.gender']"));
		Select Gender =  new Select(gender);
		Gender.selectByIndex(1);
	}
	
	
	public void login_join_AAadvantage(){
		driver.findElement(By.id("loginForm.loginId")).sendKeys("Nishanth355");
		driver.findElement(By.id("loginForm.lastName")).sendKeys("GANTA");
		driver.findElement(By.id("loginForm.password")).sendKeys("Sindhu316");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/div[2]/input")).click();
	}
	
	public void plan_linkscounter(){
		driver.findElement(By.id("plan-travel-expander")).click();
	    WebElement plan = driver.findElement(By.id("plan"));
	    System.out.println(plan.findElements(By.tagName("a")).size());
	  
	   
	   for(int i=0;i<plan.findElements(By.tagName("a")).size();i++){
		   //System.out.println( plan.findElements(By.tagName("a")).get(i).getText());
		   if(plan.findElements(By.tagName("a")).get(i).getText().contains("Cars")){
			   plan.findElements(By.tagName("a")).get(i).click();
			   break;
		   }
		   
	   }
	
	
	}
	
	public void travelinformation_linkscounter(){
		driver.findElement(By.id("travel-information-expander")).click();
	    WebElement plan = driver.findElement(By.id("plan"));
	    System.out.println(plan.findElements(By.tagName("a")).size());
	  
	   
	   for(int i=0;i<plan.findElements(By.tagName("a")).size();i++){
		   //System.out.println( plan.findElements(By.tagName("a")).get(i).getText());
		   if(plan.findElements(By.tagName("a")).get(i).getText().contains("Planes")){
			   plan.findElements(By.tagName("a")).get(i).click();
			   break;
		   }
		   
	   }
	
	
	}
	
	public void aaAdvantage_linkscounter(){
		driver.findElement(By.id("aadvantage-expander")).click();
	    WebElement plan = driver.findElement(By.id("plan"));
	    System.out.println(plan.findElements(By.tagName("a")).size());
	  
	   
	   for(int i=0;i<plan.findElements(By.tagName("a")).size();i++){
		   //System.out.println( plan.findElements(By.tagName("a")).get(i).getText());
		   if(plan.findElements(By.tagName("a")).get(i).getText().contains("AAdvantage")){
			   plan.findElements(By.tagName("a")).get(i).click();
			   break;
		   }
		   
	   }
	
	
	}
	
	
	public void onewayflightsearch() throws InterruptedException{
		
	       
		driver.findElement(By.xpath(".//*[@id='reservationFlightSearchForm']/div[1]/div[1]/ul/li[2]/label")).click();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("ATL");
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("DFW");
		
		Select noofpassengers = new Select(driver.findElement(By.xpath(".//*[@id='flightSearchForm.adultOrSeniorPassengerCount']")));
		noofpassengers.selectByIndex(3);
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		Thread.sleep(5000);
		
	
	
	}
	
	
	
	public void calender(){
        
        WebElement dateWidgetFrom = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody"));

        
        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));

       
        for (WebElement cell: columns) {
            
            if (cell.getText().equalsIgnoreCase("28")) {
                cell.click();
                break;
            }
        }
        }
	
	
	
	public void searchButton(){
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
	}
        
		
		
	
	
	
	
	
	
	
	public void carrental() throws InterruptedException{
		
		driver.findElement(By.xpath(".//*[@id='plan']/ul[1]/li[3]/a")).click();
		

		Set<String> ids =driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		
		Thread.sleep(10000);

		System.out.println(driver.getTitle());
		driver.findElement(By.id("carHomeSearchForm.pickUpPlace")).sendKeys("DFW");

		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		BasePage BP = new BasePage();
		BP.openFirefoxBrowser();
		//BP.Loginbutton();
		//BP.languageSelector();
		//BP.linkscounter();
		//BP.plan_linkscounter();
		//BP.travelinformation_linkscounter();
		//BP.aaAdvantage_linkscounter();
		//BP.onewayflightsearch();
		//BP.calender();
		//BP.searchButton();
		//BP.joinaaadvantage();
		BP.login_join_AAadvantage();
		
		

	}

}
