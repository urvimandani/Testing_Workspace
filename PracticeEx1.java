import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://careercenter.tops-int.com/dashboard");
		
		driver.findElement(By.name("user_name")).sendKeys("9904771171");
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys("9904771171");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Diploma In Software Testing And Automation")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assignment")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Download File")).click();
		
		
	}

}
