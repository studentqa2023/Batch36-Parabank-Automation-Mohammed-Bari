package com.stepdef;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;
import com.utility.HighLighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	MasterPageFactory mpf;
	@Given("open the browser")
	public void open_the_browser() {
   DriverManager dm = new DriverManager();
  driver =  dm.getChromeDriver(driver);

	}

	@Given("pass the URL {string}")
	public void pass_the_url(String URL) {
    driver.navigate().to(URL);

	}

	@When("enter username {string} in the Username field")
	public void enter_username_in_the_username_field(String username) {

		mpf = new MasterPageFactory(driver);
		HighLighter.addColor(driver,  mpf.getUsername());
        mpf.getUsername().sendKeys(username);
	}

	@When("enter password {string} in the Password field")
	public void enter_password_in_the_password_field(String password) {
		HighLighter.addColor(driver,  mpf.getPassword());
    mpf.getPassword().sendKeys(password);

	}

	@When("click on Login")
	public void click_on_login() {
		HighLighter.addColor(driver,  mpf.getLoginBtn());
   mpf.getLoginBtn().click();

	}

	@Then("validate login is successful")
	public void validate_login_is_successful() {
		
		Assert.assertTrue(mpf.getLogoutbtn().isDisplayed(), "Login Successful");
       // If I want to see printout in my console
		if(mpf.getLogoutbtn().isDisplayed()) {
    	   System.out.println("Log is successful");
       }else {System.out.println("Log is not successful");
	}
}
	@When("click on Log Out")
	public void click_on_log_out() {

		HighLighter.addColor(driver, mpf.getLogoutbtn());
    mpf.getLogoutbtn().click();
	}

	@Then("Validate logout is successful")
	public void validate_logout_is_successful() {
    Assert.assertTrue(mpf.getLoginBtn().isDisplayed(), "logout is succesful");
	if(mpf.getLoginBtn().isDisplayed()) {
		System.out.println("Logout is successfull");
}else {System.out.println("logout is not successful");}
	
	}

		
	}	
	
	
