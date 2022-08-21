package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(rows.size());
		System.out.println(columns.size());
		WebElement data=driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[4]/td[1]"));
		//System.out.println(data.getText());
		/*for(WebElement row:rows)
		{
			List<WebElement>rowsdatas=row.findElements(By.xpath("//td"));
			//List<WebElement>rowsdatas=row.findElements(By.tagName("td"));
			
			for(WebElement rowdata:rowsdatas)
			{
				System.out.println(rowdata.getText());
			}
			
		}*/
		/*for (int row=1;row<rows.size();row++)
		{
			for(int col=1;col<=columns.size();col++)
			{
				WebElement cell=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/*["+col+"]"));
				System.out.println(cell.getText());
			}
		}*/
		
		String company="Island Trading";
		WebElement country=driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]"));
		System.out.println(country.getText());
		
		
	}

}
