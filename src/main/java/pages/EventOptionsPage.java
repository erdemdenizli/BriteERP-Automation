package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventOptionsPage {
	
	WebDriver driver;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
	private WebElement cancelEvent;
	
	@FindBy(xpath = "//button[contains(text(),'Action')]")
	private WebElement action;
	
	@FindBy(xpath = "//div[@class='btn-group o_dropdown open']//li[1]")
	private WebElement delete;
	
	@FindBy(xpath = "//button[@data-value='cancel']")
	private WebElement cancelStatus;
	
	@FindBy(xpath = "//button[@data-value='done']")
	private WebElement done;

	@FindBy(xpath = "//button[@data-value='confirm']")
	private WebElement confirmed;
	
	@FindBy(xpath = "//button[@data-value='draft']")
	private WebElement unconfirmed;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
	private WebElement okay;

	public EventOptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement cancelEvent() {
		return cancelEvent;
	}
	
	public WebElement action() {
		return action;
	}
	
	public WebElement delete() {
		return delete;
	}
	
	public WebElement cancelStatus() {
		return cancelStatus;
	}
	
	public WebElement done() {
		return done;
	}
	
	public WebElement confirmed() {
		return confirmed;
	}
	
	public WebElement unconfirmed() {
		return unconfirmed;
	}
	
	public WebElement okay() {
		return okay;
	}

}
