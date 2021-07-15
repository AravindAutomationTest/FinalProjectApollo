package librariesTest;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class testcase {
	  String baseUrl = "https://apollo247.com";
	  String expectedTitle ="Apollo 247 - Online Doctor Consultation & Online Medicines, Apollo Pharmacies Near Me";
	  String actualTitle = null ;
	  WebDriver driver;
  @Test
  public void verifyLoginPage() {
	  actualTitle =driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeTest
  public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
  }

  @AfterTest
  public void stop() {
	  driver.quit();
  }

}