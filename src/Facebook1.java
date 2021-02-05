import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    WebElement createNewAcc = driver.findElement(By.xpath("//a[@id='u_0_2']"));
	    System.out.println(createNewAcc.isEnabled());
	    if (createNewAcc.isEnabled())
	    	createNewAcc.click();
	    Thread.sleep(2000);
	    WebElement male = driver.findElement(By.xpath("//a[@id='u_0_2']"));
	    System.out.println(male.isEnabled());
	    if (male.isEnabled())
	    	male.click();
	    Thread.sleep(2000);
	    System.out.println(male.isSelected());
	}
}
