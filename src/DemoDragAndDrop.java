import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/draggable/");
	    Thread.sleep(2000);
	    WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(f);
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.id("draggable"));
	    Actions a = new Actions(driver);
	    a.dragAndDropBy(ele, 150, 0).build().perform();
	}
}
