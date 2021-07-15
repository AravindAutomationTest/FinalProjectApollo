package Test_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.healthPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

public class healthblog {
	
	String baseUrl = "https://www.apollo247.com/";
	WebDriver driver;
	healthPOM pom;
	@Before
	public void launch() throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	    pom=new healthPOM(driver);
	    	      
	}
	@Given("User is logged in")
	public void User_is_logged_in()  throws InterruptedException{

		pom.loginIcon();
	    System.out.println("Login screen displayed");
	    pom.enterMobileNumber();
		System.out.println("pom"+pom);
		pom.proceedIcon();
	    Thread.sleep(20000);
	    pom.proceedIcon();
	    Thread.sleep(5000);
	    System.out.println("pom"+pom);
	}


	@Given("User is at home page")
	public void User_is_at_home_page() {
		//driver.findElement(By.xpath("//div[@title='View active appointments']")).click();  
		System.out.println(driver.getTitle());
	}
	@When("user clicks on read the latest articles")
	public void user_clicks_on_read_the_latest_articles() throws InterruptedException  {
		
	    pom.Read_Articles();
	    Thread.sleep(2000);
	     
	}

	@Then("user navigates to page")
	public void user_navigates_to_page() throws InterruptedException{
		driver.findElement(By.xpath("//img[@title='Online Doctor Consultation & Medicines']")).click();
		Thread.sleep(2000);
	     
	}

	@When("user clicks on take a mental health scan")
	public void user_clicks_on_take_a_mental_health_scan() throws InterruptedException{
	    pom.Health_Exam();
	    Thread.sleep(2000);
	}

	@Then("user navigates to Assessment page")
	public void user_navigates_to_Assessment_page() throws InterruptedException{
		System.out.println("Displayed Assessment site");
		Thread.sleep(2000);
	}

	@When("user clicks on Explore health life")
	public void user_clicks_on_Explore_health_life() throws InterruptedException{
	    pom.Explore_healthlife();
	    Thread.sleep(2000);
	}
	@Then("user navigates to partners hdfc website")
	public void user_navigates_to_partners_hdfc_website() throws InterruptedException{
	    System.out.println("Displayed Partner Website");
	    Thread.sleep(2000);
	}

	@When("user clicks on explore apollo kavach program")
	public void user_clicks_on_explore_apollo_kavach_program() throws InterruptedException{
	    pom.Covid_kavach();
	    Thread.sleep(2000);
	}

	@Then("user navigates to apolo kavach registration page.")
	public void user_navigates_to_apolo_kavach_registration_page() throws InterruptedException{
	    Thread.sleep(2000);
	    driver.quit();
	}
	
}
