package model;

import org.openqa.selenium.By;

public class Locators {
	
	public static String homePageUrl = "https://bongobd.com/";
	
	//Content selection and play
	public static By categoryClick = By.xpath("//a[@href='/kids']");
	public static By categoryHover = By.xpath("//span[contains(text(),'Oddbods')]");
	public static By seeAll = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/span[1]/a[1]/span[1]/span[1]");
	public static By contentClick = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/a[1]/div[1]/div[1]/div[1]");
    
}
