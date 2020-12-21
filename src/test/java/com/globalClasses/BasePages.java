package com.globalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePages {
	private WebDriver driver;

	public BasePages(WebDriver driver){
		this.driver = driver;
	}
	public void click(By element) throws Exception {
		try {
			driver.findElement(element).click();
		}catch(Exception e){
			throw new Exception("Cannot did click at "+element);
		}
	}
	public boolean isDisplayed(By element) throws Exception {
		try {
			return driver.findElement(element).isDisplayed();
		}catch(Exception e){
			throw new Exception("The element "+element+" is not displayed");
		}
	}

	public boolean isNotDisplayed(By element) throws Exception {
		try {
			driver.findElement(element).isDisplayed();
			return false;
		}catch(Exception e){
			return true;
		}
	}

	public void sendKeys(By element, String key) throws Exception {
		try {
			driver.findElement(element).click();
			driver.findElement(element).clear();
			driver.findElement(element).sendKeys(key);
		}catch(Exception e){
			throw new Exception("Impossible sed keys to "+element);
		}
	}
	public void selectItem(By element) throws Exception {
		try {
			driver.findElement(element).click();
			Select item = new Select(driver.findElement(element));
			if(element.equals(By.id("category"))) {
				item.selectByIndex(((int)(Math.random()*(2-0)+1)+0));
			} else {
				item.selectByIndex(((int)(Math.random()*(1-0)+1)+0));
			}
		}catch(Exception e){
			throw new Exception("Impossible select Item: "+element);
		}
	}
	public void waitElement(By element) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}catch(Exception e){
			throw new Exception("Not Found E: "+element);
		}
	}
	public String getText(By element) throws Exception {
		String text;
		try {
			text = driver.findElement(element).getText();
		}catch(Exception e){
			throw new Exception("Impossible get text to "+element);
		}
		return text;
	}

	/*public void deleteFirstStory(By items) throws Exception {
		try {
			int counter = 0;

			WebElement element = driver.findElement(items);
			List<WebElement> getItemByItem = element.findElements(By.cssSelector(" tbody >tr > td > a > i"));
			for (WebElement g : getItemByItem) {
				if (counter < 2){
					String lastElement = g.getAttribute("class");
					if(lastElement.contains("fa-trash")){
						g.click();
					}
				}else{
					break;
				}
				counter = counter + 1;
			};
		}catch(Exception e){
			throw new Exception("Impossible select Item: "+ e);
		}
	}*/

	public String getFirstId(By items) throws Exception {
		try {
			String firstId = "";
			int counter = 0;

			WebElement element = driver.findElement(items);
			List<WebElement> getItemByItem = element.findElements(By.cssSelector(" tbody >tr > td"));

			for (WebElement g : getItemByItem) {
				if (counter == 0){
					String getItem = g.getText();
					firstId = firstId + getItem;
				}else{
					break;
				}
				counter = counter + 1;
			};
			return firstId;
		}catch(Exception e){
			throw new Exception("Impossible select Item: "+ e);
		}
	}


	public String getItem(By elements) throws Exception {
		try {
			String allFields = "", getItem = "";
			int counter = 0;
			clickPlusInfo(elements);
			WebElement element = driver.findElement(elements);
			List<WebElement> getItemByItem = element.findElements(By.cssSelector(" tbody >tr > td"));
			for (WebElement g : getItemByItem) {
				if(g.getAttribute("class").contains("child")) {
					List<WebElement> getHidenItemByItem = g.findElements(By.cssSelector("ul > li > span")); 
					for(WebElement s : getHidenItemByItem) {
						if(s.getAttribute("class").contains("dtr-data")&& counter!= 1) {
							getItem = s.getText();
							allFields = allFields + getItem;
						}
						counter = counter +1;
						if(counter == 6) { counter = 0;}
					}
				} else {					
					getItem = g.getText();
					allFields = allFields + getItem;
				}
			};
			return allFields;
		}catch(Exception e){
			throw new Exception("Impossible select Item: "+e);
		}
	}

	public String clickPagination(By elements, By items) throws Exception {
		String allItems = "";
		WebElement nextElement = driver.findElement(elements);
		String lastElement = nextElement.getAttribute("class");
		do  {
		nextElement = driver.findElement(elements);
		lastElement = nextElement.getAttribute("class");
			allItems = allItems + getItem(items);
			nextElement.click();
		 } while (!lastElement.contains("disabled"));
		return allItems;
	}
	
	public void clickPlusInfo(By elements) throws Exception {
		if(driver.findElement(By.xpath("//*[@id=\"coursesTable\"]/tbody/tr[1]/td[1]")).isDisplayed()) {
			WebElement element = driver.findElement(elements);
			List<WebElement> getButtonByButton = element.findElements(By.xpath("//*[@class='sorting_1']"));
			for (WebElement c : getButtonByButton) {
				c.click();
			}
		}
	}
}