package purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class itemSelection {
	WebDriver Driver;
	By item = By.xpath("/html/body/div[1]/div/section/div/div/div/div[2]/div[1]/span[2]/a/div/div");
public itemSelection(WebDriver Driver)
{
	this.Driver= Driver;
}
public void selectItem()
{
	Driver.findElement(item).click();
}
}
