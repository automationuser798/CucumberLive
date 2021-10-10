package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage {


	WebDriver localdriverobject;

	public AddressBookPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;

	}

	@FindBy(how = How.XPATH, using = "//a[@title='View my customer account']")
	public WebElement MyCustomerAccountLink;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='My addresses']")
	public WebElement MyAddressesMenu;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Add a new address']")
	public WebElement AddNewAddressesButton;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	public WebElement FirstAddress;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	public WebElement City;

	@FindBy(how = How.XPATH, using = "//select[@id='id_state']")
	public WebElement State;

	@FindBy(how = How.XPATH, using = "//input[@id='postcode']")
	public WebElement ZipCode;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	public WebElement HomePhone;

	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']")
	public WebElement MobilePhone;

	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']")
	public WebElement AddressSave;

	@FindBy(how = How.XPATH, using = "//h1[@class='page-heading']")
	public WebElement MyAddressesText;

	


	public void ClickCustomerAccLink() 
	{
		MyCustomerAccountLink.click();
	}

	public void ClickMyAddressMneu() 
	{
		MyAddressesMenu.click();
	}

	public void ClickAddNewAddBtn() 
	{
		AddNewAddressesButton.click();
	}

	public void EnterFAddress(String address) 

	{
		this.FirstAddress.sendKeys(address);
	}

	public void SelectCityName(String city) 

	{
		this.City.sendKeys(city);
	}

	public void SelectStateName(String state) 

	{
		this.State.sendKeys(state);
	}

	public void EnterZipCode(String zipcode) 

	{
		this.ZipCode.sendKeys(zipcode);
	}

	public void EnterHomePhone(String Homephone) 

	{
		this.HomePhone.sendKeys(Homephone);
	}

	public void EnterMobilePhone(String MobilePhone) 

	{
		this.MobilePhone.sendKeys(MobilePhone);
	}

	public void ClickSaveAddBtn() 
	{
		AddressSave.click();
	}



}
