package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.AddressBookPage;
import PageObjects.LoginPage;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddressBook {

	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	final static Logger logger = Logger.getLogger(AddressBook.class);
	AddressBookPage addressbookobj = null;
	
	

	@And("^user clicks on View My Customer Account link$")
	public void ClickOnMyCustomerAccountLink() throws IOException {
		try {

			Utility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			addressbookobj = new AddressBookPage(Utility.driver);
			addressbookobj.ClickCustomerAccLink();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on My Addresses menu$")
	public void ClickOnMyAddressMenu() throws IOException {
		try {

			addressbookobj = new AddressBookPage(Utility.driver);
			addressbookobj.ClickMyAddressMenu();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on Add a new Addresses button$")
	public void ClickOnAddNewAddressButton() throws IOException {
		try {

			addressbookobj.ClickAddNewAddBtn();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^And user enters Address as \"(.*)\"$")
	public void EnterFirstAddress(String address) throws IOException {
		try {

			addressbookobj.EnterFAddress(address);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^And user enters City as \"(.*)\"$")
	public void EnterCity(String city) throws IOException {
		try {

			addressbookobj.SelectCityName(city);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^And user selects State as \"(.*)\"$")
	public void EnterState(String state) throws IOException {
		try {

			addressbookobj.SelectStateName(state);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^And user enters ZipCode as \"(.*)\"$")
	public void EnterZipCode(String zipcode) throws IOException {
		try {

			addressbookobj.EnterZipCode(zipcode);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user enters Homephone as \"(.*)\"$")
	public void EnterHomephone(String Homephone) throws IOException {
		try {

			addressbookobj.EnterHomePhone(Homephone);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user enters Mobilephone as \"(.*)\"$")
	public void EnterMobilePhone(String MobilePhone) throws IOException {
		try {

			addressbookobj.EnterMobilePhone(MobilePhone);
		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on the Save button$")
	public void ClickOnSaveAddress() throws IOException {
		try {

			addressbookobj.ClickSaveAddBtn();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^user navigates to the My Addresses page and \"(.*)\" text is displayed to the user$")
	public void MyAddressPageNavigation(String Extectedtext) throws IOException {
		try {

		
			String ActualText = addressbookobj.MyAddressesText.getText();

			Assert.assertEquals(Extectedtext, ActualText);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

}
