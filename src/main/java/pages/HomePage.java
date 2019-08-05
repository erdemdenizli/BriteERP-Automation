package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	@FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Events')]")
	private WebElement events;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement events() {
		return events;
	}
	
}
