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

	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	final static Logger logger = Logger.getLogger(MyAccounts.class); 
	int counter = 1;
	MyAccountsPage myaccountpageobj=null;
	


	@And ("^an existing user enters an email address as \"([^\"]*)\"$") 
	public void existingUserEmailAddress(String emailAddress) throws IOException{

		try {

			Utility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			myaccountpageobj=new MyAccountsPage(Utility.driver);
			myaccountpageobj.EnterExEmail(emailAddress);


		} catch(Exception ex) {

		}

	}


	@And ("^an existing user enters an password \"([^\"]*)\"$") 
	public void  existingUserPassword(String password) throws IOException { 

		try {

			myaccountpageobj=new  MyAccountsPage(Utility.driver);
			myaccountpageobj.EnterExPassword(password);


		} catch(Exception ex) {

			Assert.assertTrue(false); 
		}
	}



	@And ("^user clicks on SignIn button$") 

	public void clickOnSignInButton()  throws IOException {

		try 

		{ 
			myaccountpageobj=new MyAccountsPage(Utility.driver);
			myaccountpageobj.ClickSignInBtn();

		} catch(Exception ex) {

			Assert.assertTrue(false); } }


	@And ("^user clicks on Dresses mega menu$")
	public void clickOnDressesMegaMenu() throws IOException {

		try {


			myaccountpageobj.ClickDressesManu();

		}
		catch(Exception ex) {


			Assert.assertTrue(false);
		}
	}

	@And ("^user clicks on Summer Dresses mega menu$")
	public void clickOnSummerDressesMegaMenu() throws IOException {
		try {


			myaccountpageobj.ClickSummerDressesManu();

		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}


	@Then("^Summer Dresses page opens with text as \"([^\"]*)\"$")
	public void verifySummerDressesPageOpens(String summerDressesExpectedPageText) throws IOException {
		try {

			String summerDressesActualPageText = myaccountpageobj.summer_Dresses_Landing_Page.getText();
			Assert.assertEquals(summerDressesExpectedPageText, summerDressesActualPageText);



		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user selects Sort by drop down value \"([^\"]*)\"$")
	public void selectSortByValue(String sortBy) throws Exception {
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
	public void verifyProductSortBasedOnSelectedSortByValue() throws Exception {
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

		}
		catch (Exception ex) {

			Assert.assertTrue(false);
		}

	}

}
