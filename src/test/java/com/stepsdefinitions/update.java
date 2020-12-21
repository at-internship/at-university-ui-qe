package com.stepsdefinitions;
import com.globalClasses.MongoDBUtils;
import com.globalClasses.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class update extends TestBase {
	String data1, data2, id, monData1, monData2;
	
	@Given("I select a random story to edit")
	public void i_select_a_random_story_to_edit() throws Throwable {
		id = MongoDBUtils.getRandomID("TEST", "at-university-db", "courses");
		base.sendKeys(coursesAP.getSearchLocator(), id);
		data1 = base.getText(coursesAP.getDataInTableLocator(id));
		monData1 = MongoDBUtils.getJObjectByID("TEST", "at-university-db", "courses", id);
	}
	
	@When("I do click in the Edit Course button")
	public void i_do_click_in_the_Edit_Course_Button() throws Throwable {
		base.click(coursesAP.getPlusButtonLocator(id));
		base.click(coursesAP.getEditInRowLocator(id));
	}
	
	@Then("The EditCourse form should be displayed")
	public void the_EditCourse_form_should_be_displayed() throws Throwable {
		base.waitElement(eC.getEditCourseTitleLocator());
		base.waitElement(eC.getSubmitLocator());
	}
	
	@Given("I put a new description")
	public void i_put_a_new_description() throws Throwable {
		base.sendKeys(eC.getNameLocator(), values.randomName());
	}
	
	@When("I do click in the Update button")
	public void i_do_click_in_the_Update_button() throws Throwable {
		base.click(eC.getSubmitLocator());
	}
	
	@Then("I should see the changes in the Stories Module")
	public void i_should_see_the_changes_in_the_Stories_Module() {
		monData2 = MongoDBUtils.getJObjectByID("TEST", "at-university-db", "courses", id);
		assert false == monData1.equals(monData2);
	}

	@Then("I should see the changes in the Mongo DB")
	public void i_should_see_the_changes_in_the_Mongo_DB() throws Throwable {
		base.sendKeys(coursesAP.getSearchLocator(), id);
		data2 = base.getText(coursesAP.getDataInTableLocator(id));
		System.out.println(data1);
		System.out.println(data2);
		assert false == data1.equals(data2);
	}
	@Then("I should see an alert of successful Course Update")
	public void i_should_see_an_alert_of_successful_Course_Update() throws Throwable {
		base.waitElement(coursesAP.getSuccessLocatorPut());
	}
}
