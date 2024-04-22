package purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addToCart {
	WebDriver Driver;
	By addToCart= By.xpath("//*[@id=\"__next\"]/div/section/div/div[1]/div[2]/div/div[1]/div[1]/div/div[1]/span[2]/div/div[2]/div[2]/div/div[3]");
	public addToCart(WebDriver Driver)
	{
		this.Driver= Driver;
	}
	public void addCart()
	{
		Driver.findElement(addToCart).click();
	}
}
