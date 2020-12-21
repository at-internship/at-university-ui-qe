package com.globalClasses;

import org.openqa.selenium.By;

public class EditCourse {

	private By editCourseTitleLocator = By.xpath("//h3[contains(string(),'Edit Course')]");
	private By nameLocator = By.name("title");
	private By submitLocator = By.xpath("//button[@type='submit']");
	
	public By getEditCourseTitleLocator() {
		return editCourseTitleLocator;
	}
	public By getNameLocator() {
		return nameLocator;
	}
	public By getSubmitLocator() {
		return submitLocator;
	}
	
}
