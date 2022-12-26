package javaautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		List <WebElement> abc = driver.findElements(By.xpath("//input[@id=\"email\"]"));
		if(abc.size()!=0)
		{
			System.out.println("Element is Present");
		}	
		else
		{
			System.out.println("Element is Not Present");
		}
		driver.close();
	}
}
