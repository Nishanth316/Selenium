import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.wikipedia.org");
    //  driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("Eesti");
      
      Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
      //select.selectByVisibleText("Hrvatski");
     // select.selectByValue("ka");
    //  select.selectByIndex( 3);
    /* List <WebElement> options = select.getOptions();
     System.out.println(options.size());
     for(int i=0 ;i<options.size(); i++){
    	System.out.println( options.get(i).getText());*/
     System.out.println("----------Printing all drop down values"); 
    List<WebElement> options =  driver.findElements(By.tagName("option"));
    System.out.println(options.size());
    for(int i=0 ;i<options.size(); i++){
   	System.out.println( options.get(i).getText());
      
   	System.out.println("----Printing all links");
   	List<WebElement> links =  driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(int X=0 ;X<links.size(); X++){
   	System.out.println(links.get(X).getAttribute("href"));
      
     }
    
    System.out.println("Total Links are="+links.size());
    
    }
      
	}
}


