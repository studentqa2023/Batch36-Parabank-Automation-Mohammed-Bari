package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath ="//input[@class='input']")
	private WebElement Username;
	
	@FindBy ( xpath ="//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//input[@class='button']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Log Out')]")
	private WebElement logoutbtn;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
}
