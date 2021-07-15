package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectModel {
	@CacheLookup
	@FindBy(id = "loginPopup") WebElement Login_Icon;
	@FindBy(name = "mobileNumber") WebElement mobile_Input_Field;
	@FindBy(className = "icon-ic_arrow_forward") WebElement proceed_icon;
	@FindBy(className = "//input[@type=\\'tel\\']") WebElement otp_input_field;
	@FindBy(xpath = "//a[@title='Lab Tests']") WebElement labTestes_link;
	@FindBy(xpath = "//img[contains(@src,'ic_cross_popup')]") WebElement popup_close_icon;
	@FindBy(xpath = "//input[@placeholder=\"Search test and packages\"]") WebElement search_field;
	
	
	
	
	WebDriver driver;


	public pageObjectModel(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginIcon() {
		Login_Icon.click();
	}
	
	public void enterMobileNumber() {
		mobile_Input_Field.sendKeys("7095912400");
	}
	
	public void proceedIcon() {
		proceed_icon.click();
	}
	
	public void otpField() {
		otp_input_field.click();
	}
	
//	public void LabTestsLink() {
//		labTestes_link.click();
//	}
	

}