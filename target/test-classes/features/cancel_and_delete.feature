Feature: EventsCRM Manager Cancel and Delete

@Events
Scenario: User should be able to cancel a confirmed event

Given user is on Events page
When user selects a created and confirmed event
Then user clicks on cancel button from the top of the page
And verify that the event is set as cancelled

@Events
Scenario: User should be able to cancel and delete a confirmed event

Given user is on Events page
When user selects a created and confirmed event
Then user clicks on cancel button from the top of the page
And verify that the event is set as cancelled
And user clicks on action button from the top of the page
And user clicks on delete button from the top of the page
Then verify that the event is deleted