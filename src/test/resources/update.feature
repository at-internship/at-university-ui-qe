Feature: Update Courses using the Dashboard

	Background: I am in the add new course
		Given I am in the Courses Administration page
			And I select a random story to edit
		When I do click in the Edit Course button
		Then The EditCourse form should be displayed
			
		@Update1
		Scenario: Update the name of the course
			Given I put a new description
			When I do click in the Update button
			Then I should see an alert of successful Course Update
				And I should see the changes in the Stories Module
				And I should see the changes in the Mongo DB