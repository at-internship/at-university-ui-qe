package com.globalClasses;

import org.openqa.selenium.By;

public class CourseAdminPage {

	private By coursesAdminTitleLocator = By.xpath("//h4[contains(string(),'Courses Administration')]");
	private By addCourseButtonLocator = By.linkText("» Add New Course");
	private By successLocatorPost = By.xpath("//div/div[contains(string(),'Course added successfully')]");
	private By successLocatorPut = By.xpath("//div/div[contains(string(),'Course Updated Successfully')]");
	private By searchLocator = By.xpath("//input[@type='search']");
	private By dataInTableLocator;
	private By plusButtonLocator;
	private By editInRowLocator;
	private By deleteInRowLocator;
	private String a = "//tr[contains(string(),'", b="')]";
	private String c = "//span/a[@href='/admin/course/edit/", d="//*[@class='sorting_1'][contains(string(), '", e="']";
	private String f = "//span/a[@href='/admin/course/delete/";

	public By getCoursesAdminTitleLocator() {
		return coursesAdminTitleLocator;
	}
	
	public By getAddCourseButtonLocator() {
		return addCourseButtonLocator;
	}
	
	public By getSuccessLocatorPut() {
		return successLocatorPut;
	}
	public By getSuccessLocatorPost() {
		return successLocatorPost;
	}
	
	public By getSearchLocator() {
		return searchLocator;
	}
	
	public By getPlusButtonLocator(String id) {
		plusButtonLocator = By.xpath(d+id+b);
		return plusButtonLocator;
	}
	public By getDataInTableLocator(String data) {
		dataInTableLocator = By.xpath(a+data+b);
		return dataInTableLocator;
	}
	public By getEditInRowLocator(String id) {
		editInRowLocator = By.xpath(c+id+e);
		return editInRowLocator;
	}
	
	public By getDeleteInRowLocator(String id) {
		deleteInRowLocator = By.xpath(f+id+e);
		return deleteInRowLocator;
	}

}
