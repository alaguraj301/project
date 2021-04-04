package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement submit;
	
	public Login_Page(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	

}
