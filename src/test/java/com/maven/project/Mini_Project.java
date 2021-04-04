package com.maven.project;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini_Project {


static String driver="Chromedriver()";

	
	public static void login() throws InterruptedException, IOException 
	{
	WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		////login
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("alagurajdon@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("alagu@123");
		
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

		////mouseover ---move to element
		driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@class='sf-with-ul']"))).build().perform();
	
		Thread.sleep(4000);
		
		
		
	driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
	

	driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();

	///how many frames are here
	int totalframe=driver.findElements(By.tagName("iframe")).size();
	System.out.println(totalframe);
	////switch to frame 
	driver.switchTo().frame(0);
	
	WebElement quanity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
	///clear the default value
	quanity.clear();
	///add to the value
    quanity.sendKeys("5");
	
	WebElement colour = driver.findElement(By.xpath("//select[@id='group_1']"));
	colour.click();
	Select sc=new Select(colour);
	sc.selectByValue("2");
	////take a screenshots in file 1
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType .FILE);

    File destination=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniuWebdeiverManager\\src\\screenshots\\file1\\screen1.png");
    FileUtils.copyFile(source, destination);
	
	driver.findElement(By.name("Submit")).click();
	
	Thread.sleep(4000);
	
	
	
    
	
	WebElement proceedtocheckout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
	proceedtocheckout.click();
	
	WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	proceedtocheckout2.click();

	driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();

	driver.findElement(By.id("cgv")).click();
	
	driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
	
	driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	
	driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
	
	driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
	////take a screenshots file 2
	
	TakesScreenshot ts1=(TakesScreenshot) driver;
	File source1 = ts1.getScreenshotAs(OutputType .FILE);

    File destination1=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniuWebdeiverManager\\src\\screenshots\\file2\\screen2.png");
    FileUtils.copyFile(source1, destination1);
    /////  dynamic webtable
    ////  /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[1]/a
    ///// /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td[1]/a
    /////  /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[3]/td[1]/a
    ////   /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td[1]/a
	////   /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[5]/td[1]/a
    ////   /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[6]/td[1]/a
    ////   /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[7]/td[1]/a
    /////  /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[8]/td[1]/a
    /////  /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[9]/td[1]/a
    ////   /html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[10]/td[1]/a
    
    String beforexpath="/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[";
    String afterxpath="]/td[1]/a";
    for (int i = 1; i <=200; i++) {
    	String name2 =driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
    	System.out.println(name2);
    	
    org.openqa.selenium.Dimension name=	driver.findElement(By.xpath(beforexpath+i+afterxpath)).getSize();
    System.out.println(name);
    	
    //	String name3=((Object) driver.findElement(By.xpath(beforexpath+i+afterxpath))).getAccessibleName();
    	//System.out.println(name3);
    }
		
	}
    
    
    
    
	
	
	
	

/////used webdriver manager 

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().browserVersion("89.0.4389.90").setup();
		
		login();
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
