Feature: Get all the courses using the Dashboard
	@Get1
	Scenario: Get all the courses
		Given I am in the Courses Administration page
		When I compare mongo with courses displayed
		Then I validate the mongodb data and the courses