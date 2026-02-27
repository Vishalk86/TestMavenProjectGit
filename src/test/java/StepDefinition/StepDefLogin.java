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
	
	@When("Login to Demo")
	public void login_to_Demo() 
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		//driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
	
	@Given("Login to Facebook")
	public void login_to_facebook() 
	{
		this.driver.navigate().to("https://www.facebook.com/");
	}
}
