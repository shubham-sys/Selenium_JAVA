package base;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver; 
	public String url = "";
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void go() {
		driver.manage().window().maximize();
		driver.get(url);
	}
}
