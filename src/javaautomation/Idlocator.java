package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("yogesh");
		
		Thread.sleep(5000);
		
		WebElement ele1 = driver.findElement(By.id("pass"));
		ele1.sendKeys("Password");
		
		Thread.sleep(5000);
		
		WebElement ele2 = driver.findElement(By.name("login"));
		ele2.click();
		
		
		
	}
}
