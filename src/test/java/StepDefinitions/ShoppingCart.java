package StepDefinitions;

import java.io.IOException;

/*import org.apache.log4j.Logger;*/
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import PageObjects.ShoppingCartPage;
import Configurations.Config;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCart {

	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	/* final static Logger logger = Logger.getLogger(ShoppingCart.class); */
	int counter = 1;
	MyAccountsPage myaccountpageobj = null;
	ShoppingCartPage shoppingcartpageobj = null;

	@And("^user clicks on the Printed Summer Dress Item$")
	public void clickOnSummerDressItem() throws IOException {
		try {
			Thread.sleep(1000);
			Actions action = new Actions(Utility.driver);
			action.moveToElement(shoppingcartpageobj.ItemSelection).build().perform();
			Thread.sleep(1000);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}

	}

	@And("^user clicks on the Add to Cart button$")
	public void clickOnAddToCart() throws IOException {
		try {
			Thread.sleep(1000);
			shoppingcartpageobj.AddToCartButton.click();
			String message = "Step:" + (counter++) + "PASSED- user clicks on Add to Cart buttom";

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^A popup message saying \"(.*)\" is displayed to the user$")
	public void VerifyItemAddPopup(String ExpectedPopupMessage) throws IOException {

		try {
			Thread.sleep(1000);
			String ActualPopupMessage = Utility.driver.switchTo().alert().getText();
			System.out.println(ActualPopupMessage);
			Thread.sleep(1000);
			Assert.assertEquals(ExpectedPopupMessage, ActualPopupMessage);

		} catch (Exception ex) {
			String message = "Step:" + (counter++) + " FAILED- user failed to see the popup\nException Details:"
					+ ex.getLocalizedMessage();
			Assert.assertTrue(false);
		}
	}

	@And("^user click on the cancel button on the popup$")
	public void ClickCancelOnPopup() throws IOException {

		try {
			Thread.sleep(1000);
			shoppingcartpageobj.CancelOnPopup.click();
			String message = "Step:" + (counter++) + "PASSED- user click on the cancel button on the popup";

			Thread.sleep(1000);

		} catch (Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to click on the cancel button on the popup\nException Details:"
					+ ex.getLocalizedMessage();

			Assert.assertTrue(false);
		}
	}

	@And("^user hover on the mini shopping cart menu$")
	public void HoverOnMiniShoppingCart() throws IOException {

		try {
			Thread.sleep(1000);
			Actions action = new Actions(Utility.driver);
			action.moveToElement(shoppingcartpageobj.MiniShoppingCart).build().perform();
			String message = "Step:" + (counter++) + "PASSED- user hover on the mini shopping cart menu";

			Thread.sleep(1000);

		} catch (Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to hover on the mini shopping cart menu\nException Details:"
					+ ex.getLocalizedMessage();

			Assert.assertTrue(false);
		}
	}

	@And("^user removes the Item from the cart$")
	public void RemoveItemFromMiniCart() throws IOException {

		try {
			Thread.sleep(1000);
			shoppingcartpageobj.MiniShoppingCartRemove.click();

			Thread.sleep(1000);

		} catch (Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to remove the Item from the cart\nException Details:"
					+ ex.getLocalizedMessage();

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on the mini Shopping Cart menu$")
	public void ClickOnMiniCart() throws IOException {

		try {
			Thread.sleep(1000);
			shoppingcartpageobj.ItemSelection.click();

			Thread.sleep(1000);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	/*
	 * @Then( "\"(.*)\" message is displayed to the user$") public void
	 * VerifyShoppingCartEmptyMessaget(String ExpectedMessage) throws IOException {
	 * 
	 * try { Thread.sleep(1000); String ActualMessage =
	 * shoppingcartpageobj.ShoppingCartEmptyMessage.getText(); String message =
	 * "Step:"+(counter++)+"PASSED- ShoppingCart empty message displayd to the user"
	 * ; System.out.println(ActualMessage); logger.info(message);
	 * Thread.sleep(1000); Assert.assertEquals(ExpectedMessage, ActualMessage);
	 * HTMLReportGenerator.StepDetails("PASS", "ClickOnMiniCart",
	 * message,TakeScreenShot.TakeScreenShot(Config.getImageFilePath(),
	 * GeckoConfiguration.driver)); } catch(Exception ex) { String message = "Step:"
	 * + (counter++)+
	 * " FAILED- user failed to click on the mini Shopping Cart menu\nException Details:"
	 * + ex.getLocalizedMessage(); logger.info(message);
	 * HTMLReportGenerator.StepDetails("FAIL", "ClickOnMiniCart",
	 * message,TakeScreenShot.TakeScreenShot(Config.getImageFilePath(),
	 * GeckoConfiguration.driver)); Assert.assertTrue(false); } }
	 */

	@And("^user clicks on the Proceed to Checkout button$")
	public void ClickOnProceedToCheckout() throws IOException {

		try {
			Thread.sleep(1000);
			shoppingcartpageobj.ProceedToCheckout.click();
			String message = "Step:" + (counter++) + "PASSED- user clicks on the Proceed to Checkout button";

			Thread.sleep(1000);

		} catch (Exception ex) {
			String message = "Step:" + (counter++)
					+ " FAILED- user failed to click on the Proceed to Checkout button\nException Details:"
					+ ex.getLocalizedMessage();
			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on the trash icon$")
	public void ClickOnTrashButton() throws IOException {

		try {
			Thread.sleep(1000);
			shoppingcartpageobj.DeleteItemButton.click();
			Thread.sleep(1000);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("\"(.*)\" message is displayed to the user$")
	public void VerifyShoppingCartEmptyMessageMainCart1(String ExpectedMessage) throws IOException {

		try {
			Thread.sleep(1000);
			String ActualMessage = shoppingcartpageobj.ShoppingCartEmptyMessage.getText();
			System.out.println(ActualMessage);
			Thread.sleep(1000);
			Assert.assertEquals(ExpectedMessage, ActualMessage);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

}