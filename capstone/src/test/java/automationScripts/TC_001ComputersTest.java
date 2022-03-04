package automationScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.ExcelLib;
import pomRepo.ComputerPage;

/***
 * 
 * @author Sindhu
 *
 */

public class TC_001ComputersTest extends BaseClass {
	@Test
	
	public void desktops() {
		
		computersTab=new ComputerPage(driver);
		computersTab.getClickOnComputersTab().click();
		
		//Desktops
		desktops=new ComputerPage(driver);
		desktops.getClickOnDesktops().click();
		
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
	
	  
		//click on add to cart
		addtocart=new ComputerPage(driver);
		addtocart.getClickOnAddToCart().click();
		
		//logout
		logout=new ComputerPage(driver);
		logout.getClickOnLogout().click();
	}
	

}
