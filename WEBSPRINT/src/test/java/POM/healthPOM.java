package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class healthPOM {
	@CacheLookup
	@FindBy(id = "loginPopup") WebElement Login_Icon;
	@FindBy(name = "mobileNumber") WebElement mobile_Input_Field;
	@FindBy(className = "icon-ic_arrow_forward") WebElement proceed_icon;
	@FindBy(className = "//input[@type=\\'tel\\']") WebElement otp_input_field;
	
	@FindBy(xpath = "//span[text() = ' Read the Latest Articles']") WebElement Read_Articles;
	@FindBy(xpath = "//a[@href='http://assessments.urlife.co.in/']") WebElement Mental_exam;
	@FindBy(xpath = "//a[@href='/partners/hdfc']") WebElement Xplore_Healthylife;
	@FindBy(xpath = "//a[@href='/covid19/kavach']") WebElement Covid_Kavach;
	
	WebDriver driver;
	
	public healthPOM(WebDriver driver) 
	{
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	public void loginIcon()
	{
		Login_Icon.click();
	}
	
	public void enterMobileNumber() 
	{
		mobile_Input_Field.sendKeys("7095912400");
	}
	
	public void proceedIcon() 
	{
		proceed_icon.click();
	}
	
	public void otpField()
	{
		otp_input_field.click();
	}
	
	public void  Read_Articles()
	{
		Read_Articles.click();
	}
	public void Health_Exam()
	{
		Mental_exam.click();
	}
	public void Explore_healthlife() 
	{
		Xplore_Healthylife.click();		
	}
	public void Covid_kavach()
	{
		Covid_Kavach.click();
	}
	
	
}