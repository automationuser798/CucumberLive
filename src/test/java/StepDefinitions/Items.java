package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*import org.apache.log4j.Logger;*/
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObjects.ItemsPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import PageObjects.ShoppingCartPage;
import Configurations.Config;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Items {
	
	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	/* final static Logger logger = Logger.getLogger(Items.class); */
	int counter = 1;
	MyAccountsPage myaccountpageobj=null;
	ShoppingCartPage shoppingcartpageobj = null;
	ItemsPage itemspageobj = null;
	
	
	@Then("^user enters \"(.*)\" into the Global Item searchbox$")
	public void SearchItem(String ItemText) throws IOException {
		
		try {
			Utility.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			itemspageobj.ItemSearch.sendKeys(ItemText);

			Thread.sleep(1000);
		 
		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}
	
	
	@And("^user selects Printed Chiffon Item from the list$")
	public void SelectItem(String ItemText) throws IOException {
		
		try {
			Thread.sleep(1000);
			itemspageobj.PrintedChiffonDress.click();

			Thread.sleep(1000);
		  
		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}
	
	
	@And("\"(.*)\" is displayed in Details view$")
	public void VerifyPrintedChiffonDress(String ItemName) throws IOException {
		
		try {
			Thread.sleep(1000);
			String ActualItemName= itemspageobj.PrintedChiffonDressonDetailsPage.getText();

			Thread.sleep(1000);
			Assert.assertEquals(ItemName, ActualItemName);			
		  
		}
		catch(Exception ex) {

			Assert.assertTrue(false);
		}
	}
	
	

}