package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task1 {
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setBaseurl(){
		driver.get("https://automationtesting.co.uk/contactForm.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	}
	@AfterTest
	public void EmailAddress() {
	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("aura.galib@selise.ch");
		System.out.println("Please provide your EmailAddress");	

	}
	@Test (priority = 1)
	public void Comments() {
		
		driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("Bla bla");
		System.out.println("Please provide your Comments");	
	}
	@Test (priority = 2)
	public void FirstName() {
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aura");
		System.out.println("Please provide your First Name");	

	}
	
	@Test(priority = 3)
	public void LastName() {
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Galib");
		System.out.println("Please provide your Last Name");	

	}
	
	}

