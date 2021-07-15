package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePOM {
	@CacheLookup
	@FindBy(id = "loginPopup") WebElement Login_Icon;
	@FindBy(name = "mobileNumber") WebElement mobile_Input_Field;
	@FindBy(className = "icon-ic_arrow_forward") WebElement proceed_icon;
	@FindBy(className = "//input[@type=\\'tel\\']") WebElement otp_input_field;
	//@FindBy(xpath = "//div[@class='MuiFormHelperText-root jss162 Mui-error MuiFormHelperText-filled']") WebElement Error_message;
	@FindBy(xpath = "//span[text()='FAQs & Articles']") WebElement FAQs_Articles;
	@FindBy(xpath = "//span[text()='Vaccination Queries']") WebElement Vaccination_queries;
	//@FindBy(xpath = "//span[text()='Chat with us']") WebElement Chat_with_us;
	@FindBy(xpath = "//span[text()='Chat with us']") WebElement Chat_with_us;     ////div[@id='ib-button-messaging']
	@FindBy(xpath = "//span[text()='Cowin Registration']") WebElement Cowin_Registration;
	@FindBy(xpath = "//span[text() = ' Read the Latest Articles']") WebElement Read_Articles;
	@FindBy(xpath = "//a[@href='http://assessments.urlife.co.in/']") WebElement Mental_exam;
	@FindBy(xpath = "//a[@href='/partners/hdfc']") WebElement Xplore_Healthylife;
	@FindBy(xpath = "//a[@href='/covid19/kavach']") WebElement Covid_Kavach;
	
	WebDriver driver;
	
	public homePOM(WebDriver driver) 
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
	public void FAQs_Articles()
	{
		FAQs_Articles.click();
	}
	public void Vaccination_Quires()
	{
		Vaccination_queries.click();
	}
	public void Chat_with_us()
	{
		Chat_with_us.click();
	}
	public void Cowin_registration()
	{
		Cowin_Registration.click();
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