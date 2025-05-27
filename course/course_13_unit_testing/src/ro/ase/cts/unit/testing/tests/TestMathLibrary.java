package ro.ase.cts.unit.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.unit.testing.MathLibrary;

public class TestMathLibrary {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Global Setup");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Global Teardown");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teardown");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNumbers() {
		//define input values for the metyhod
		int vb1 = 10;
		int vb2 = 20;
		//define expected output
		int expectedResult = 30;
		//call the method and get the result
		int result = MathLibrary.addNumbers(vb1, vb2);
		
		
		assertEquals(expectedResult, result);
		
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testAddNumbersForOverflow() {
		//define input values for the metyhod
		int vb1 = Integer.MAX_VALUE;
		int vb2 = 1;
		
		MathLibrary.addNumbers(vb1, vb2);
		
	}

}
