package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {
	
	WebDriver driver;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")
	WebElement FullNameTextBox;
	
	public void setFullNameTextBoxInput(String input) {
		FullNameTextBox.sendKeys(input);
	}
	
	@FindBy(xpath="//input[contains(@name,'login')]")
	WebElement EmailIDTextBox;
	
	public void setEmailIDTextBox(String input) {
		EmailIDTextBox.sendKeys(input);
	}
	
	
	@FindBy(linkText="Sign in")
	WebElement SignInLink;
	
	public void setSignInLinkClick() {
		SignInLink.click();
	}
	
	
	@FindBy(name="proceed")
	WebElement SignInBtn;
	
	public void setSignInBtnClick() {
		SignInBtn.click();
	}
	
	
	
	@FindBy(linkText="Create Account")
	WebElement CreateAccountLink;
	
	public void setCreateAccountLinkClick() {
		CreateAccountLink.click();
	}
	
	
	@FindBy(linkText="privacy policy")
	WebElement privacypolicyLink;
	
	public void setprivacypolicyLinkClick() {
		privacypolicyLink.click();
	}
	
	@FindBy(linkText="terms and conditions")
	WebElement termsandconditionsLink;
	
	public void settermsandconditionsLinkClick() {
		termsandconditionsLink.click();
	}
	
	
	public RediffPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
