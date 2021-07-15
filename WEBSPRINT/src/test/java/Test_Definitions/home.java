package Test_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.homePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

public class home {
	
	String baseUrl = "https://www.apollo247.com/";
	WebDriver driver;
	homePOM pom;
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
	    pom=new homePOM(driver);
	    	      
	}
	@Given("user is logged in")
	public void user_is_logged_in()  throws InterruptedException{

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


	@Given("user is at home page")
	public void user_is_at_home_page() {
		
		System.out.println(driver.getTitle());
	     
	}

	@When("user clicks on FAQs and Articles")
	public void user_clicks_on_FAQs_and_Articles() {
		pom.FAQs_Articles(); 
	     
	}

	@Then("FAQs will be displayed")
	public void faqs_will_be_displayed() {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/header/div[1]/a/img")).click();
	     
	}

	@When("user clicks on vaccine quires")
	public void user_clicks_on_vaccine_quires() throws InterruptedException{
		pom.Vaccination_Quires();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[3]/button[1]/span[2]")).click();
		
	}

	@Then("user navigates to quires page")
	public void user_navigates_to_quires_page() {
		System.out.println("User is at quires page");	
	}

	@When("user clicks on chat with us.")
	public void user_clicks_on_chat_with_us() {
//		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	    pom.Chat_with_us(); 
	}

	@Then("user navigates to chat page")
	public void user_navigates_to_chat_page() {
		//System.out.println("User is at CHAT page"); 
	     
	}

	@When("user clicks on cowin registration")
	public void user_clicks_on_cowin_registration() {
		
	     pom.Cowin_registration();
	}

	@Then("user navigates to Cowin page")
	public void user_navigates_to_Cowin_page() {
		
	    System.out.println("CowinRegistration page"); 
	}


	}
