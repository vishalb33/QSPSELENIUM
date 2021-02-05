import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class UrbanladderScreenShot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    List<WebElement> menus = driver.findElements(By.xpath(""));
	    Actions a = new Actions(driver);
	    Thread.sleep(1000);
	    for (WebElement menuName : menus)  {
	    	String mName = menuName.getText();
	    	System.err.println(mName);
	    	a.moveToElement(menuName).perform();
	    	Thread.sleep(2000);
	    	DemoScreenShot.ScreenShot(driver, mName);
	    	List<WebElement> subMenues = driver.findElements(By.xpath(""));
	    	
	    	for (WebElement subMenuName : subMenues)  {
	    		
		    	System.out.println(subMenuName.getText());
	    	}
	    	Thread.sleep(2000);
	    }
	}
}
