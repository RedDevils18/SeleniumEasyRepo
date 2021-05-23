package BusinessFlow;

import org.openqa.selenium.By;

import Locators.InputForms_Locators;
import TestCases.InvokeBrowser;
import Utilities.Constants;
import Utilities.Data;

public class InputForms_BusinessFlow extends InvokeBrowser {
public static void validatesingleiputForm() throws InterruptedException {
	System.out.println("inputForms_simpleFormDemo method");
	driver.findElement(By.xpath(InputForms_Locators.inputForms_link)).click();
	driver.findElement(By.xpath(InputForms_Locators.inputForms_simpleForm_link)).click();
	driver.findElement(By.id(InputForms_Locators.inputForms_simpleForm_inputBox)).sendKeys(Data.FirstName);
	Thread.sleep(2000);
	driver.findElement(By.xpath(InputForms_Locators.inputForms_simpleForm_button)).click();	
}

public static void validateCheckBoxSingle() throws InterruptedException {
	System.out.println("inputForms_checkBoxDemo_Single method");
	driver.findElement(By.xpath(InputForms_Locators.inputForms_link)).click();
	driver.findElement(By.xpath(InputForms_Locators.checkbox_link)).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(InputForms_Locators.checkbox_ageSelected)).click();
}

public static void validateCheckboxMultiple() {
	System.out.println("inputForms_checkBoxDemo_Multiple method");
	driver.findElement(By.xpath(InputForms_Locators.checkbox_multiple1)).click();
}
}