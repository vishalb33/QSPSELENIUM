import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager", Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div[contains(.,'- Select Customer -')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='searchItemList']/div[contains(.,'- New Customer -')]")).click();
	    driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("v");
	    driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("vb");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[@class='components_button_label']")).click();
	    Thread.sleep(5000);
	    String err = driver.findElement(By.xpath("//div[@class='basicLightboxFooter']/descendant::span[@class='errormsg']")).getText();
	    System.out.println(err);
	}
}
