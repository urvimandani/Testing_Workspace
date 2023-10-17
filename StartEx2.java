
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartEx2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("u@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		Thread.sleep(1000);
		
		
		driver.close();
		
	}

}
