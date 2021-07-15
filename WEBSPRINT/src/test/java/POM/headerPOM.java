package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerPOM {
	@CacheLookup
	@FindBy(id = "loginPopup") WebElement Login_Icon;
	@FindBy(name = "mobileNumber") WebElement mobile_Input_Field;
	@FindBy(className = "icon-ic_arrow_forward") WebElement proceed_icon;
	@FindBy(className = "//input[@type=\\'tel\\']") WebElement otp_input_field;
	//@FindBy(xpath = "//div[@class='MuiFormHelperText-root jss162 Mui-error MuiFormHelperText-filled']") WebElement Error_message;
	@FindBy(xpath = "//a[@title='Appointments']") WebElement Appointments;
	@FindBy(xpath= "//a[@title='Health Records']") WebElement Healthrecords;
	@FindBy(xpath = "//a[@title='Medicines']") WebElement Medicines;
	@FindBy(xpath = "//a[@title='Tests']")  WebElement Tests;
	@FindBy(xpath = "//a[@title='COVID-19']") WebElement Covid_19;
	@FindBy(xpath = "//img[contains(@src,'ic_cross_popup')]") WebElement CrossPopup;
	
	WebDriver driver;
	
	public headerPOM(WebDriver driver) 
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
	public void appointments()
	{
		Appointments.click();
	}
	public void healthrecords()
	{
		Healthrecords.click();
	}
	public void Medicines()
	{
		Medicines.click();
	}
	public void Tests()
	{
		Tests.click();
	}
	public void Covid19()
	{
		Covid_19.click();
	}
	public void crosspopup()
	{
		CrossPopup.click();
	}
	
}