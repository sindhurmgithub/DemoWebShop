package automationScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.ComputerPage;
/***
 * 
 * @author Sindhu
 *
 */

public class TC_002ComputersTest extends BaseClass{
	
@Test
	
	public void notebooks()  {
		computersTab=new ComputerPage(driver);
		computersTab.getClickOnComputersTab().click();
		
		//notebooks
		notebooks=new ComputerPage(driver);
		notebooks.getClickOnNotebooks().click();
		
		//Sort by dropdown
		sortby=new ComputerPage(driver);
		sortby.getClickOnSortByDropdown().click();
		
		//click on one option
		optionZtoA=new ComputerPage(driver);
		optionZtoA.getClickOnZtoAOption().click();
		           
        //click on display dropdown
		display=new ComputerPage(driver);
		display.getClickOnDisplayDropdown().click();
		
		//click on 12 option
		option12=new ComputerPage(driver);
		option12.getClickOn12Option().click();
		
		
		//click on view as dropdown
		viewas=new ComputerPage(driver);
		viewas.getClickOnViewAsDropdown().click();
		
		//click on list option
		listoption=new ComputerPage(driver);
		listoption.getClickOnListOption().click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);"); 
	
	   //click on product
		product=new ComputerPage(driver);
		product.getClickOnNotebookProduct() .click();
		
		//click on add to cart
		addtocartnotebook=new ComputerPage(driver);
    	addtocartnotebook.getClickOnAddToCartOfNotebooks().click();
		
		//logout
		logout=new ComputerPage(driver);
		logout.getClickOnLogout().click();
	}
	

}



