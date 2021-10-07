package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.ItemsPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import PageObjects.ShoppingCartPage;
import Configurations.Utility;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;



public class Items {

	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	final static Logger logger = Logger.getLogger(Items.class);
	int counter = 1;
	MyAccountsPage myaccountpageobj=null;
	ShoppingCartPage shoppingcartpageobj = null;
	ItemsPage itemspageobj = null;

	

	@Then("^user enters \"(.*)\" into the Global Item searchbox$")
	public void SearchItem(String ItemText) throws IOException {

		try {

			Utility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			itemspageobj.SearchItem(ItemText);

		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}


	@And("^user selects Printed Chiffon Item from the list$")
	public void SelectItem() throws IOException {

		try {

			itemspageobj.ClickPrintedChiffonDress();


		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}


	@And("\"(.*)\" is displayed in Details view$")
	public void VerifyPrintedChiffonDress(String ItemName) throws IOException {

		try {

			String ActualItemName= itemspageobj.PrintedChiffonDressonDetailsPage.getText();

			Assert.assertEquals(ItemName, ActualItemName);			

		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}



}