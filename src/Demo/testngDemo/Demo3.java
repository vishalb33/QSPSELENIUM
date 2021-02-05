package Demo.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	
	/* @Test(invocationCount = 5)
	 public void tc() {
		 Reporter.log("Hiii..!", true);
	 }*/
	@Test(dependsOnMethods = {"tc2", "tc3"})             //priority = 3
	public void tc1() {
		Reporter.log("1Hiii..!", true);
	}
	
	@Test(dependsOnMethods = "tc3")          //enabled = false,invocationCount = 0
	public void tc2() {
		Reporter.log("2Hiii..!", true);
	}
	
	@Test()
	public void tc3() {
		Reporter.log("3Hiii..!", true);
	}
	
	@Test()
	public void tc4() {
		Reporter.log("4Hiii..!", true);
	}
	
	@Test()
	public void tc5() {
		Reporter.log("5Hiii..!", true);
	}
	
	@Test()
	public void tc6() {
		Reporter.log("6Hiii..!", true);
	}
	
	@Test()
	public void tc7() {
		Reporter.log("7Hiii..!", true);
	}
	
}
