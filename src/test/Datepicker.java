package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(6000);
		//WebElement target= driver.findElement(By.cssSelector("button#promtButton"));
		//JavascriptExecutor obj=(JavascriptExecutor)driver;
		//obj.executeScript("arguments[0].scrollIntoView();", target);
		WebElement picker=driver.findElement(By.id("dob"));
		picker.click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select monthpicker=new Select (month);
		monthpicker.selectByVisibleText("Feb");
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yearpicker=new Select (year);
		yearpicker.selectByVisibleText("2021");
		WebElement date=driver.findElement(By.xpath("//a[@data-date='11']"));
		//Select datepicker=new Select (date);
		//datepicker.selectByVisibleText("11");
		date.click();
	}

}
