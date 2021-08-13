package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	private WebDriver driver;
	
	public Screenshot(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void capture(String path) {
		Date date = new Date();

		TakesScreenshot src = (TakesScreenshot)driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		File dstFilr = new File(path + "//screenshots//sample"+ date.getTime() +".jpg");
		
		File dstFileFolder = new File(path + "//screenshots");
		if (!dstFileFolder.exists()) {
			dstFileFolder.mkdir();	
		}
		
		try {
			FileUtils.copyFile(srcFile, dstFilr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
