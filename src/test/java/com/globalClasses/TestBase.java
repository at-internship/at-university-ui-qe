package com.globalClasses;

import org.openqa.selenium.WebDriver;

import com.stepsdefinitions.Hooks;

public class TestBase {

	protected WebDriver driver = Hooks.getDriver();
	protected BasePages base = new BasePages(driver);
	protected CourseAdminPage coursesAP = new CourseAdminPage();
	protected TestValues values = new TestValues();
	protected GetAll usersAP = new GetAll();
	protected AddNewCourse addNC = new AddNewCourse();
	protected EditCourse eC = new EditCourse();
	protected DeleteCourse deleteAP = new DeleteCourse();
	
	
}
