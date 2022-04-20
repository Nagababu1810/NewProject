package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlunch {

	public static WebDriver driver;
	
		
	
	public static void setup(String browser) 
	{
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
		else if(browser.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumResources\\geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
	}
		
	}
}
		
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\SeleniumResources\\MSEdgedriver.exe"); WebDriver driver= new
		 * ChromeDriver(); driver.get("https://www.amazon.in/");
		 * driver.manage().window().maximize();
		 */
	
		
		/*
		 * String title=driver.getTitle(); System.out.println(title); String
		 * url=driver.getCurrentUrl(); System.out.println(url); String
		 * pg=driver.getPageSource(); System.out.println(pg);
		 * 
		 * driver.navigate().to("https\\www.google.com");
		 */
		//driver.close();
		//driver.quit();
		
		
		

	

