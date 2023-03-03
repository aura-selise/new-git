package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task {
	ChromeDriver driver = new ChromeDriver();
	
	@Test
	public void setBaseurl(){
		driver.get("https://automationtesting.co.uk/contactForm.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	}
	
	
	@Test (priority = 3)
	public void FirstName() {
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aura");
		System.out.println("Please provide your First Name");	

	}
	
	@Test(priority = 4)
	public void LastName() {
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Galib");
		System.out.println("Please provide your Last Name");	

	}
	@Test(priority = 1)
	public void EmailAddress() {
	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("aura.galib@selise.ch");
		System.out.println("Please provide your EmailAddress");	

	}
	@Test(priority = 2)
	public void Comments() {
		
		driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("No comments");
		System.out.println("Please provide your Comments");	

	}
}
