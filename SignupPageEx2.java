import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPageEx2 
{
	public static  void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("mandani");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("urvi@gmail.com");
		
		Thread.sleep(1000);
		WebElement RadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		RadioButton.click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("2346789906");
		
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("9");
		
		
		Thread.sleep(1000);
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("jan");
		
		Thread.sleep(1000);
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("2005");
		Thread.sleep(1000);
		driver.findElement(By.className("react-datepicker__day--009")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).click();
		
				
	}
}
