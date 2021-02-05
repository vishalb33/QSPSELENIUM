package Demo.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	 
	@Test(groups = "smoke", priority = 3)             
	public void tc1() {
		Reporter.log("1Hiii..!", true);
	}
	
	@Test(groups = "regration", dependsOnGroups = "functional")          
	public void tc2() {
		Reporter.log("2Hiii..!", true);
	}
	
	@Test(groups = "functional", dependsOnGroups = "smoke", priority = -2)
	public void tc3() {
		Reporter.log("3Hiii..!", true);
	}
	
	@Test(groups = "smoke", priority = 2)
	public void tc4() {
		Reporter.log("4Hiii..!", true);
	}
	
	@Test(groups = "functional", dependsOnGroups = "smoke", priority = -3)
	public void tc5() {
		Reporter.log("5Hiii..!", true);
	}
	
	@Test(groups = "smoke", priority = 1)
	public void tc6() {
		Reporter.log("6Hiii..!", true);
	}
	
	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc7() {
		Reporter.log("7Hiii..!", true);
	}
}
