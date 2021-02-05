import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    //driver.findElement(By.partialLinkText("Inc.")).click();
	    WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	    System.out.println("Id is" +username.getText());
	    WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	    System.out.println("Password is" +password.getText());
	    WebElement logIn = driver.findElement(By.xpath("//a[contains(.,'login')]"));
	    logIn.click();
	    /*Set<String> wins = driver.getWindowHandles();
	    for (String win : wins) {
	    	driver.switchTo().window(win);
	    }
	    System.out.println(driver.getTitle());*/
	}
}
