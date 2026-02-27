package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefLogin 
{
    WebDriver driver;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("Login to Github")
	public void login_to_Github() 
	{
		driver.get("https://github.com/login");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Vishalk86");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishalgit8611");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		junit.framework.Assert.assertTrue(false);
	}
}
