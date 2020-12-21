Feature: Update Courses using the Dashboard

	Background: I am in the add new course
		Given I am in the Courses Administration page
			And I select a random course to edit
		When I do click in the Edit Course button
		Then The EditCourse form should be displayed
			
		@Update1
		Scenario: Update the title of the course
			Given I put a new title
			When I do click in the Update button
			Then I should see an alert of successful Course Update
				And I should see the changes in the Course Module
				And I should see the changes in the Mongo DB