package eag;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {

	public static void main(String[] args) {
		
		//Invoke Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eag.synechron.com");
		//Login code
		driver.findElement(By.id("UserName")).sendKeys("DilipKumar.Gangam");
		driver.findElement(By.id("Password")).sendKeys("789456123QWERt!");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		//Code for Syne Time
		//Actions s = new Actions(driver);
		driver.findElement(By.cssSelector("li.syneTime")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		//driver.findElement(By.xpath("//*[@role='dialog']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.cssSelector("li.applications.submenu")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Leave Application']")).click();
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='Remarks']"));
		Select s= new Select(staticDropdown);
		s.selectByVisibleText("Earned Leave");
		
		
		
		
		

	}

}
