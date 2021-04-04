package com.java.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.automation.baseclass.Base_Class;
import com.automation.pom.Home_page;
import com.automation.pom.Login_Page;
import com.automation.pom.Purchase_page_Tshirts;

public class Automation_Practice extends Base_Class {

	public static WebDriver driver;
	public static void main(String[] args) {
		
	driver=getbrowser("chrome");
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	////homepage
	Home_page home=new Home_page(driver);
	clickonelement(home.getSignin_btn());	
    ////loginpage
    Login_Page login=new Login_Page(driver);
    inputvalueElement(login.getEmail(), "alagurajdon@gmail.com");
	inputvalueElement(login.getPass(),"alagu@123");
	clickonelement(login.getSubmit());
    
	Purchase_page_Tshirts move=new Purchase_page_Tshirts(driver);
	//driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]")).click();
	move.getClkdress();
	Actions action=new Actions(driver);
	
	action.moveToElement(move.getClkeshirts()).build().perform();

    
    
    
    
	
	}
}
