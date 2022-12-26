package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebookcopy {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement user = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	//	WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		Actions act = new Actions(driver);
		act.sendKeys(user, "Yogesh Kadtan").perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(5000);
		driver.close();
		
	
}
	}
