package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebElement clickalert=driver.findElement(By.cssSelector("button#alertButton"));
		clickalert.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement clickalert2=driver.findElement(By.cssSelector("button#timerAlertButton"));
		clickalert2.click();
		Thread.sleep(6000);
		alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		Thread.sleep(6000);
		WebElement clickalert3=driver.findElement(By.cssSelector("button#confirmButton"));
		clickalert3.click();
		alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(6000);
		WebElement target= driver.findElement(By.cssSelector("button#promtButton"));
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("arguments[0].scrollIntoView();", target);
		WebElement clickalert4=driver.findElement(By.cssSelector("button#promtButton"));
		clickalert4.click();
		alert=driver.switchTo().alert();
		
		alert.sendKeys("hello world");
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
