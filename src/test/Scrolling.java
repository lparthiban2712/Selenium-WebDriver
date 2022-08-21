package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(6000);
		WebElement target= driver.findElement(By.cssSelector("button#promtButton"));
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		//obj.executeScript("arguments[0].scrollIntoView();", target);
		obj.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//obj.executeScript("windowscrollTo(0,-document.body.scrollHeight)");
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		

	}

}
