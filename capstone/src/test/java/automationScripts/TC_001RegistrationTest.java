package automationScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.ExcelLib;
import pomRepo.RegistrationPage;
@Test
public class TC_001RegistrationTest extends BaseClass{
	
	
		 public RegistrationPage registration;
	    public RegistrationPage radiobutton;
	    public RegistrationPage firstname1;
	    public RegistrationPage lastname1;
	    public RegistrationPage email1;
	    public RegistrationPage password1;
	    public RegistrationPage confirmpassword1;
	
			
			public void camera() {
			
			
			String firstname=ExcelLib.readStringData("Sheet1", 1, 0);
			String lastname=ExcelLib.readStringData("Sheet1", 1, 1);
			String email=ExcelLib.readStringData("Sheet1", 1, 2);
			String password=ExcelLib.readStringData("Sheet1", 1, 3);
			String confirmpassword=ExcelLib.readStringData("Sheet1", 1, 4);
			registration=new RegistrationPage(driver);
			registration.getClickOnRegistration().click();
			
			//radiobutton
			radiobutton=new RegistrationPage(driver);
			radiobutton.getClickOnRadiobutton().click();
			
			firstname1=new RegistrationPage(driver);
			firstname1.firstName(firstname);
			
			lastname1=new RegistrationPage(driver);
			lastname1.lastName(lastname);
			
			email1=new RegistrationPage(driver);
			email1.email(email);
			
			password1=new RegistrationPage(driver);
			password1.password(password);
			
			confirmpassword1=new RegistrationPage(driver);
			confirmpassword1.confirmPassword(confirmpassword);
			
		}
}

	
	