	package variousConcepts;

	import java.util.concurrent.TimeUnit;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

	public class LearnLocators {
		
		WebDriver driver;
	
		@Before
		public void setup() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\peter\\OneDrive\\Desktop\\SELENIUM_May2024\\Session2\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://objectspy.space/");
		    driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	   }
	   
	@Test
	   public void testLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		//File upload
		//as long as the tag is "input use sendKeys Method
		//anything else use"Robot"class
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\peter\\OneDrive\\Desktop\\SELENIUM\\Exercise1.pptx");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	    driver.navigate().back();
	//	driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		
		//CSSS Selector
		driver.findElement(By.cssSelector("input#profession-1")).click();
		driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\\Users\\peter\\OneDrive\\Desktop\\SELENIUM\\Exercise.docx");
		//driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		//driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();
		
		//Xpath
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
		driver.findElement(By.xpath("//input[@name='lastname' and @type='text']")).sendKeys("is fun");
		
		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		driver.findElement(By.xpath("//strong[contains(text(), 'New Page')]")).click();
		
		}
		
	}

	
	
	
	
	

