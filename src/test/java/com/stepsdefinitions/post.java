package com.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.globalClasses.TestBase;

public class post extends TestBase {
	String name;

	@Given("I am in the Courses Administration page")
	public void i_am_in_the_Courses_Administration_page() throws Throwable {
		driver.get("https://at-university-ui.herokuapp.com/admin/course");
		base.waitElement(coursesAP.getCoursesAdminTitleLocator());
	}

	@When("I do click in the AddNewCourse button")
	public void i_do_click_in_the_AddNewCourse_button() throws Throwable {
		base.click(coursesAP.getAddCourseButtonLocator());
	}

	@Then("The AddNewCourse form should be displayed")
	public void the_AddNewCourse_form_should_be_displayed() throws Throwable {
		base.waitElement(addNC.getAddCourseTitleLocator());
	}
	
	@Given("I select the category")
	public void i_select_the_category() throws Throwable {
		base.selectItem(addNC.getCategoryLocator());
	}
	
	@And("I put a title")
	public void i_put_a_title() throws Throwable {
		name = values.randomName();
		base.sendKeys(addNC.getTitleLocator(), name);
		
	}
	
	@And("I put a description")
	public void i_put_a_description() throws Throwable{
		base.sendKeys(addNC.getDescriptionLocator(), values.randomString());
	}
	
	@And("I put an image")
	public void i_put_an_image() throws Throwable {
		base.sendKeys(addNC.getImageLocator(), "img.com");
	}
	
	@And("I choose a status")
	public void i_choose_a_status() throws Throwable {
		base.click(addNC.getStatusLocator());
	}
	
	@When("I click the button save")
	public void i_click_the_button_save() throws Throwable {
		base.click(addNC.getSubmitLocator());
	}
	
	@Then("I should see an alert of successful course creation")
	public void i_should_see_an_alert_of_successful_course_creation() throws Throwable {
		base.waitElement(coursesAP.getSuccessLocatorPost());
	}

}
