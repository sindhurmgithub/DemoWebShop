package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	//Constructor
			public RegistrationPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//Data members or properties
			@FindBy(linkText="Register") private WebElement clickOnRegistration;
			
			@FindBy(id="gender-female") private WebElement clickOnRadiobutton;
			
			@FindBy(id="FirstName") private WebElement enterIntoFirstName;
			
			@FindBy(id="LastName") private WebElement enterIntoLastName;
			
			@FindBy(id="Email") private WebElement enterIntoEmailTextField;
			
			@FindBy(id="Password") private WebElement enterIntoPasswordTextField;
			
			@FindBy(id="ConfirmPassword") private WebElement  enterIntoConfirmPasswordTextField;
			
			@FindBy(id="register-button") private WebElement  clickOnRegisterButton;
			
			
			//getter methods
			public WebElement getClickOnRegistration() {
				return clickOnRegistration;
			}
			
			public WebElement getClickOnRadiobutton() {
				return clickOnRadiobutton;
			}
			
			public WebElement getEnterIntoFirstName() {
				return enterIntoFirstName;
			}
			
			public WebElement getEnterIntoLastName() {
				return enterIntoLastName;
			}
			
			public WebElement getEnterIntoEmailTextField() {
				return enterIntoEmailTextField;
			}
			
			public WebElement getEnterIntoPasswordTextField() {
				return enterIntoPasswordTextField;
			}
			
			public WebElement getEnterIntoConfirmPasswordTextField() {
				return enterIntoConfirmPasswordTextField;
			}
			
			public WebElement getClickOnRegisterButton() {
				return clickOnRegisterButton;
			}
			
			
			
			//action methods
			 public void firstName(String firstname) {	    	
				 enterIntoFirstName.sendKeys(firstname); 
			 }
			 public void lastName(String lastname) {
				 enterIntoLastName.sendKeys(lastname);	
             }
             public void email(String email) {

				 enterIntoEmailTextField.sendKeys(email);
             }
             public void password(String password) {
             
				 enterIntoPasswordTextField.sendKeys(password);
             }
             public void confirmPassword(String confirmpassword) {
            	 
				 enterIntoConfirmPasswordTextField.sendKeys(confirmpassword);
				 clickOnRegisterButton.click();
		      }
      }


