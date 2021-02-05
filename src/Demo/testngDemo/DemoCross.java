package Demo.testngDemo;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DemoCross {
	@Parameters("browser")
	@Test
	public void TC_01() throws InterruptedException  {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./software/geckodriver.exe");
		    driver1 = new FirefoxDriver();
		}
		else {
			driver = null;
		}
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.close();
	}
}
