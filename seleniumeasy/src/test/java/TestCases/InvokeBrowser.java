package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Utilities.Constants;
import Utilities.Data;

public class InvokeBrowser {
	public static WebDriver driver;
	@Parameters({"url"})
	@BeforeSuite
	void invokeBrowser(String url) throws IOException
	{
		System.out.println("Before Suite -> Invoke Browser");
		System.setProperty("webdriver.chrome.driver", Constants.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		Data.acessFile();
	}

	@AfterSuite
	void tearDown() {
		System.out.println("tearDown - Closing down the browser");
		driver.quit();
	}
}
