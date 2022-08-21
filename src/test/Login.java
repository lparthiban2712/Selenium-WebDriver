package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.simplilearn.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

driver.findElement(By.linkText("Log in")).click();
WebElement email=driver.findElement(By.name("user_login"));
email.sendKeys("jhgjhgj");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("lkjlkjkljklj");
WebElement remember=driver.findElement(By.className("rememberMe"));
remember.click();
//WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
WebElement login=driver.findElement(By.cssSelector("[name=btn_login]"));
login.click();
WebElement error=driver.findElement(By.id("error_box"));

String Actual=error.getText();
String Expected="Please enter a valid email address";
if(Actual.equals(Expected))
{
	System.out.println("TC is passed");
}
else
{
	System.out.println("TC is failed");
}

List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println(links.size());

for(WebElement link:links)
{
	System.out.println(link.getAttribute("href"));
}

//driver.close();
	}

}
