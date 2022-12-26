package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VinayakPc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
	    driver.findElement(By.xpath("//div[text()=\"BOM\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()=\"DEL\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"]")).click();
	    driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
	    Thread.sleep(2000);
	   WebElement adult = driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
	   int i = 1;
	   while(i<6)
	   {
		   adult.click();
		   i++;
	   }
	   
	   WebElement children = driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
	   int j = 1;
	   while(j<3)
	   {
		   children.click();
		   j++;
	   }
	   
	   WebElement infant = driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
	   int k=1;
	   while(k<3)
	   {
		   infant.click();
		   k++;   
	   }
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
	   driver.findElement(By.xpath("//div[text()=\"USD\"]")).click();
	   driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
	
	
	}
	
	
	
	

}
