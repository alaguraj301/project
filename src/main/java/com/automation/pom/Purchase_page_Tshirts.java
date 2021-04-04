package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase_page_Tshirts {

	WebDriver driver;
	public Purchase_page_Tshirts(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//a[@class='sf-with-ul'])[4]")
	private WebElement clkdress;
	
	@FindBy(xpath="//a[@class='sf-with-ul']")
	private WebElement clkeshirts;
	

	public WebElement getClkdress() {
		return clkdress;
	}

	public WebElement getClkeshirts() {
		return clkeshirts;
	}
	
	
	
	
}
