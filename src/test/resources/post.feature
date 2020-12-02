Feature: add courses

  Background: I am in the add new courses form
    Given I am in the Courses Administration page
    When I do click in the AddNewCourse button
    Then The AddNewCourse form should be displayed
@Post
  Scenario: add a new course
    Given I select the category
    	And I put a title
    	And I put a description
    	And I put an image
    	And I choose a status
    When I click the button save
    Then I should see an alert of successful course creation
