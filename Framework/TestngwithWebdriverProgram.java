import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngwithWebdriverProgram {

static WebDriver driver;
	
	@BeforeClass
	public void login() 
	{
		WebDriver driver = DriverConnection.connect();
		driver.get("https://www.facebook.com/");
	}
	
		@Test
		public void check() throws InterruptedException
		{
		driver.findElement(By.id("email")).sendKeys("u@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("56789");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();	
	}
		@AfterClass
		public void close()
		{
			driver.close();
		}
}