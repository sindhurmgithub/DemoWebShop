package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Constructor
	public HomePage (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	

	@FindBy(xpath="//a[text()='Log out']") private WebElement clickOnLogout;
	//getter
	public WebElement getClickOnLogout() {
		//System.out.println("Successfully logged out from appliction");
		return clickOnLogout;
						
		}	
	//actions
//	public void logout() {
//		clickOnLogout.click();
//	}
}
