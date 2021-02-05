import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
	    search.sendKeys("java", Keys.ENTER);
	    //WebElement googlesearch = driver.findElement(By.name("btnK"));
	}
}
