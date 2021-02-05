import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Urbanladder2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    List<WebElement>menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	    Actions a = new Actions(driver);
	    Thread.sleep(1000);
	    for (WebElement menuName menus) {
	    	String mName = menuName.getText();
	    	System.err.println(mName);
	    	
	    }
	}
}
