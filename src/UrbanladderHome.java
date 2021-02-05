import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UrbanladderHome {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.urbanladder.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    
	    driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span[contains(.,'Living')]")).click();
	    
	    driver.findElement(By.xpath("//a[@class='inverted']/span[contains(.,'Fabric Sofa Sets')]")).click();
	}
}
