package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	
  @Rule
  public ErrorCollector err = new ErrorCollector();

	@Test
	public void test6() {
		
	String actual = "abc";
	String expected = "abc";
	/*if(expected.equals(actual)) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}*/

	System.out.println("before 1st Assert");
	Assert.assertEquals(expected, actual); //we use regular assert in industry
	System.out.println("After 1st assert");
	Assert.assertTrue("verify 2>3", 4>3);
	System.out.println("After 2nd assert");
	}
	
	@Test
	public void test7() {
		
	String actual = "abc";
	String expected = "abc1";
    System.out.println("before 1st Assert");
    try {
	Assert.assertEquals(expected, actual); 
    }catch(Throwable t) {
    	err.addError(t);
    	System.out.println("I'm in second catch");
    }
	
	System.out.println("After 2nd assert");
	
	}	
	
}