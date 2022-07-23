package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase {

	public UtilClass() {
		PageFactory.initElements(driver, this);
	}

	public static void takeScreenShot(String filname)  {

		String path="D:\\VelocityTraining\\SetUps\\Eclipse_IDE_2021_12\\Eclipse_WorkSpace_2021_12\\CodeAssignmentFramework\\screenshot\\";

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+filname+".png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			System.out.println("File path not found.");
			e.printStackTrace();
		}

	}
}
