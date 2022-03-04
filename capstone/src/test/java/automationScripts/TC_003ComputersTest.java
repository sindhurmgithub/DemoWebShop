package automationScripts;

import org.testng.annotations.Test;
/***
 * 
 * @author Sindhu
 *
 */

import genericLib.BaseClass;
import pomRepo.ComputerPage;

public class TC_003ComputersTest extends BaseClass{
@Test
	
	public void accessories() {
		computersTab=new ComputerPage(driver);
		computersTab.getClickOnComputersTab().click();
		
		//notebooks
		accessories=new ComputerPage(driver);
		accessories.getClickOnAccessories().click();
		
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
	
	   //click on product
		product=new ComputerPage(driver);
		product.getClickOnAccessoriesProduct().click();
		
		
		//click on add to cart
		addtocartaccessories=new ComputerPage(driver);
		addtocartaccessories.getClickOnAddToCartOfAccessories().click();
		
		
		//logout
		logout=new ComputerPage(driver);
		logout.getClickOnLogout().click();
	}
	


}
