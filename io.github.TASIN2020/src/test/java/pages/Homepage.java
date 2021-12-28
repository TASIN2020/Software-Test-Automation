package pages;

import org.openqa.selenium.WebDriver;

import model.Locators;

public class Homepage {
	
WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String homePageUrl() {
		return Locators.homePageUrl;
	}
	

}
