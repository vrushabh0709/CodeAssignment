package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class IMDbPage extends TestBase {
	JavascriptExecutor j = ((JavascriptExecutor)driver);
	public IMDbPage() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//a[contains(text(),'January 7, 2022 (United States)')]")
	private WebElement imdbreleaseDate;

	@FindBy (linkText="India")
	private WebElement imdbcountry;


	public String extractDateIMDb(){
		j.executeScript("scroll (0, 5500)");
		String imdbDate = imdbreleaseDate.getText();
		return imdbDate;
	}

	public String extractCountryIMDb(){
		j.executeScript("scroll (0, 5500)");
		String imdbCountry = imdbcountry.getText();
		return imdbCountry;
	}

}
