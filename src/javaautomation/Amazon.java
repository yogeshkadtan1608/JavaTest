package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]")).click();    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),\"Most Gifted\")]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),\"Laptops & Accessories\")]")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
