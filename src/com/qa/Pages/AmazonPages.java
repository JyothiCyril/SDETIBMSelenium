package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	WebDriver driver;
	
	// Locator of an element
	// define the action to be performed
	// Create the constructor for this class, increase the visibility of the locators & method to the other classes in this project...

	
//	Syntax:
//		
//		@FindBy(locator="Value")
//		WebElement RefName;
//	
	
// SearchTextBox
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTextBox;
	
	public void setSearchTextBoxInput(String input) {
		SearchTextBox.sendKeys(input);
	}
	
	
	
	@FindBy(id="searchDropdownBox")
	WebElement Category;
	
	
	public void setCategoryInput(String input) {
		Select sel = new Select(Category);
		sel.selectByVisibleText(input);
	}
	
	
	public WebElement getCategoryFirstSelectedItem() {
		Select sel = new Select(Category);
		return sel.getFirstSelectedOption();
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement MaginifierBtn;
	
	public void setMaginifierBtnClick() {
		MaginifierBtn.click();
	}
	
	public boolean getMaginifierBtnEnabled() {
		return MaginifierBtn.isEnabled();
	}
	
	
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> ItemNames;
	
	
	public List<WebElement> getItemNames() {
		return ItemNames;
		
	}
	
	
	public AmazonPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	

}
