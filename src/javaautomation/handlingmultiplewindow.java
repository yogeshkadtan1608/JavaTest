package javaautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultiplewindow {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"messageWindowButton\"]")).click();
		
		// step1: to get address of main page
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		// step2: to get address of all child window
		
	    Set<String> childids = driver.getWindowHandles();
		System.out.println(childids.size()); // 4
		
		//step3 : shift focus from main page to child window
		
		for(String s:childids)
		{
			System.out.println(s);
			if(!s.equals(parentid))
			{
				//step3 : shift focus from main page to child window
				
				driver.switchTo().window(s);
				Thread.sleep(5000);
				
				//step4: perform action on child window and close windows
				driver.close();
				
			}
			
		}
		
		//step5 : shift focus from child window to main page
		
		driver.switchTo().window(parentid);
	}

}
