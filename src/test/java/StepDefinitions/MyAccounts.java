package StepDefinitions;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyAccounts {


	public static WebDriver driver = null; 
	final static Logger logger = Logger.getLogger(MyAccounts.class);
	MyAccountsPage myaccountpageobj=null; 
	
	
	
	
	@Then("^user lands on the My Account page$")
	public void MyAccountpage () throws IOException {

		try {
			
		
			 myaccountpageobj = new MyAccountsPage(Utility.driver);
			 Thread.sleep(5000);
			 logger.info("User is on My Accounts Page");
				
				
		} catch (Exception ex) {

			System.out.println(ex);
		}
	}

	@And("^user clicks on Dresses mega menu$")
	public void ClickOnDressesMegaMenu() throws IOException {

		try {
			
			logger.info("User is on My Accounts Page");
			Thread.sleep(5000);
			 myaccountpageobj = new MyAccountsPage(Utility.driver);
			 myaccountpageobj.ClickDressesMenu();
			System.out.println("User clicks on Dressess menu");

		} catch (Exception ex) {
			ex.printStackTrace();
			Assert.assertTrue(false);
		}
	}
		
	@And("^user clicks on Summer Dresses mega menu$")
	public void ClickOnSummerDressesMegaMenu() throws IOException {
		try {

			Thread.sleep(5000);
			myaccountpageobj.ClickSummerDressesManu();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^Summer Dresses page opens with text as \"([^\"]*)\"$")
	public void VerifySummerDressesPageOpens(String summerDressesExpectedPageText) throws IOException {
		try {

			String summerDressesActualPageText = myaccountpageobj.summer_Dresses_Landing_Page.getText();
			Assert.assertEquals(summerDressesExpectedPageText, summerDressesActualPageText);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user selects Sort by drop down value \"([^\"]*)\"$")
	public void SelectSortByValue(String sortBy) throws Exception {
		try {

			myaccountpageobj.SelectSortBy(sortBy);
			myaccountpageobj.TabKeys();
			org.openqa.selenium.Point coordinates = myaccountpageobj.productSortDropDown.getLocation();
			Actions action = new Actions(Utility.driver);
			action.moveToElement(myaccountpageobj.labelProperties).build().perform();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}

	}

	@Then("^user verifies that the products are sorted based on the selected Sort by value$")
	public void VerifyProductSortBasedOnSelectedSortByValue() throws Exception {
		try {

			// Declaring 2 arrays , 1 for prices with $ sign, so it's a String array i.e.
			// priceList. Another array is declared for storing formatted pricelist i.e.
			// priceListInFloat without $
			ArrayList<String> priceList = new ArrayList<String>();
			ArrayList<Double> priceListInFloat = new ArrayList<Double>();

			int numberOfProducts = myaccountpageobj.productPrice.size();

			for (int i = 0; i < numberOfProducts; i = i + 1) {
				priceList.add(myaccountpageobj.productPrice.get(i).getText());
				String ss = myaccountpageobj.productPrice.get(i).getText();
				Number number = NumberFormat.getCurrencyInstance(Locale.US).parse(ss);
				priceListInFloat.add(i, (Double) number);

			}
			// Copying Array Taken from Webpage to another array
			ArrayList<Double> sortedPriceListInFloat = new ArrayList<Double>(priceListInFloat);

			Collections.sort(sortedPriceListInFloat);
			if (sortedPriceListInFloat.equals(priceListInFloat)) {
				System.out.println("List is sorted");
			} else {
				System.out.println("List is not sorted");
			}

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}

	}

}
