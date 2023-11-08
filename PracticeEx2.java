import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx2 
{
	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElement(By.xpath("//*[@id=\"homeCarousel\"]/div/div/div/div/a/span[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("first_name")).sendKeys("Urvi");
	    Thread.sleep(1000);
	    driver.findElement(By.name("last_name")).sendKeys("Mandani");
	    Thread.sleep(1000);
	    driver.findElement(By.name("mobile")).sendKeys("6789056654");
	    Thread.sleep(1000);
	    driver.findElement(By.name("college")).sendKeys("M.J.Kundaliya");
	    Thread.sleep(1000);
	    driver.findElement(By.id("referEducation")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("referEducation")).sendKeys("MCA");
	    Thread.sleep(1000);
	    driver.findElement(By.id("referEducation")).sendKeys(Keys.ENTER);
	    
	    
	    
	    
	    
	    
	     
	
	}

}
