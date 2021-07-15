package Test_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginSteps {
	
	String baseUrl = "https://www.apollo247.com/";
	WebDriver driver;

	@Given("Open the website")
	public void open_the_website() {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	    System.out.println("Login screen displayed");
	}
		
	    
	@Given("enter valid mobile number")
	public void enter_valid_mobile_number() {
	driver.findElement(By.id("loginPopup")).click();
	driver.findElement(By.name("mobileNumber")).sendKeys("7095912400");
	    
	}

	@Given("click on Generate OTP")
	public void click_on_Generate_OTP() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
		Thread.sleep(15000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button")).click();
	        
	}
	
	
//	@Then("user should click on Book Appointment with Apollo doctors")
//	public void user_should_click_on_Book_Appointment_with_Apollo_doctors() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[2]/div/div[1]")).click();
//		System.out.println("opend doctors appointment page");

	}