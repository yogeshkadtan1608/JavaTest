package javaautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qqqqq {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String a = driver.getTitle();
		System.out.println(a);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.Facebook.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().back();//Google
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().forward();//Facebook
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.close();
	}

}
