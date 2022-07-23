package com.qa.pageLayer;



import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class WikipediaPage extends TestBase {
	public JavascriptExecutor J=(JavascriptExecutor)driver;


	public WikipediaPage() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="(//td[@class='infobox-data'])[10]")
	private WebElement releaseDate;

	@FindBy (xpath="//td[text()='India']")
	private WebElement country;



	public String extractDate(){
		J.executeScript("scroll(0, 800)");
		String date = releaseDate.getText();
		return date;
	}

	public String extractCountry(){
		J.executeScript("scroll(0, 800)");
		String countryName = country.getText();
		return countryName;
	}

}

