package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;




public class Login {

	LoginPage loginpageobj = null;
	final static Logger logger = Logger.getLogger(Login.class);
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

			loginpageobj.ClickSignInLink();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}

	}

	@Given("^user clicks on Create an account button$")
	public void ClickOnCreateAnAccountButton() throws Exception {
		try {

			loginpageobj.ClickCreateAccountBtn();

		} catch (Exception ex) {

		}
	}

	@And("^user enters an email address as \"(.*)\"$")
	public void EnterEmail(String Email) throws IOException {
		try {

			loginpageobj.EnterEmailAddress(Email);

		} catch (Exception e) {

			Assert.assertTrue(false);
		}
	}

	@And("^user selects title as Mr.$")
	public void Title() throws IOException {
		try {

			loginpageobj.ClickTittle();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Customer FirstName as \"(.*)\"$")
	public void EnterFirstName(String FirstName) throws IOException {
		try {

			loginpageobj.EnterFirstName(FirstName);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Customer LastName as \"(.*)\"$")
	public void EnterLastName(String LastName) throws IOException {
		try {

			loginpageobj.EnterLastName(LastName);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Password as \"(.*)\"$")
	public void EnterPassword(String Password) throws IOException {
		try {

			loginpageobj.EnterPassword(Password);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Company as \"(.*)\"$")
	public void EnterCompany(String Company) throws IOException {
		try {

			loginpageobj.EnterCompany(Company);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters Address as \"(.*)\"$")
	public void EnterAddress(String Address) throws IOException {
		try {

			loginpageobj.EnterAddress(Address);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters City as \"(.*)\"$")
	public void EnterCity(String City) throws IOException {
		try {

			loginpageobj.EnterCity(City);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user selects State as \"(.*)\"$")
	public void SelectState(String State) throws InterruptedException, IOException {
		try {

			loginpageobj.SelectState(State);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user enters ZipCode as \"(.*)\"$")
	public void EnterZipCode(String ZipCode) throws IOException {
		try {

			loginpageobj.EnterZip(ZipCode);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user selects Country as \"(.*)\"$")
	public void SelectCountry(String Country) throws InterruptedException, IOException {
		try {

			loginpageobj.SelectCountry(Country);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user enters Mobile as \"(.*)\"$")
	public void EnterMobile(String Mobile) throws IOException {
		try {

			loginpageobj.EnterMoble(Mobile);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user enters AliasAddress as \"(.*)\"$")
	public void EnterAliasAddress(String AliasAddress) throws IOException {
		try {

			loginpageobj.AliasAddress(AliasAddress);

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on Register button$")
	public void Registerbutton() throws IOException {
		try {

			loginpageobj.ClickRegisterBtn();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

	@Then("^user lands on the MyAccount page$")
	public void MyAccount() throws IOException {
		try {

			myaccountpageobj = new MyAccountsPage(Utility.driver);
			

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^user receives an errormessage saying \"(.*)\"$")
	public void InvalidErrror(String errormessage) throws IOException {
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

			loginpageobj.EnterSignInEmail(emailaddress);
			loginpageobj.EnterPassword(password);
		}

		catch (Exception e) {

			Assert.assertTrue(false);
		}

	}

	
	@And("^an existing user enters an email address as \"(.*)\"$")
	public void EnterExistingUsername(String email) throws IOException {
		try {

			loginpageobj.EnterExEmail(email);
			
		}

		catch (Exception e) {

			Assert.assertTrue(false);
		}

	}
	
	@And("^an existing user enters an password as \"(.*)\"$")
	public void EnterExistingPassword(String pwd) throws IOException {
		try {

			loginpageobj.EnterExPwd(pwd);
			
		}

		catch (Exception e) {

			Assert.assertTrue(false);
		}

	}
	
	@And("^existing user clicks on SignIn button$")
	public void ClickExSignInBtn() throws IOException {
		try {

			loginpageobj.ClickExSignIn();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	@And("^user clicks on the signout link$")
	public void ClickSignOutButton() throws IOException {
		try {

			loginpageobj.ClickSignOut();

		} catch (Exception e) {

			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	@Then("^user lands on the login page$")
	public void LoginPageLanding () throws IOException {

		try {
			
		
			loginpageobj = new LoginPage(Utility.driver);
			logger.info("User is on application login page");
				
				
		} catch (Exception ex) {

			System.out.println(ex);
		}
	}

	
}