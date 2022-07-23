package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.IMDbPage;
import com.qa.pageLayer.SearchPage;
import com.qa.pageLayer.WikipediaPage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Logger Logger;
	public HomePage hp;
	public SearchPage sp;
	public WikipediaPage wp;
	public IMDbPage imdbPg;
	public String date;
	public String countryName;



	@BeforeClass
	public void start() {
		Logger= Logger.getLogger("Code Assignment");
		PropertyConfigurator.configure("Log4j.properties");
		Logger.info("Automation Framework Started");
	}


	@AfterClass
	public void stop() {
		Logger.info("Automation Framework Stopped");
	}

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) {

		if(br.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}

		else if(br.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}

		else {
			System.out.println("Please enter valid browser name.");
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Logger.info("Url is lunched, maximized, delate all cookies and some wait as well");

		hp= new HomePage();
		sp= new SearchPage();
		wp= new WikipediaPage();
		imdbPg= new IMDbPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		Logger.info("Browser is Closed.");
	}
}
