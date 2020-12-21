package com.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.domain.uiDelete;
import com.globalClasses.TestBase;

public class delete extends TestBase{
	uiDelete ui = new uiDelete();
	
	@Given("I have an existent id")
    public void i_have_an_existent_id() throws Exception {
        ui.setId(base.getFirstId(usersAP.getCourses()));
    }

    @When("I delete a existent course on the dashboard")
    public void i_delete_a_existent_course_on_the_dashboard() throws Exception {
    	base.click(coursesAP.getPlusButtonLocator(ui.getId()));
    	base.click(coursesAP.getDeleteInRowLocator(ui.getId()));
    	//base.deleteFirstStory(usersAP.getStories());
    }
    @Then("I should see an alert of successful course deleted")
    public void i_should_see_an_alert_of_successful_course_deleted() throws Exception {
        base.waitElement(deleteAP.getSuccessDelete());
    }
    @Then("I verify in the dashboard if the courses does not exist")
    public void i_verify_in_the_dashboard_if_the_course_does_not_exist() throws Exception {
    	base.waitElement(deleteAP.getSuccessDelete());
    }

}
