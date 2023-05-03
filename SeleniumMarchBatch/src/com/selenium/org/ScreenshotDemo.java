package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;
import com.google.common.io.Files;

public class ScreenshotDemo extends BaseClass{

	
	public static void main(String[] args) throws IOException {
		
		browser("chrome");
		
		getUrl("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File desFile = new File("C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\ScreenShot\\amazon.png");
		
		Files.copy(srcFile, desFile);
		
	}
}
