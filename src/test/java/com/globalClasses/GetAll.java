package com.globalClasses;

import org.openqa.selenium.By;

public class GetAll {
	
	private By getCoursesbyCourses = By.id("coursesTable");
    private By getPages = By.id("coursesTable_next");

    public By getCourses() {
    	return getCoursesbyCourses;
    	}
    public By nextPage() {
    	return getPages;
    	}

}
