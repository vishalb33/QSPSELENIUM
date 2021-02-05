import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Urbanladder1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    WebElement sale = driver.findElement(By.xpath("//span[contains(.,'sale')]"));
	    System.out.println(sale.getText());
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofa", Keys.ENTER);
	    driver.findElement(By.xpath("//button[@id='search_button']")).click();
	    Actions a = new Actions(driver);
	    for (WebElement menuName : menus)   {
	    	System.out.println(menuName.getText());
	    	a.moveToElement(menuName).build().perform();
	    	Thread.sleep(1000);
	    }
	}
}
