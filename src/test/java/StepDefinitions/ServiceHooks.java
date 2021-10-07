package StepDefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import Configurations.Utility;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;


public class ServiceHooks {
	
	 
	
	@After(order = 0)
	public void QuitBrowser()  {
		  
	   Utility.driver.quit(); 
	   
	  }
	 
		
	
	@After(order = 1)
	public void EndTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				
				final byte[] screenshot = ((TakesScreenshot) Utility.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				
				scenario.embed(((TakesScreenshot) Utility.driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Utility.driver.quit();
	}
	

	
   }