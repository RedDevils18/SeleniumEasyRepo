package TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BusinessFlow.InputForms_BusinessFlow;
import Locators.InputForms_Locators;

public class InputForms_TestCases extends InvokeBrowser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		System.setProperty("webdriver.chrome.driver", "C://Chetan//Selenium//chromedriver_89//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/");
		//Thread.sleep(3000);
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		/*
		driver.findElement(By.id("btn_basic_example")).click();
		driver.findElement(By.xpath("//div[@class='list-group']/a[1]")).click();
		driver.findElement(By.id("user-message")).sendKeys("Cybage");
		driver.findElement(By.xpath("//form[@id='get-input']/button")).click();
		//driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li/ul/li[2]/a")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li/ul/li[4]/a")).click();
		WebElement dayDropDown = driver.findElement(By.id("select-demo"));
		Select dropdown = new Select(dayDropDown);
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("Monday");
		dropdown.selectByVisibleText("Tuesday");
		WebElement multiDropdown = driver.findElement(By.id("multi-select"));
		Select multi = new Select(multiDropdown);
		multi.selectByIndex(3);
		multi.selectByValue("Ohio");
		multi.selectByVisibleText("Texas");
		multi.deselectAll();
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-group date']/input")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[4]/td[contains(text(),'23')]")).click();
		//driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/thead/tr[2]/th[1]")).click();
		//driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[5]/td[contains(text(),'23')]")).click();
		driver.findElement(By.xpath("//div[@id='datepicker']/input[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[4]/td[contains(text(),'23')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='datepicker']/input[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[4]/td[contains(text(),'24')]")).click();
		
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("from")).click();
		Thread.sleep(500);
		WebElement monthdd= driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[@class='ui-datepicker-month']"));
		Select dd = new Select(monthdd);
		dd.selectByVisibleText("Apr");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table//a[contains(text(),'23')]")).click();
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@id='myPager']//a[contains(text(),'2')]")).click();
	*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='task-table-filter']")).sendKeys("bug");
	*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("downloadButton")).click();
		WebDriverWait waitforDownload = new WebDriverWait(driver, 20);
		waitforDownload.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable']/div[3]/div/button[contains(text(),'Close')]")));
		driver.findElement(By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog-buttons ui-draggable']/div[3]/div/button[contains(text(),'Close')]")).click();
		*/
		
		/*
		//driver.findElement(By.xpath("div[@class='text-center']/div/div/div[contains(text(),'100%')]"))
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='text-center']/button[@id='cricle-btn']")).click();
		WebDriverWait waitforDownload = new WebDriverWait(driver, 30);
		waitforDownload.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text-center']/div/div/div[contains(text(),'100%')]")));
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[4]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		Actions slider = new Actions(driver);
		WebElement sld1 = driver.findElement(By.xpath("//div[@id='slider1']/div/input"));
		slider.dragAndDropBy(sld1, 60, 0).perform();
		Thread.sleep(2000);
		slider.dragAndDropBy(sld1, -30, 0).perform();
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("autoclosable-btn-success")).click();
		WebDriverWait waitforDownload = new WebDriverWait(driver, 30);
		waitforDownload.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='alert alert-success alert-autocloseable-success']")));
		driver.findElement(By.id("normal-btn-success")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']/button")).click();
		 */
/*
driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/a")).click();
driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/ul/li[2]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='panel-body']/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='modal-content']/div[4]/a[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[2]//a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='modal-body']/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='modal-content']/div[6]/a[2]")).click();
*/
		/*
		System.out.println("Current window = "+driver.getTitle());
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/ul/li[3]/a")).click();	
		driver.findElement(By.xpath("//div[@class='panel-body']/div[1]/a")).click();
		String seleniumEasy = driver.getWindowHandle();
		Set <String> twitter = driver.getWindowHandles();
		Iterator <String> it = twitter.iterator();
		String twitterWindow= null;
		while (it.hasNext())
		{
			twitterWindow = it.next();
		}
		driver.switchTo().window(twitterWindow);
		driver.manage().window().maximize();
		System.out.println("Current window = "+driver.getTitle());
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/div[1]//input")).sendKeys("Chetan");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/div[2]//input")).sendKeys("Nanda");
		driver.close();
		driver.switchTo().window(seleniumEasy);
		System.out.println("Current window = "+driver.getTitle());
		driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/a")).click();
		 */
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[1]//button")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[2]//button")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/div[2]//button")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.dismiss();
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[6]/ul/li[1]/a")).click();
		List<WebElement> leftList = driver.findElements(By.xpath("//div[@class='dual-list list-left col-md-5']//ul"));
		for(WebElement display:leftList)
		{
			System.out.println(display.getText());
		}
		System.out.println("=============================== Right List ======================");
		List<WebElement> rightList = driver.findElements(By.xpath("//div[@class='dual-list list-right col-md-5']//ul"));
		for(WebElement display:rightList)
		{
			System.out.println(display.getText());
		}
		*/
		/*
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[6]/ul/li[3]/a")).click();
		List<WebElement> leftList = driver.findElements(By.xpath("//div[@class='col-md-6 text-left']//section"));
		for(WebElement display:leftList)
		{
			System.out.println("=====================");
			System.out.println(display.getText());
			System.out.println("=====================");
		}
		driver.findElement(By.id("input-search")).sendKeys("glen");
		for(WebElement display:leftList)
		{
			System.out.println("=====================");
			System.out.println(display.getText());
			System.out.println("=====================");
		}
		*/
		//Mouse Hover
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//ul[@id='treemenu']/li/ul/li[5]/ul/li[3]/a")).click();
		WebElement twitterButton = driver.findElement(By.xpath("//div[@class='panel-body']/div[1]/a"));
		String twitterTitle = twitterButton.getAttribute("title");
		System.out.println(twitterTitle);
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(twitterButton).build().perform();
}
	
	
	@Test(priority=0)
	void inputForms_simpleFormDemo() throws InterruptedException
	{
		InputForms_BusinessFlow.validatesingleiputForm();
	}
	@Test (priority=1)
	void inputForms_checkBoxDemo_Single() throws InterruptedException
	{
		InputForms_BusinessFlow.validateCheckBoxSingle();
	}
	@Test (priority=2)
	void inputForms_checkBoxDemo_Multiple () {
		InputForms_BusinessFlow.validateCheckboxMultiple();
	}	
}