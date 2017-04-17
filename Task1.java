package co.edurekha.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	WebDriver driver;
	public void invokeBrowser() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		loginToFacebook();
		
		
		
		
	}
    public void loginToFacebook() throws InterruptedException{
    	driver.findElement(By.id("email")).clear();
    	driver.findElement(By.id("email")).sendKeys("nishanth_chiruthaips25@yahoo.com");
    	driver.findElement(By.id("pass")).clear();
    	driver.findElement(By.id("pass")).sendKeys("Sindhu316");
    	driver.findElement(By.id("u_0_n")).click();
    	Thread.sleep(10000);
    	driver.findElement(By.xpath(".//*input[@class ='_1frb'")).clear();
    	driver.findElement(By.xpath(".//*input[@class ='_1frb'")).sendKeys("Sai Kumar Patel");
    	driver.findElement(By.xpath(".//*[@id='js_10a']/form/button")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath(".//*[@id='u_ps_jsonp_5_5_7']/div/div/div/div[1]/div[2]/div/a/div/div")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath(".//*[@id='u_jsonp_6_8']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath(".//*[@id='js_2aw']/div[5]/div/div[1]/div/div/div[2]/div/div/div/div")).sendKeys("Abey howle dis my first automated selenium code to send a message.How is it?");
    	driver.findElement(By.xpath(".//*[@id='js_2aw']/div[5]/div/div[1]/div/div/div[2]/div/div/div/div")).submit();
    	
    }
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
		
		Task1 myTask = new Task1();
		myTask.invokeBrowser();
	}

}
