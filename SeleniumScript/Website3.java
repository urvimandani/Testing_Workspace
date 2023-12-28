package com.a5670;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.a1234.Connection;

public class Website3 
{
	public static void main(String[] args) throws InterruptedException 
	{	
        System.setProperty("webdriver.chrome.driver","D:\\newdata\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();	
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Job Titles")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Pay Grades")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Employment Status")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Job Categories")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Work Shifts")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organization ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("General Information")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organization ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organization ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Structure")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Skills")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Education")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Licenses")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Languages")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Memberships")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nationalities ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Corporate Branding ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configuration ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Optional Fields")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Custom Fields")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Data Import")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Reporting Methods")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Termination Reasons")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apply")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Leave")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add Entitlements")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
		driver.findElement(By.linkText("Employee Entitlements")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
		driver.findElement(By.linkText("My Entitlements")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave Entitlements and Usage Report")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.linkText("My Leave Entitlements and Usage Report")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configure")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave Period")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configure")).click();
		driver.findElement(By.linkText("Leave Types")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configure")).click();
		driver.findElement(By.linkText("Work Week")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configure")).click();
		driver.findElement(By.linkText("Holidays")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assign Leave ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Time")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Timesheets")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Timesheets")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Employee Timesheets")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Attendance")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Records")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Attendance")).click();
		driver.findElement(By.linkText("Punch In/Out")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Attendance")).click();
		driver.findElement(By.linkText("Employee Records")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Attendance")).click();
		driver.findElement(By.linkText("Configuration")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Project Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.linkText("Employee Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.linkText("Attendance Summary")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")).click();
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Candidates")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Vacancies")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact Details")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Emergency Contacts")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Dependents")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Immigration")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Salary")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Salary")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tax Exemptions")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Report-to")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Qualifications")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Memberships")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Reviews")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Trackers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Employee Trackers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.linkText("Directory")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Claim")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Configuration")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Events")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Expense Types")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Submit Claim")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Claims")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Employee Claims")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assign Claim")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Buzz")).click();
		Thread.sleep(1000);
		
		}
}
