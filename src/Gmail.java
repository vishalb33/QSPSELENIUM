import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.gmail.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.name("identifier")).sendKeys("vishalbirajdar333@gmail.com");
	    WebElement next = driver.findElement(By.id("identifierNext"));
	    next.click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("VB85518973");
	    WebElement next1 = driver.findElement(By.name("passwordNext"));
	}
}
