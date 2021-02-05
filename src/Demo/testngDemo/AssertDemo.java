package Demo.testngDemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void tc()  {
		String st1 = "ABC";  //Actual
		String st2 = "ABC";  //Expected
		
		Assert.assertEquals(st1, st2);
		Reporter.log("Matched", true);
		List<Object> lst1 = new ArrayList<>();
		lst1.add(true);
		lst1.add("ABC");
		lst1.add(99);
		lst1.add(55.6);
		List<Object> lst2 = new ArrayList<>();
		lst2.add(true);
		lst2.add("ABC");
		lst2.add(99);
		lst2.add(55.6);
		Assert.assertEquals(st1, st2);
		Reporter.log("Matched2", true);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("ABC", "ABC");
		Reporter.log("MatchedSA", true);
		sa.assertAll();
		Assert.fail();
	}
}
