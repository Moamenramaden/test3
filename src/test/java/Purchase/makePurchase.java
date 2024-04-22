package Purchase;

import org.testng.annotations.Test;

import purchase.addToCart;
import purchase.itemSelection;
import purchase.noonHome;

import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class makePurchase {
	WebDriver Driver;
	noonHome nH;
	itemSelection iS;
	addToCart aC;
  @Test
  public void purchase() throws InterruptedException, AWTException
  {
	  Driver.manage().window().maximize();
	  Driver.get("https://www.noon.com/egypt-en/");
	  java.lang.Thread.sleep(2000);
	  
	  nH = new noonHome(Driver);
	  
			  nH.searchItem();
			  nH.enterItem("iphone 15 pro max");
			  Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_ENTER);
	          robot.keyRelease(KeyEvent.VK_ENTER);
	          java.lang.Thread.sleep(2000);
	          
	  iS = new itemSelection(Driver);
	  
	          iS.selectItem();
	          java.lang.Thread.sleep(2000);
	  
	  aC = new addToCart(Driver);
	  		  aC.addCart();
	  		  java.lang.Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		Driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod()
  {
	  Driver.close();
	  Driver.quit();
  }

}
