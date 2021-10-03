package StepDefinitions;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/*import org.apache.log4j.Logger;*/
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;
import org.junit.Assert;

import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import Configurations.Config;
//import MyStore.config.baseclass;
import Configurations.Utility;
import StepDefinitions.ServiceHooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

public class Login {

	LoginPage loginpageobj = null;
	final static Logger logger = Logger.getLogger(Login.class); 
	int counter = 1;
	MyAccountsPage myaccountpageobj = null;
	public static WebDriver driver = null;
	
	
	@Given("^user opens the \"(.*)\" browser$")
	public void OpenBrowser(String BrowserName) {

		Utility.Geckotest(BrowserName);
		Utility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^user enters the url \"(.*)\"$")
	public void OpenBrowser1(String URL) throws IOException {

		Utility.driver.get(URL);
		Utility.driver.manage().window().maximize();
		
		

	}

	@Given("^user is on the application login page$")
	public void LoginPage() throws IOException {
		try {
			
			loginpageobj = new LoginPage(Utility.driver);
			logger.info("User is on application login page");

		} catch (Exception ex) {
			
			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on Sign in link$")
	public void SignInLink() throws IOException {
		try {
			
			loginpageobj = new LoginPage(Utility.driver);
			loginpageobj.SignInLink.click();


		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}

	@Given("^user clicks on Create an account button$")
	public void clickOnCreateAnAccountButton() throws Exception {
		try {
		
			loginpageobj.Create_Account_button.click();


		} catch (Exception ex) {
			
		}
	}

	@And("^user enters an email address as \"(.*)\"$")
	public void EnterEmail(String Email) throws IOException {
		try {
			
			loginpageobj.Create_Account_Email.sendKeys(Email);


		} catch (Exception e) {

		

			Assert.assertTrue(false);
		}
	}

	@And("^user selects title as Mr.$")
	public void Title() throws IOException {
		try {
		
			loginpageobj.title_mr.click();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Customer FirstName as \"(.*)\"$")
	public void EnterFirstName(String FirstName) throws IOException {
		try {
			
			loginpageobj.cust_first_name.sendKeys(FirstName);

		

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Customer LastName as \"(.*)\"$")
	public void EnterLastName(String LastName) throws IOException {
		try {
			
			loginpageobj.cust_last_name.sendKeys(LastName);
	
			
		} catch (Exception e) {


			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Password as \"(.*)\"$")
	public void EnterPassword(String Password) throws IOException {
		try {
		
			loginpageobj.password.sendKeys(Password);
		
			

		} catch (Exception e) {


			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Company as \"(.*)\"$")
	public void EnterCompany(String Company) throws IOException {
		try {
			
			loginpageobj.company.sendKeys(Company);


		} catch (Exception e) {


			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Address as \"(.*)\"$")
	public void EnterAddress(String Address) throws IOException {
		try {
			
			loginpageobj.address1.sendKeys(Address);
;

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters City as \"(.*)\"$")
	public void Enter_City(String City) throws IOException {
		try {
		
			loginpageobj.city.sendKeys(City);


		} catch (Exception e) {


			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user selects State as \"(.*)\"$")
	public void SelectState(String State) throws InterruptedException, IOException {
		try {
			
			Select _state = new Select(loginpageobj.state);
			_state.selectByVisibleText(State);
			loginpageobj.state.sendKeys(Keys.TAB);

		} catch (Exception ex) {


			Assert.assertTrue(false);
		}
	}

	@And("^user enters ZipCode as \"(.*)\"$")
	public void Enter_ZipCode(String ZipCode) throws IOException {
		try {
			loginpageobj.post_code.sendKeys(ZipCode);


		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user selects Country as \"(.*)\"$")
	public void SelectCountry(String Country) throws InterruptedException, IOException {
		try {
			
			Select _country = new Select(loginpageobj.country);
			_country.selectByVisibleText(Country);
			loginpageobj.country.sendKeys(Keys.TAB);


		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user enters Mobile as \"(.*)\"$")
	public void Enter_Mobile(String Mobile) throws IOException {
		try {
			
			loginpageobj.mobile_phone.sendKeys(Mobile);


		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters AliasAddress as \"(.*)\"$")
	public void Enter_Alias_Address(String AliasAddress) throws IOException {
		try {
			
			loginpageobj.alias_address.sendKeys(AliasAddress);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on Register button$")
	public void Register_button() throws IOException {
		try {
			
			loginpageobj.Register_button.click();


		} catch (Exception e) {


			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@Then("^user lands on the MyAccount page$")
	public void MyAccount() throws IOException {
		try {
		
			myaccountpageobj = new MyAccountsPage(Utility.driver);
;

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^user receives an errormessage saying \"(.*)\"$")
	public void Invalid_Errror(String errormessage) throws IOException {
		try {
			
			String errormsg = loginpageobj.invalidEmail_error.getText();
			Assert.assertEquals(errormessage, errormsg);
			System.out.println(errormsg + " --------------------");

		} catch (Exception ex) {
			


			Assert.assertTrue(false);
		}
	}

	@And("^user enters an \"(.*)\" and \"(.*)\" on already registered section$")
	public void EnterUsrnameandPassword(String emailaddress, String password) throws IOException {
		try {
			

			loginpageobj.signin_email.sendKeys(emailaddress);
			loginpageobj.password.sendKeys(password);

		}

		catch (Exception e) {


			Assert.assertTrue(false);
		}

	}

}