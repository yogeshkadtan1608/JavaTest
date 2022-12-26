package javaautomation;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin 

{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.Flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\VinayakPc\\Desktop\\yogesh\\Details.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet s = book.getSheet("Sheet1");
		String user = s.getRow(1).getCell(0).getStringCellValue();		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(user);
		
		String password = s.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath("(//div[@class=\"exehdJ\"])[1]")).getText();
		System.out.println(actual);
		String expected = s.getRow(1).getCell(2).getStringCellValue();
		
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}

}
