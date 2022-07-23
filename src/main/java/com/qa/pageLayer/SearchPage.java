package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SearchPage extends TestBase {

	public SearchPage() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(partialLinkText ="Wikipedia")
	private WebElement wikiLink;


	@FindBy (partialLinkText ="IMDb")
	private WebElement imdbLink;

	public void ClickOnWikipedia ()  {
		wikiLink.click();
	}

	public void ClickOnIMDb() {
		imdbLink.click();
	}
}
