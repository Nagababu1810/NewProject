package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_002 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumResources\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("New Releases")).click();
		
		//driver.findElement(By.xpath("//a[text()='New Releases']")).click();
		
		//driver.findElement(By.xpath("//a[starts-with(text(),'New Re')]")).click();//it is used to dynamic links
		
		//driver.findElement(By.xpath("//a[ends-with(text(),'Releases')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'New Re')]")).click(); //middle of the links findout
		
		
		//driver.findElement(By.partialLinkText("New Rel")).click();
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@name='field-keywords']")).sendKeys("books");
		
		//driver.close();
		
	}
	
	
	
}
