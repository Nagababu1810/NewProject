package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Browserlunch;

public class TC_003 extends Browserlunch {

	public static void main(String[] args) {
		
		
		setup("firefox");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.close();
		
	}
	
	
	
}
