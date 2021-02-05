import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    WebElement search = driver.findElement(By.xpath("//input[@id='email']"));
	    search.sendKeys("vishal456birajdar@gmail.com");
	    WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	    password.sendKeys("vb85518973");
	    WebElement logIn = driver.findElement(By.xpath("//input[@type='submit']"));
	    logIn.click();
	    //driver.findElement(By.linkText("Forgotten password?")).click();
	    //System.out.println(driver.getTitle());
	}
}
