package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Configurations.Utility;
import StepDefinitions.ServiceHooks;

import java.util.List;


public class MyAccountsPage {
	
	WebDriver localdriverobject;

	public MyAccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;
		System.out.println("INSIDE MyAccountsPage CONSTRUCTOR");
		
	}

	
	@FindBy(how = How.XPATH, using = "(//a[contains(@title,'Dresses')])[5]")
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
	
	
	
	
	                      /* Page Actions*/
	
	
	
	
	public void EnterExEmail(String emailAddress) 
	{
		this.email_Address_Text_Box.sendKeys(emailAddress);
	}
	

	public void EnterExPassword(String password) 
	{
		this.password_Text_Box.sendKeys(password);
	}
	
	
	public void ClickSignInBtn() 
	{
		signIn_Button.click();
	}
	
	
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