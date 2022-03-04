package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author Sindhu
 *
 */

public class LoginPage {
	
		 
		//Constructor
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		//Data members or properties
		@FindBy(linkText="Log in") private WebElement clickOnLoginLink;
		
		@FindBy(id="Email") private WebElement emailTextField;
	//	@FindBy(xpath="//input[@autofocus='autofocus']") private WebElement emailTextField;
		
		@FindBy(id="Password") private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
		
		//getter methods
		public WebElement getClickOnLoginLink() {
			return clickOnLoginLink;
		}

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}
		public WebElement getLoginButton() {
			return  loginButton;
		}
		
		//action methods or page action
      public void loginToApp(String username,String password) {	    	
    	  emailTextField.sendKeys(username);    	
    	  passwordTextField.sendKeys(password);	    
    	  loginButton.click();
    	  
    	
      }
  }
	    
	


