package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pomRepo.ComputerPage;

import pomRepo.HomePage;

//import pomRepo.TC_HomePage_001;
//import pomRepo.TC_InvoiceLookUpImagePage_001;
import pomRepo.LoginPage;
import pomRepo.RegistrationPage;

/***
 * 
 * @author Sindhu
 *
 */

public class BaseClass {
	
	public WebDriver driver;
	public ExcelLib elib=new ExcelLib();
	public WebDriverWait explicitWait;
	public HomePage homePage;
	public LoginPage loginPage;
    public ComputerPage computersTab;
    public ComputerPage desktops;
    public ComputerPage sortby;
    public ComputerPage optionZtoA;
    public ComputerPage display;
    public ComputerPage option12;
    public ComputerPage viewas;
    public ComputerPage listoption;
    public ComputerPage product;
    public ComputerPage addtocart;
    public ComputerPage addtocartnotebook;
    public ComputerPage addtocartaccessories;
    public ComputerPage logout;
    //////////////////////////////////////////

    public ComputerPage notebooks;
    public ComputerPage accessories;
    ////////////////////////////////////////
   
  
   
   
    


	@Parameters("browserName")
	@BeforeClass(alwaysRun=true)
	public void beforeClass(@Optional("chrome") String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		Reporter.log("Browser is launched Successfully",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized Successfully",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait=new WebDriverWait(driver,10);
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() throws InterruptedException {
		//URL
		driver.get(elib.readStringData("Sheet1",0,0));
		String actualPageTitle=ExcelLib.readData("Sheet1", 3, 0);
	    String expectedRegisterPageTitle=ExcelLib.readStringData("Sheet1", 2, 0);

		Assert.assertEquals(driver.getTitle(),expectedRegisterPageTitle,"Login Page is not displayed successfully");
		Reporter.log("Login Page  displayed successfully",true);
		
	loginPage=new LoginPage(driver);
		loginPage.getClickOnLoginLink().click();
		loginPage.loginToApp(elib.readStringData("Sheet1",0,1),elib.readStringData("Sheet1",0,2));
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet1", 1, 1);
	    Reporter.log("Successfully logged in to the application",true);
	    Thread.sleep(2000);
	}
		
	@AfterMethod(alwaysRun=true)
		public void afterMethod() {
//		
//		homePage.getClickOnLogout().click();
//	
		}
	
			
	
		@AfterClass(alwaysRun=true)
		public void afterClass() {
			driver.quit();
			Reporter.log("Successfully closed the browser",true);
	}
				
		
	
}



