package Test_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.headerPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

public class header {
	
	String baseUrl = "https://www.apollo247.com/";
	WebDriver driver;
	headerPOM pom;
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
	    pom=new headerPOM(driver);
	    	      
	}
	@Given("Open the home page")
	public void open_the_home_page() {

		pom.loginIcon();
	    System.out.println("Login screen displayed");
	}

	@Given("user enters valid mobile number")
	public void user_enters_valid_mobile_number() {
//		driver.findElement(By.id("loginPopup")).click();
//		driver.findElement(By.name("mobileNumber")).sendKeys("7095912400");
		pom.enterMobileNumber();
		System.out.println("pom"+pom);
	    
	}

	@Given("user clicks on Generate OTP")
	public void user_clicks_on_Generate_OTP() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[2]/button")).click();
//		Thread.sleep(15000);
//	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div[2]/button")).click();
		pom.proceedIcon();
	    Thread.sleep(20000);
	    pom.proceedIcon();
	    Thread.sleep(5000);
	    System.out.println("pom"+pom);
	   
	}

	@When("user cliks on appointments")
	public void user_cliks_on_appointments() throws InterruptedException{
	//	driver.findElement(By.xpath("//a[@title='Appointments']")).click();
		pom.appointments();
		Thread.sleep(2000);
	    
	}

	@Then("user navigates to book appointments page")
	public void user_navigates_to_book_appointments_page() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div"));
		Thread.sleep(2000);
	}
	@When("user clicks on health")
	public void user_clicks_on_health() throws InterruptedException {
		pom.healthrecords(); 
		Thread.sleep(2000);
	}

	@Then("user navigates to health records")
	public void user_navigates_to_health_records() throws InterruptedException{
		System.out.println("Health Records Displayed");
		Thread.sleep(2000);
	}
	
	@When("user clicks on medicine")
	public void user_clicks_on_medicine() throws InterruptedException{
		pom.Medicines();
		Thread.sleep(2000);
	}

	@Then("user navigates to  medicines and essentials")
	public void user_navigates_to_medicines_and_essentials() throws InterruptedException {
		System.out.println("Medicines Page Displayed");
		driver.findElement(By.xpath("//img[contains(@src,'ic_cross_popup')]")).click();
		Thread.sleep(2000);
	}
	@When("user clicks on labtests")
	public void user_clicks_on_labtests() throws InterruptedException {
		pom.Tests();
		Thread.sleep(2000);
	}

	@Then("user navigates to book labtests")
	public void user_navigates_to_book_labtests() throws InterruptedException {
		System.out.println("Labtests Displayed");
		driver.findElement(By.xpath("//img[contains(@src,'ic_cross_popup')]")).click();
		Thread.sleep(2000);
	}
	@When("user clicks on covid19")
	public void user_clicks_on_covid19()  throws InterruptedException{
		pom.Covid19();
		Thread.sleep(2000);
	}

	@Then("user navigates to covid19 page")
	public void user_navigates_to_covid19_page() throws InterruptedException{
		System.out.println("Covid19 page Displayed");
		Thread.sleep(2000);
		
		//Quit the browser
		driver.quit();
	}

	}


