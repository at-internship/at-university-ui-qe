package com.globalClasses;

import org.openqa.selenium.By;

public class DeleteCourse {
	
	private By successDelete = By.xpath("//div/div[contains(string(),'Course Deleted Successfully')]");
    private By confirmElimination;
    private String a = "//td[contains(.,'", b="')]";

    public By getSuccessDelete() {
        return successDelete;
    }
    public By confirmElimination(String data) {
        confirmElimination = By.xpath(a+data+b);
        return confirmElimination;
    }

}
