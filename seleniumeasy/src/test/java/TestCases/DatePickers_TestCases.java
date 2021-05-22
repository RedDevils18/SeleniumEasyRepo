package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Locators.DatePickers_Locators;

public class DatePickers_TestCases extends InvokeBrowser{
@Test
void bootstrapDatePicker() throws InterruptedException {
	System.out.println("bootstrapDatePicker method");
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_link)).click();
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_bootstrap)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_input)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_selectDate)).click();
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_input3)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_selectdate2)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_input4)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(DatePickers_Locators.datepicker_selectdate3)).click();	
}
}