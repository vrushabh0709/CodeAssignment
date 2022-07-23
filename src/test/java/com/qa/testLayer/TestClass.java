package com.qa.testLayer;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

public class TestClass extends TestBase{

	@Test
	public void verifyTheDate()   {	

		hp.EnterInSerachBox("Pushpa: The Rise");
		hp.ClickOnSearchButton();
		sp.ClickOnWikipedia();
		date=wp.extractDate();
	}
	@Test
	public void verifyTheDateImDb()   {	

		hp.EnterInSerachBox("Pushpa: The Rise");
		hp.ClickOnSearchButton();
		sp.ClickOnIMDb();
		String imdbDate=imdbPg.extractDateIMDb();
		Assert.assertEquals(date, imdbDate);
	}

	@Test
	public void verifyTheCountry()   {	

		hp.EnterInSerachBox("Pushpa: The Rise");
		hp.ClickOnSearchButton();
		sp.ClickOnWikipedia();
		countryName=wp.extractCountry();
	}
	@Test
	public void verifyTheCountryIMDb()   {	

		hp.EnterInSerachBox("Pushpa: The Rise");
		hp.ClickOnSearchButton();
		sp.ClickOnIMDb();
		String imdbCountry=imdbPg.extractCountryIMDb();
		Assert.assertEquals(countryName, imdbCountry);
	}


}
