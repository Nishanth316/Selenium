package wdPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wdTestScript {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\softwares\\geckodriver-v0.12.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.google.com");
    Thread.sleep(3000);
    
    driver.findElement(By.className("gsfi")).clear();
    driver.findElement(By.className("gsfi")).sendKeys("facebook");
    driver.findElement(By.name("btnG")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("yui_3_10_0_1_1483835173050_195")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("email")).sendKeys("nishanth_chiruthaips25@yahoo.com");
    driver.findElement(By.id("pass")).sendKeys("Sindhu316");
    driver.findElement(By.id("u_0_n")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(".//*[@id='u_b_2']/input[1]")).sendKeys("Sai Kumar Patel");
    driver.findElement(By.xpath(".//*[@id='js_3r']/form/button")).click();
	}

}
