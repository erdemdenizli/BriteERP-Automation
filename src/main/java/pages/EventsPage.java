package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage {
	
	WebDriver driver;

	@FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_content']/div[@class='o_view_manager_content']/div/div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div[1]/div[2]")
	private WebElement event;

	public EventsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement event() {
		return event;
	}

}
