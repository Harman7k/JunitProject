package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {               //in Junit and testNG if 1 test fails, it will run next test, all test r independent
                                     //not like in java, we depend only on main method
	@BeforeClass                        // hence we can group test cases
	
	public static void setUpBeforeClass() throws Exception {
	System.out.println("beforeclass");	
	
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterclass");
	
	}

	@Before
	public void setUp() throws Exception {  
		System.out.println("before");  
		System.out.println("login");                                  //beforeClass
	}                                                                //afterclass 
                                                                     //before
	@After                                                           //after   
	public void tearDown() throws Exception {                        //test1  
		System.out.println("after");                                 //test2
		System.out.println("logout");           
	}                                                                 

	@Test
	                                       //beforeClass - first and once in the class
	public void test1() {  
		//System.out.println("login");                  //before - before every test
		System.out.println("test1");                    //test1
		//System.out.println("logout");                 //after - after every test 
	}                                               
	@Test                                  //before 
	public void test2() {                   //test2
	System.out.println("test2");            //after
	}	
			@Test                              //afterCLass - last and once in the class
			public void test3() {
				System.out.println("test3");
	}

}
