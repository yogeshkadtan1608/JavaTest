package javaautomation;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{

	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		screen("Loginpage");
		WebElement user = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		Actions act = new Actions(driver);
		act.sendKeys(user, "Facebook Username");
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		Thread.sleep(5000);
		screen("Password");
		driver.close();		
	}

		public static void screen(String filename) throws Exception
		
		{
			TakesScreenshot scrn=(TakesScreenshot)driver;
			File s=scrn.getScreenshotAs(OutputType.FILE);
			File d=new File("C:\\Users\\VinayakPc\\Desktop\\Screenshot\\"+filename+".jpg");
			FileHandler.copy(s,d);
			
		}
	}