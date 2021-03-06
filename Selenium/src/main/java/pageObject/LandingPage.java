package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
		this.url = "https://www.expedia.co.in/";
	}
	
	By signInButton =  By.xpath("//button[text()='Sign in']");
	By moreTravelOption = By.xpath("//div[text()='More travel']");
	By moreTravelDropdownOptions = By.xpath
			("//nav[@id='header-toolbar-nav']//div[@class='uitk-list']//div[@class='uitk-text uitk-type-300']");
	
	public WebElement singInButton() {
		return driver.findElement(signInButton);
		
	}
	
	public WebElement moreTravelOption() {
		return driver.findElement(moreTravelOption);
		
	}
	
	public List<WebElement> moreTravelDropdownOptions() {
		return driver.findElements(moreTravelDropdownOptions);
		
	}
	
}
