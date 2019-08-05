package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pages.EventOptionsPage;
import pages.EventsPage;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;
import org.testng.Assert;

import base.Base;

@RunWith(Cucumber.class)
public class StepDefinitions extends Base {
	
	@Given("^user is on Events page$")
	public void user_is_on_Events_page() throws Throwable {
				
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), prop.getProperty("events_page_title"));
		
		log.info("Events Page is open");

	}

	@When("^user selects a created and confirmed event$")
	public void user_selects_a_created_and_confirmed_event() throws Throwable {
		
		EventsPage page1 = new EventsPage(driver);
		page1.event().click();
		
		log.info("A confirmed event is selected");

	}
	
	@Then("^user clicks on cancel button from the top of the page$")
	public void user_clicks_on_cancel_button_from_the_top_of_the_page() throws Throwable {
		
		EventOptionsPage page2 = new EventOptionsPage(driver);
		page2.cancelEvent().click();
		
		
	}

	@Then("^verify that the event is set as cancelled$")
	public void verify_that_the_event_is_set_as_cancelled() throws Throwable {
		
		EventOptionsPage page2 = new EventOptionsPage(driver);
		Assert.assertTrue(page2.cancelStatus().isDisplayed(), "Event is cancelled successfully");
		
	}

	@Then("^user clicks on action button from the top of the page$")
	public void user_clicks_on_action_button_from_the_top_of_the_page() throws Throwable {
		
		EventOptionsPage page2 = new EventOptionsPage(driver);
		
		Thread.sleep(1000);
		
		page2.action().click();
		
	}

	@Then("^user clicks on delete button from the top of the page$")
	public void user_clicks_on_delete_button_from_the_top_of_the_page() throws Throwable {
		
		EventOptionsPage page2 = new EventOptionsPage(driver);
		page2.delete().click();
		
	}

	@Then("^verify that the event is deleted$")
	public void verify_that_the_event_is_deleted() throws Throwable {
		
	}
}