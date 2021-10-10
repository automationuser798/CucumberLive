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

	public MyAccountsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;

		
	}

	
	@FindBy(how = How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement dresses_Menu;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
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
	
	
	
	
	
    public void ClickDressesMenu() 
    {
		  
		/*
		 * Actions action = new Actions(Utility.driver);
		 * action.moveToElement(dresses_Menu).click().perform();
		 */
    	dresses_Menu.click();
	  }

	public void ClickSummerDressesManu() 
    {
		summer_Dresses_Menu.click();
		
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