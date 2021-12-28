package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.Homepage;

public class Tests {

	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	Homepage homePage = new Homepage(driver);
	Timeout time = new Timeout();

	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
		time.timeout(2000);
	}

	@Test
	public void tests() {

		commonMethods.clickOnButton(Locators.categoryClick);
		time.timeout(3000);

		commonMethods.hoverOnButton(Locators.categoryHover);
		time.timeout(3000);

		commonMethods.clickOnButton(Locators.seeAll);
		time.timeout(4000);

		commonMethods.clickOnButton(Locators.contentClick);
		time.timeout(3000);

	}

}
