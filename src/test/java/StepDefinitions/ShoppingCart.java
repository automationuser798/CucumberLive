package StepDefinitions;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import PageObjects.ShoppingCartPage;
import Configurations.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ShoppingCart {

	LoginPage loginpageobj = null;
	public static WebDriver driver = null;
	final static Logger logger = Logger.getLogger(ShoppingCart.class);
	MyAccountsPage myaccountpageobj = null;
	ShoppingCartPage shoppingcartpageobj = null;
	
	

	@And("^user clicks on the Printed Summer Dress Item$")
	public void ClickOnSummerDressItem() throws IOException {
		try {

			shoppingcartpageobj.ClickPrintedSummerDress();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}

	}

	@And("^user clicks on the Add to Cart button$")
	public void ClickOnAddToCart() throws IOException {
		try {

			shoppingcartpageobj.ClickAddToCart();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("^A popup message saying \"(.*)\" is displayed to the user$")
	public void VerifyItemAddPopup(String ExpectedPopupMessage) throws IOException {

		try {

			String ActualPopupMessage = Utility.driver.switchTo().alert().getText();
			System.out.println(ActualPopupMessage);

			Assert.assertEquals(ExpectedPopupMessage, ActualPopupMessage);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user click on the cancel button on the popup$")
	public void ClickCancelOnPopup() throws IOException {

		try {

			shoppingcartpageobj.ClickCancel();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user hover on the mini shopping cart menu$")
	public void HoverOnMiniShoppingCart() throws IOException {

		try {

			shoppingcartpageobj.HoverMiniCart();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user removes the Item from the cart$")
	public void RemoveItemFromMiniCart() throws IOException {

		try {

			shoppingcartpageobj.RemoveItem();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on the mini Shopping Cart menu$")
	public void ClickOnMiniCart() throws IOException {

		try {

			shoppingcartpageobj.ClickMiniCart();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@And("^user clicks on the Proceed to Checkout button$")
	public void ClickOnProceedToCheckout() throws IOException {

		try {

			shoppingcartpageobj.ClickProceedToCheckout();

		} catch (Exception ex) {

		}
	}

	@And("^user clicks on the trash icon$")
	public void ClickOnTrashButton() throws IOException {

		try {

			shoppingcartpageobj.ClickTrash();

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

	@Then("\"(.*)\" message is displayed to the user$")
	public void VerifyShoppingCartEmptyMessageMainCart1(String ExpectedMessage) throws IOException {

		try {

			String ActualMessage = shoppingcartpageobj.ShoppingCartEmptyMessage.getText();
			System.out.println(ActualMessage);
			Assert.assertEquals(ExpectedMessage, ActualMessage);

		} catch (Exception ex) {

			Assert.assertTrue(false);
		}
	}

}