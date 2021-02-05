package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanLadder {
	
	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	private WebElement close;
	
	@FindBy(xpath = "//li[@class='topnav_item livingunit']")
	private WebElement living;
	
	@FindBy(xpath = "//span[contains(.,'Fabric Sofa Sets')]")
	private WebElement fabricSofaSet;
	
	@FindBy(xpath = "//li[1]/descendant::div[@class='Grey selected variations']/descendant::button[contains(.,'View Product')]")
	private WebElement viewProduct;
	
	public void closeClick()  {
		close.click();
	}
	
	public void livingMouseHover(WebDriver driver)  {
		Actions a = new Actions(driver);
		a.moveToElement(living).perform();
	}
	
	public UrbanLadder(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	public void sofaClick()  {
		fabricSofaSet.click();
	}
	
	public void viewProductClick()  {
		viewProduct.click();
	}
}
