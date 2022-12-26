package javaautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmulwindows {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//input[@value=\"New Tab\"]"));
		int i = 0;
		while(i<10)
		{
			ele.click();
			i++;
			
		}
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> childids = driver.getWindowHandles();
		System.out.println(childids.size());
		
	}

}
