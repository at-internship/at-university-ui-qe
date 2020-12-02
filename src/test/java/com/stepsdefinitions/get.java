package com.stepsdefinitions;

import com.globalClasses.MongoDBUtils;
import com.globalClasses.TestBase;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class get extends TestBase{
	String allCourses = "";

    @When("I compare mongo with courses displayed")
    public void i_compare_mongo_with_courses_displayed() throws Exception {
        allCourses = base.clickPagination(usersAP.nextPage(), usersAP.getCourses());
    }
    @Then("I validate the mongodb data and the courses")
    public void i_validate_the_mongodb_data_and_the_courses() {
        assert true == MongoDBUtils.compareJsonString("TEST", "at-university-db", "courses", allCourses);
    }
    
}
