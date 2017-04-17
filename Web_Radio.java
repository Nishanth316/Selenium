package techniques;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.get("http://toolsqa.com/automation-practice-form");
	      List<WebElement> radio_button = driver.findElements(By.name("sex"));
	      Thread.sleep(3000);
	      int size = radio_button.size();
	      System.out.println("Total no of radio button :"+size);
	      for (int i=0; i< size; i++)
	      {
	          String sValue = radio_button.get(i).getAttribute("value"); // Step 3 - 3.  Select the Radio button (female) by Value ‘Female’ 
	          System.out.println("Radio button Name "+sValue);
	          if (sValue.equalsIgnoreCase("Male"))
	          {
	              radio_button.get(i).click();

	          }
	      }
	     
	}

}
