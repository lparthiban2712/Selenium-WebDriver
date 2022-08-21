package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement upload=driver.findElement(By.cssSelector("input#uploadfile_0"));
		upload.sendKeys("C:\\Selenium\\SampleFileUpload.txt");
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
		

	}

}
