package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		String parent=driver.getWindowHandle();
		WebElement newwindow=driver.findElement(By.cssSelector("button#tabButton"));
		newwindow.click();
		Thread.sleep(6000);
		
		Set<String> childwindows=driver.getWindowHandles();
		for(String child:childwindows)
		{
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
			}
		}
		
		WebElement newwindowtext=driver.findElement(By.cssSelector("h1#sampleHeading"));
		System.out.println(newwindowtext.getText());
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		
		
		

	}

}
