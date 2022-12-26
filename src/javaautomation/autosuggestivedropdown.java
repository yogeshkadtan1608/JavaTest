package javaautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Selenium");
	    Thread.sleep(2000);
	    List<WebElement> ele = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]"));
	    Thread.sleep(2000);
	    String expected="Selenium webdriver";
	    
	    for(WebElement abc:ele)
	    {
	    	String actual=abc.getText();
	    	System.out.println(actual);
	    	if(actual.equalsIgnoreCase(expected))
	    	{
	    		abc.click();
	    		break;  		
	    	}
	    }
	   		Thread.sleep(5000);	   
	   		driver.close();
	}
		
}
	 
	    	


