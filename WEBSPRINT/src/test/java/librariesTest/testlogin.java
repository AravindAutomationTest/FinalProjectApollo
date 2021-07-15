package librariesTest;

import org.testng.annotations.Test;

import POM.headerPOM;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class testlogin {
	  String baseUrl = "https://apollo247.com";
	  String expectedTitle1 ="Apollo 247 - Online Doctor Consultation & Online Medicines, Apollo Pharmacies Near Me";
	  String expectedTitle2 = "Apollo";
	  String expectedTitle3 ="Online Medical Store, Online Medicine Order, Fastest Delivery - Apollo Pharmacy";
	  String actualTitle1 = null ;
	  String actualTitle2 = null ;
	  String actualTitle3 = null;
	  
	  WebDriver driver;
	  headerPOM pom;
	  
  @Test(priority = 1)
  public void verifyLoginPage() {
	  
	  actualTitle1 =driver.getTitle();
	  Assert.assertEquals(actualTitle1, expectedTitle1);
  }
  @Test(priority = 2)
  public void image_present_or_not() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[4]/div/div/a/img")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 3)
  public void article_text() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//div[text()='Health Articles & Resources']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 4)
  public void article_quotation() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//p[text()='Make better health choices with our curated blogs, videos and expert advice.']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 5)
  public void health_blog() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//h3[text()='Health Blog']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 6)
  public void health_blog_quotation() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//p[text() = 'Explore healthcare content created every day by our experts.']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 6)
  public void quote() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//p[text() =' Always caring about your health, we are here to help you!']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 7)
  public void hi_name() {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//div[@title ='Aravid']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);  
  }
  @Test(priority = 8)
  public void appointments() {
	  
	  //driver.findElement(By.xpath("//a[@title='Appointments']")).click();
	  pom.appointments();
	  actualTitle2 =driver.getTitle();
	  Assert.assertEquals(actualTitle2, expectedTitle2);
	  
  }
  
  @Test(priority=9)
  public void Text_Found_or_Not()
  {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//p[text() ='View appointments of another member?']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);
  
  }
  
  @Test(priority = 10)
  public void meds()
  {
	  //driver.findElement(By.xpath("//a[@title='Medicines']")).click();
	  pom.Medicines();
	  //driver.findElement(By.xpath("//img[contains(@src,'ic_cross_popup')]")).click();
	  pom.crosspopup();
	  actualTitle3 =driver.getTitle();
	  
	  Assert.assertEquals(actualTitle3, expectedTitle3);
  }
  @Test(priority = 11)
  public void labtests()
  {
	  boolean eleActual = true ;
	  
	    boolean eleSelected= driver.findElement(By.xpath("//h3[text()='Place your order via prescription']")).isDisplayed();
	    System.out.println(eleSelected);
	    Assert.assertEquals(eleSelected, eleActual);

  }
  
  @BeforeTest
  public void initialization() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	    pom=new headerPOM(driver);
	    System.out.println("Login screen displayed");
	    
	    pom.loginIcon();
	    System.out.println("Login screen displayed");
	    pom.enterMobileNumber();
		System.out.println("pom"+pom);
		pom.proceedIcon();
	    Thread.sleep(20000);
	    pom.proceedIcon();
	    Thread.sleep(5000);
	    

  }

  @AfterTest
  public void stop() {
	  driver.quit();
  }

}



