package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Youtube.com/");
	    Thread.sleep(2000);				
	    driver.findElement(By.name("search_query")).sendKeys("tutoriarls");	    
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),\"Python Tutorial - Python Full Course for Beginners\")]")).click();		
		Thread.sleep(50000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),\"Selenium\")]")).click();	
		Thread.sleep(50000);
		driver.close();
	}

}
