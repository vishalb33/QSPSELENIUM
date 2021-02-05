package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.UrbanLadder;

public class TestUrbanLadder {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.urbanladder.com/");
	    Thread.sleep(2000);
	    UrbanLadder ul = new UrbanLadder(driver);
	    ul.closeClick();
	    ul.livingMouseHover(driver);
	    ul.sofaClick();
	    ul.viewProductClick();
	}
}
