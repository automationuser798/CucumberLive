package PageObjects;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {

	WebDriver localdriverobject;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject = driver;

	}


	
	
	@FindBy(how = How.XPATH, using = ".//*[@title='Log in to your customer account']")
	public WebElement SignInLink;

	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	public WebElement Create_Account_Email;

	@FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
	public WebElement Create_Account_button;

	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
	public WebElement title_mr;

	@FindBy(how = How.XPATH, using = "//input[@id='id_gender2']")
	public WebElement tittle_mrs;

	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
	public WebElement cust_first_name;

	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
	public WebElement cust_last_name;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
	public WebElement address_fname;

	@FindBy(how = How.XPATH, using = "//input[@id='lastname']")
	public WebElement address_lname;

	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	public WebElement company;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	public WebElement address1;

	@FindBy(how = How.XPATH, using = "//input[@id='address2']")
	public WebElement address2;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	public WebElement city;

	@FindBy(how = How.XPATH, using = "//select[@id='id_state']")
	public WebElement state;

	@FindBy(how = How.XPATH, using = "//input[@id='postcode']")
	public WebElement post_code;

	@FindBy(how = How.XPATH, using = "//select[@id='id_country']")
	public WebElement country;

	@FindBy(how = How.XPATH, using = ".//select[@id='id_state']")
	public WebElement State_Name;

	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']")
	public WebElement mobile_phone;

	@FindBy(how = How.XPATH, using = "//input[@id='alias']")
	public WebElement alias_address;

	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']")
	public WebElement Register_button;

	@FindBy(how = How.XPATH, using = ".//*[@id='create_account_error']")
	public WebElement invalidEmail_error;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement signin_email;

	@FindBy(how = How.XPATH, using = "//p[@class='submit']//span[1]")
	public WebElement signin_button;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement Ex_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement Ex_Pwd;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Sign in']")
	public WebElement Ex_SignIn_Btn;
	
	

	public void ClickSignInLink() {
		SignInLink.click();
	}

	public void ClickCreateAccountBtn() {
		Create_Account_button.click();
	}

	public void EnterEmailAddress(String Email) {
		this.Create_Account_Email.sendKeys(Email);
	}

	public void ClickTittle() {
		title_mr.click();
	}

	public void EnterFirstName(String FirstName) {
		this.cust_first_name.sendKeys(FirstName);
	}

	public void EnterLastName(String LastName) {
		this.cust_last_name.sendKeys(LastName);
	}

	public void EnterPassword(String Password) {
		this.password.sendKeys(Password);
	}

	public void EnterCompany(String Company) {
		this.company.sendKeys(Company);
	}

	public void EnterAddress(String Address) {
		this.address1.sendKeys(Address);
	}

	public void EnterCity(String City) {
		this.city.sendKeys(City);
	}

	public void SelectState(String State) {

		Select select = new Select(this.state);
		select.selectByVisibleText(State);
		state.sendKeys(Keys.TAB);
	}

	public void EnterZip(String ZipCode) {
		this.post_code.sendKeys(ZipCode);
	}

	public void SelectCountry(String Country) {

		Select select = new Select(this.country);
		select.selectByVisibleText(Country);
		country.sendKeys(Keys.TAB);
	}

	public void EnterMoble(String Mobile) {
		this.mobile_phone.sendKeys(Mobile);
	}

	public void AliasAddress(String AliasAddress) {
		this.alias_address.sendKeys(AliasAddress);
	}

	public void ClickRegisterBtn() {
		Register_button.click();
	}

	public void EnterSignInEmail(String emailaddress) {
		this.signin_email.sendKeys(emailaddress);
	}

	public void EnterExEmail(String email) {
		this.Ex_Email.sendKeys(email);
	}

	public void EnterExPwd(String pwd) {
		this.Ex_Pwd.sendKeys(pwd);
	}
	
	public void ClickExSignIn() {
		Ex_SignIn_Btn.click();
	}
}
