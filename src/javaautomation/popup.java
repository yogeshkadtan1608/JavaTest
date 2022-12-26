 package javaautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
		
		//handling simple alert
		// SWITCH FOCUS MAIN PAGE TO ALERT BOX
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		
		// click on ok button
		alt.accept();
		Thread.sleep(5000);
		
		// Handling Confirmation alert
		
		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt1.accept();
		Thread.sleep(2000);
		
		// Handling prompt alert
		
		driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
		Alert alt2 = driver.switchTo().alert();
		
		alt2.sendKeys("Hello");
		Thread.sleep(2000);
		alt2.accept();
		
		driver.close();
		

	}

}
