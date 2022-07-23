package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.testBase.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//input[@title='Search']")
	private WebElement search_Box;

	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	private WebElement search_Button;


	public void EnterInSerachBox(String movie) {
		search_Box.sendKeys(movie);
	}

	public void ClickOnSearchButton() {
		search_Button.click();
	}


}
