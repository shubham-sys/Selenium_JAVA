package ValidatingLandingPage;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import utils.ExcelUtil;
import utils.Screenshot;

public class ValidatingMoreTravel {
	
	LandingPage lp;
	List<WebElement> totalOption;
	List<String> totalOptionValue;
	WebDriver driver;
	
	@BeforeTest
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\NewFramework\\chromedriver.exe"); 
		driver = new ChromeDriver();
		lp = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.go();
		
		
	}
	
	@Test(priority = 11)
	void testSize() {
		lp.moreTravelOption().click();
		totalOption = lp.moreTravelDropdownOptions();
		totalOptionValue =  totalOption.stream().map(s -> s.getText()).collect(Collectors.toList());
		Screenshot sc = new Screenshot(driver);
		sc.capture("C:\\Users\\shubh\\NewFramework\\Selenium");
		Assert.assertEquals(totalOptionValue.size(), 7);
	}
	
	@Test(dataProvider = "data", priority = 12)
	void testValues(String data) {
		
		Assert.assertTrue(totalOptionValue.contains(data));
		Assert.assertEquals(totalOptionValue.size(), 7);
		
		Screenshot sc = new Screenshot(driver);
		sc.capture("C:\\Users\\shubh\\NewFramework\\Selenium");
	}
	
	
	@DataProvider
	Object[][] data() throws IOException {
		Object[][] data = new Object[7][1];
		
		ExcelUtil exl = new ExcelUtil("C:\\Users\\shubh\\NewFramework\\Selenium\\data\\data1.xlsx");
	
		
ion		data[0][0] = exl.getData("sheet1", 0, 0);
		data[1][0] = exl.getData("sheet1", 1, 0);
		data[2][0] = exl.getData("sheet1", 2, 0);
		data[3][0] = exl.getData("sheet1", 3, 0);
		data[4][0] = exl.getData("sheet1", 4, 0);
		data[5][0] = exl.getData("sheet1", 5, 0);
		data[6][0] = exl.getData("sheet1", 6, 0);
		
		return data;
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}

}
