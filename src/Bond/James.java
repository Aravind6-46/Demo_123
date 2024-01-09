package Bond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class James {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/my-account/");
		
		driver.manage().window().maximize();

		driver.navigate().refresh();
				
		WebElement username =driver.findElement(By.xpath("//input[@id=\"username\"]"));
		
		username.sendKeys("t.aravind646@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		password.sendKeys("Aravind@123");
		
		WebElement sign = driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		
		sign.click();
		
		String actualUrl="https://practice.automationtesting.in/my-account/";
		
		String expectedUrl= driver.getCurrentUrl();
	}

}
