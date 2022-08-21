package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
WebElement createaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
createaccount.click();
WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
firstname.sendKeys("kjhjkhjkh");
WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
lastname.sendKeys("iutguigku");
WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
mobile.sendKeys("45654645645");
WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
password.sendKeys("kuhjhj");
WebElement days=driver.findElement(By.name("birthday_day"));
Select day= new Select(days);
day.selectByVisibleText("27");
WebElement months=driver.findElement(By.name("birthday_month"));
Select month= new Select(months);
month.selectByVisibleText("Dec");
WebElement years=driver.findElement(By.name("birthday_year"));
Select year= new Select(years);
year.selectByVisibleText("1989");
List<WebElement>listofdays=day.getOptions();
/*for(WebElement singleday:listofdays)
{
	System.out.println(singleday.getText());
}*/

List<WebElement> Allmonths=driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
/*for(WebElement e:Allmonths)
{
	System.out.println(e.getText());
}*/

System.out.println(month.getFirstSelectedOption().getText());
System.out.println(driver.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']")).getText());

String gender="Female";
WebElement female=driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
WebElement male=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
WebElement other=driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
/*
if(gender.equals("female"))
{
	female.click();
}

else if(gender.equals("male"))
{
	male.click();
}

else
{
	other.click();
}
*/
String xpath="//label[text()='"+gender +"']/following-sibling::input";
WebElement genderoption=driver.findElement(By.xpath(xpath));
genderoption.click();

	}

}
