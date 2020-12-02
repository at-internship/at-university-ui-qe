Feature: Delete Stories using the dashboard

  Background: I am in the menu course table
    Given I am in the Courses Administration page

	@Delete1
	Scenario: Delete a course using the dashboard button
   	Given I have an existent id
    When I delete a existent course on the dashboard
    Then I should see an alert of successful course deleted
    	And I verify in the dashboard if the courses does not exist