import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitwithWebDriverProgram {

static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = DriverConnection.connect();
		driver.get("https://mail.google.com");
	}
	
	@Test
	public void logincheck()
	{
		 driver.findElement(By.id("identifierId")).sendKeys("nirmitmandani99047@gmail.com"); 
		 driver.findElement(By.id("identifierNext")).click(); 
		 driver.findElement(By.name("Passwd")).sendKeys("Urvi12345");
		 driver.findElement(By.xpath("passwordNext")).click();	
	}	
}