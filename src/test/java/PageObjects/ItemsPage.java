package PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ItemsPage {


	WebDriver localdriverobject;

	public ItemsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.localdriverobject=driver;


	}


	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")
	public WebElement ItemSearch;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/ul[1]/li[4]")
	public WebElement PrintedChiffonDress;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/h1[1]")
	public WebElement PrintedChiffonDressonDetailsPage;





	public void SearchItem(String ItemText) 

	{
		this.ItemSearch.sendKeys(ItemText);
	}


	public void ClickPrintedChiffonDress() 
	{
		PrintedChiffonDress.click();
	}



}