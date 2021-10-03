package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import PageObjects.AddressBookPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import Configurations.Config;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressBook {
	
	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	/* final static Logger logger = Logger.getLogger(AddressBook.class); */
	int counter = 1;
	AddressBookPage addressbookobj = null;
	
	
	
	@And("^user clicks on View My Customer Account link$")
	public void clickOnMyCustomerAccountLink() throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj = new AddressBookPage(Utility.driver);
			addressbookobj.MyCustomerAccountLink.click();

			
			
		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}
	  
	  
	@And("^user clicks on My Addresses menu$")
	public void clickOnMyAddressMenu() throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj = new AddressBookPage(Utility.driver);
			Thread.sleep(5000);
			addressbookobj.MyAddressesMenu.click();

			
		} catch (Exception ex) {

			
			Assert.assertTrue(false);
		}
	}
	
	
	@And ("^user clicks on Add a new Addresses button$")
	public void clickOnAddNewAddressButton() throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj = new AddressBookPage(Utility.driver);
			
			addressbookobj.AddNewAddressesButton.click();
			
		 
			Thread.sleep(8000);

		}
		catch(Exception ex) {
			
			Assert.assertTrue(false);
		}
	}
	
	
	
	@And ("^And user enters Address as \"(.*)\"$")
	public void EnterFirstAddress(String address) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.FirstAddress.sendKeys(address);

			
		}
		catch(Exception ex) {

			
			Assert.assertTrue(false);
		}
	}

	
	@And ("^And user enters City as \"(.*)\"$")
	public void EnterCity(String city) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.City.sendKeys(city);

		
		}
		catch(Exception ex) {

			
			Assert.assertTrue(false);
		}
	}
	
	
	@And ("^And user selects State as \"(.*)\"$")
	public void EnterState(String state) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.State.sendKeys(state);

			
		}
		catch(Exception ex) {

			
			Assert.assertTrue(false);
		}
	}
	
	
	@And ("^And user enters ZipCode as \"(.*)\"$")
	public void EnterZipCode(String zipcode) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.ZipCode.sendKeys(zipcode);

			
		}
		catch(Exception ex) {

			
			Assert.assertTrue(false);
		}
	}
	
	
	@And ("^user enters Homephone as \"(.*)\"$")
	public void EnterHomephone(String Homephone) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.HomePhone.sendKeys(Homephone);

			
		}
		catch(Exception ex) {

			
			Assert.assertTrue(false);
		}
	}
	
	@And ("^user enters Mobilephone as \"(.*)\"$")
	public void EnterMobilePhone(String MobilePhone) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			addressbookobj.MobilePhone.sendKeys(MobilePhone);

		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}
	
	@And ("^user clicks on the Save button$")
	public void clickOnSaveAddress() throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj.AddressSave.click();

			
		}
		catch(Exception ex) {
;
			
			Assert.assertTrue(false);
		}
	}
	
	
	@Then("^user navigates to the My Addresses page and \"(.*)\" text is displayed to the user$")
	public void MyAddressPageNavigation(String Extectedtext) throws IOException {
		try {
			Thread.sleep(1000);
			addressbookobj=new AddressBookPage(Utility.driver);
			//GeckoConfiguration.wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(addressbookobj.MyAddressesText), "MY ADDRESSES"));
			String ActualText = addressbookobj.MyAddressesText.getText();

			Assert.assertEquals(Extectedtext, ActualText);
			
		}
		catch(Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user filed to navigate to the my adresss page\nException Details:"+ ex.getLocalizedMessage();
		
			
			Assert.assertTrue(false);
		}
	}
	
	
}
