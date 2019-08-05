package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	@FindBy(id = "login")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(css = "button[class='btn btn-primary']")
	private WebElement login;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement email() {
		return email;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}
	
	public void login(String email, String password) throws IOException {
		
		email().sendKeys(email);
		password().sendKeys(password);
		login().click();
	}

}
