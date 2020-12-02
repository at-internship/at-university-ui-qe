package com.globalClasses;

import org.openqa.selenium.By;

public class AddNewCourse {
	
	private By addCourseTitleLocator = By.xpath("//h3[contains(string(),'New Course')]");
	private By categoryLocator = By.id("category");
	private By titleLocator = By.name("title");
	private By descriptionLocator = By.name("description");
	private By imageLocator = By.name("img");
	private By statusLocator = By.name("status");
	private By submitLocator = By.xpath("//button[@type='submit']");
	
	
	public By getAddCourseTitleLocator() {
		return addCourseTitleLocator;
	}
	
	public By getCategoryLocator() {
		return categoryLocator;
	}
	
	public By getTitleLocator() {
		return titleLocator;
	}
	
	public By getDescriptionLocator() {
		return descriptionLocator;
	}
	
	public By getImageLocator() {
		return imageLocator;
	}
	
	public By getSubmitLocator(){
		return submitLocator;
	}
	
	public By getStatusLocator() {
		return statusLocator;
	}
}
