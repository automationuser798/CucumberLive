package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Configurations.Utility;


import java.util.List;


public class MyAccountsPage {
	
	WebDriver localdriverobject;

	public MyAccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;

		
	}

	
	@FindBy(how = How.XPATH, using = "(//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
	public WebElement dresses_Menu;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='block_top_menu']//a[@title='Summer Dresses'])[2]")
	public WebElement summer_Dresses_Menu;

	@FindBy(how=How.XPATH, using="//input[@id='email']")
	public WebElement email_Address_Text_Box;

	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	public WebElement password_Text_Box;

	@FindBy(how=How.XPATH, using="//button[@id='SubmitLogin']")
	public WebElement signIn_Button;

	@FindBy(how=How.XPATH, using="//span[@class='cat-name']")
	public WebElement summer_Dresses_Landing_Page;

	@FindBy(how = How.XPATH, using = "//select[@id='selectProductSort']")
	public WebElement productSortDropDown;

	@FindBy(how = How.XPATH, using = "//div[@class='right-block']//span[@class='price product-price']")
	public List<WebElement> productPrice;

	@FindBy(how = How.XPATH, using = "//span[text()='Properties']")
	public WebElement labelProperties;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Log me out']")
	public WebElement SignOutLink;
	
	
	
	
	public void ClickDressesManu() {
		
		Actions action = new Actions(Utility.driver);
		action.moveToElement(dresses_Menu).build().perform();
	}
	
    public void ClickSummerDressesManu() 
    {
		this.summer_Dresses_Menu.click();
		
	}
    
    public void SelectSortBy(String sortBy) 
	{
		this.productSortDropDown.sendKeys(sortBy);
	}
	
	public void TabKeys() 
  	{
  		this.productSortDropDown.sendKeys(Keys.TAB);
  	}
	
		

}