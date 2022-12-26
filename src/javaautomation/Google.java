package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//div[text()=\"Electronics\"]"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ele).perform();
	    Thread.sleep(2000);
	    WebElement ele1 = driver.findElement(By.xpath("//a[text()=\"Home Theatres\"]"));
	    act.click(ele1).perform();
	    
	}

}
