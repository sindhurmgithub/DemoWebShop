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

public class ComputerPage {
	
	//Constructor
	public ComputerPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//Data members or properties
	@FindBy(partialLinkText="Computers") private WebElement clickOnComputersTab;
	
	@FindBy(xpath="//img[@title='Show products in category Desktops']") private WebElement clickOnDesktops;
	
	@FindBy(id="products-orderby") private WebElement clickOnSortByDropdown;
	
	@FindBy(xpath="//option[text()='Name: Z to A']") private WebElement clickOnZtoAOption;
	
	@FindBy(id="products-pagesize") private WebElement clickOnDisplayDropdown;
	
	@FindBy(xpath="//option[text()='12']") private WebElement clickOn12Option;
	
	@FindBy(id="products-viewmode") private WebElement clickOnViewAsDropdown;
	
	@FindBy(xpath="//option[text()='List']") private WebElement clickOnListOption;
	
	@FindBy(xpath="//a[text()='Build your own cheap computer']/../../..//input[@value='Add to cart']") private WebElement clickOnAddToCart;
	
	@FindBy(xpath="//a[@class='ico-logout']") private WebElement clickOnLogout;
	
    @FindBy(xpath="//img[@title='Show products in category Notebooks']") private WebElement clickOnNotebooks;
    
    @FindBy(xpath="//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png']") private WebElement clickOnNotebookProduct;
    
    @FindBy(xpath="//input[@class='button-1 add-to-cart-button']") private WebElement clickOnAddToCartOfNotebooks;
    
    @FindBy(xpath="//img[@title='Show products in category Accessories']") private WebElement clickOnAccessories;
    
    @FindBy(xpath="//img[@title='Show details for TCP Instructor Led Training']") private WebElement clickOnAccessoriesProduct;
    
    @FindBy(xpath="//input[@class='button-1 add-to-cart-button']") private WebElement clickOnAddToCartOfAccessories;
    
    //getter methods
	public WebElement getClickOnComputersTab() {
		return clickOnComputersTab;
	}
	
	
	public WebElement getClickOnDesktops() {
		return clickOnDesktops;
	}
	
	
	
	public WebElement getClickOnSortByDropdown() {
		return clickOnSortByDropdown;
	}
	
	
	
	public WebElement getClickOnZtoAOption() {
		return clickOnZtoAOption;
	}
	
	
	
	
	public WebElement getClickOnDisplayDropdown() {
		return clickOnDisplayDropdown;
	}
	
  
	
	public WebElement getClickOn12Option() {
		return clickOn12Option;
	}
	
 
	
	public WebElement getClickOnViewAsDropdown() {
		return clickOnViewAsDropdown;
		
		
	
	}
	
	
		
	public WebElement getClickOnListOption() {
		return clickOnListOption;
			
			
		}
			
	
				
	public WebElement getClickOnAddToCart() {
		return clickOnAddToCart;
					
			}			
					
				
    public WebElement getClickOnNotebooks() {
		return clickOnNotebooks;
								
			}
						
							
	public WebElement getClickOnNotebookProduct() {
		return clickOnNotebookProduct;
									
			}
	
								
	public WebElement getClickOnAddToCartOfNotebooks() {
		return clickOnAddToCartOfNotebooks;
										
			}
						
				
									
	public WebElement getClickOnAccessories() {
		return clickOnAccessories;
											
			}	
				
										
	public WebElement getClickOnAccessoriesProduct() {
		return clickOnAccessoriesProduct;
												
			}					
				
											
	public WebElement getClickOnAddToCartOfAccessories() {
		return clickOnAddToCartOfAccessories;
													
			}		
	public WebElement getClickOnLogout() {
		System.out.println("Successfully logged out from application");
		return clickOnLogout;
						
		}	
	
	
			
}
