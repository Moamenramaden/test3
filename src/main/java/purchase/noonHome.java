package purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class noonHome {
	WebDriver  Driver;
	By field = By.id("searchBar");
	
 public noonHome(WebDriver Driver)
 {
	 this.Driver=Driver;
 }
 public void searchItem()
 {
	 Driver.findElement(field).clear();
 }
 public void enterItem(String item)
 {
	 Driver.findElement(field).sendKeys(item);
 }
 
}

