package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynoDiv_Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "D:\\Qspiders\\Selenium\\selenium_workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		// Launch Chrome browser instance
		WebDriver Driver = new ChromeDriver();
		
		// Open the target website
		Driver.get("https://dynodiv.netlify.app/");
		
		// Maximize the browser window for better visibility
		Driver.manage().window().maximize();
		
		// Set implicit wait time for elements to load
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Fill in the form fields on the web page
		Driver.findElement(By.id("height")).sendKeys("200px");
		Driver.findElement(By.id("width")).sendKeys("200px");
		Driver.findElement(By.id("text")).sendKeys("Hello User!");
		
		// Using XPath locators for border and border-radius fields
		Driver.findElement(By.xpath("//body//form//input[4]")).sendKeys("2px solid white");
		Driver.findElement(By.xpath("//body//form//input[5]")).sendKeys("10px");
		
		Driver.findElement(By.id("padding")).sendKeys("10px");
		Driver.findElement(By.id("color")).sendKeys("white");
		Driver.findElement(By.id("bgcolor")).sendKeys("lightblue");
		
		// Click on the "Submit" button to generate the dynamic div
		Driver.findElement(By.cssSelector("button[type='button']")).click();
		
		// Wait for 5 seconds to view the created div
		Thread.sleep(5000);
		
		// Close the browser session
		Driver.quit();
		
	}
}
