package Configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility {
	
	public static WebDriver driver=null;
	public static WebDriverWait wait =null;

	public static WebDriver Geckotest(String DriverType)
	{
		if(DriverType.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit\\CucumberLive\\CucumberLive\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(DriverType.equalsIgnoreCase("Edge"))

		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Amit\\CucumberLive\\CucumberLive\\src\\test\\resources\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		else if(DriverType.equalsIgnoreCase("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit\\CucumberLive\\CucumberLive\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
