import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
    public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.dirver", "./software/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    String parent = driver.getWindowHandle();
	    System.out.println("parent" + parent);
	    Set<String> winshandel = driver.getWindowHandles();
	    for (String win : winshandel) {
	    	System.out.println("child" + win);
	    }
	}
}
