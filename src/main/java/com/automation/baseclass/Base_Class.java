package com.automation.baseclass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	////base class is collections of methods ,,,this used to the simplifed the method creations and calling 
	///this class no need to the main method because this class used to simplfy methods and extends to the project class
	////this is very impotant to the framework
	////
	
	
public static	WebDriver driver;  ////driver is create to the static variables this is used to any place

///create a method in get browser launch

public static WebDriver getbrowser(String type) {  ////parameter passing to the String
 
	////used to the if and elseif coditions statements...true will be execute or launch browser
	
	if (type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if (type.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver=new ChromeDriver();
	
	}
	
	else if (type.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriver.exe");
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	return driver;
	
}
	
public static void clickonelement(WebElement element) {

	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
	
	public static  void inputvalueElement(WebElement element,String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void gerUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close() {

		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void quit() {

		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void isEnabled(WebElement element) {

		try {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static  void isDisplayed(WebElement element) {

		try {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void isSelected(WebElement element) {

		try {
			boolean selected = element.isSelected();
			System.out.println(selected);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void getAttribute(WebElement element, String  value) {

		try {
			String attribute = element.getAttribute(value);
			System.out.println(attribute);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getText(WebElement element ) {

		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getsize(WebElement element) {

		try {
			Dimension size = element.getSize();
			System.out.println(size);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void navigateto(String  value) {

		try {
			driver.navigate().to(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	public static  void navigateback() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void navigateforward() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void navigaterefresh() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void navigatetoUrl(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void sleep(int millisec) throws InterruptedException {

		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static  void implicitWait(int timeout, TimeUnit timeUnit ) {

		try {
			driver.manage().timeouts().implicitlyWait(timeout, timeUnit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void explicitWaitvisibilityOf(int timeout,WebElement element,String value) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void explicitWaitalertIsPresent(int timeout,WebElement element) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.alertIsPresent());
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void explicitWaitelementToBeSelected(int timeout,WebElement element,String value) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeSelected(element));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void explicitWaitelementSelectionStateToBe(int timeout,WebElement element,String value,boolean TorF) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementSelectionStateToBe(element, TorF));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static  void fluentWait(int timeout) {

		try {
			Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofSeconds(timeout)).ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void scrollByPixel(int value) {
		try {
			JavascriptExecutor js	=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,value)","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void scrollByvisibilty(WebElement element) {
		try {
			JavascriptExecutor js	=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void scrolldownBottom() {
		try {
			JavascriptExecutor js	=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static  void gettagName(WebElement element) {
		

		 try {
			String tagName = element.getTagName();
			System.out.println(tagName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	


	public static void frameIndex(int value) {

		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void frameWebElement(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void frameString(String value) {

		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void frameId(String value) {
	
	try {
		driver.switchTo().frame(value);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public static  void framedefaultContent() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*public static void takescreenshot(String locationpath) throws IOException {


		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType .FILE);
		File destination=new File(locationpath);
    	FileUtils.copyFile(source, destination);
		
	}*/
	
	
	
	public static  void getcurrentUrl() {

		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void getPageSource() {
		
		
	try {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public static void gettitle() {

		
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void checkBox(WebElement element1,WebElement element2) {

	
		try {
			if (element1.isSelected()) {
			boolean selected = element1.isSelected();
			System.out.println(selected);
			element1.click();
			}
			else if (element2.isSelected()) {
				boolean selected = element2.isSelected();
				System.out.println(selected);
				element2.click();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static  void radioButton(WebElement element1,WebElement element2) {
		
		try {
			if (element1.isSelected()) {
			boolean status1 = element1.isSelected();
			System.out.println(status1);
			element1.click();
			}
			else if (element2.isSelected()) {
				boolean status2 = element2.isSelected();
				System.out.println(status2);
				element2.click();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void fileUploadPopUp(WebElement element ,String locationvalue) {

		try {
			element.sendKeys(locationvalue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void alertPopUpaccept() {

		try {
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}	
		
		
		public static void alertPopUpDismiss() {
			

			try {
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.dismiss();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
public static void getwindowhandles() {

	try {
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> iterator = handler.iterator();
		String parentwindowid = iterator.next();
		System.out.println("paraent window id:"+parentwindowid);
		String childwindowid = iterator.next();
		System.out.println("child window id:"+childwindowid);
		driver.switchTo().window(childwindowid);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}		

	

public static void getwindowhandle() {

	try {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
