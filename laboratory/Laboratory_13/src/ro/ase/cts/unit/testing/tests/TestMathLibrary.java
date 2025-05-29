package ro.ase.cts.unit.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.unit.testing.MathLibrary;
import ro.ase.cts.unit.testing.exceptions.NoValuesException;
import ro.ase.cts.unit.testing.exceptions.NullValuesException;

public class TestMathLibrary {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testMinimumValueRight() {
		//define the input test values
		int values[] = {10,20,30};
		//define the expected output
		int expectedMinValue = 10;
		//get the function result
		int result = MathLibrary.minimumValue(values);
		
		//check results
		assertEquals("test Right conditions", expectedMinValue,  result);
	}
	
	@Test
	public void testMinimumValueOrderingDesc() {
		int values[] = {30,20,10,1};
		int expectedMin = 1;
		int result = MathLibrary.minimumValue(values);
		
		assertEquals(expectedMin, result);
	}
	
	@Test
	public void testMinimumValueCardinalityZero() {
		int values[] = {};
		try {
			MathLibrary.minimumValue(values);
			fail("I did not got the NoValuesException");
		}
		catch(NoValuesException ex) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testMinimumValueCardinalityOne() {
		int values[] = {10};
		int expectedMin = values[0];
		int result = MathLibrary.minimumValue(values);
		assertEquals(expectedMin, result);
	}
	
	@Test(expected = NullValuesException.class)
	public void testMinimumValueErrorNullValues() {
		MathLibrary.minimumValue(null);
	}
	
	
	
	
	

}
