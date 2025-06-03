package ro.ase.cts.unit.testing.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.unit.testing.MathLibrary;
import ro.ase.cts.unit.testing.exceptions.NoValuesException;
import ro.ase.cts.unit.testing.exceptions.NullValuesException;

public class TestMathLibrary {
	
	// Test fixture
	static int testData[];
	static int performanceTestData[];

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int noValues = (int) 1e7;
		performanceTestData = new int[noValues];
		Random random = new Random();
		for(int i = 0; i < noValues; i++) {
			performanceTestData[i] = random.nextInt(1000);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		testData = new int[] {10,20,30};
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
	
	@Test
	public void testSetCacheDataReference() {
		int values[] = {20,40,56};
		MathLibrary.setCachedData(values);
		
		//change the outer data
		values[0] = 200;
		//check if the object data has been changed
		int innerValue = MathLibrary.getCachedData()[0];
		assertNotEquals(innerValue, values[0]);	
	}
	
	@Test
	public void testGetCacheDataReference() {
		
		int initialValues[] = {20,30,50};
		MathLibrary.setCachedData(initialValues);
		
		int values[] = MathLibrary.getCachedData();
		values[0] = 200;
		int innerValue = MathLibrary.getCachedData()[0];
		assertNotEquals(innerValue, values[0]);	
	}
	
	@Test
	public void testMinInverseRelation() {
		int values[] = {5,10,1,100};
		int min = MathLibrary.minimumValue(values);
		
		//there should be NO values lesser than min
		for(int value : values) {
			if(value < min) {
				fail("There is a values less thah min");
			}
		}
		assertTrue(true);
	}
	
	@Test
	public void testMinCrossCheck() {
		//using the TestCase data
		int min = MathLibrary.minimumValue(testData);
		
		Arrays.sort(testData);
		int otherMin = testData[0];
		
		assertEquals(min, otherMin);
	}
	
	// compute min of 100k values in less than 1 sec
	@Test
	public void testMinPerformance() {
		int noValues = (int) 1e7;
		int values[] = new int[noValues];
		Random random = new Random();
		for(int i = 0; i < noValues; i++) {
			values[i] = random.nextInt(1000);
		}
		
		double tStart = System.currentTimeMillis();
		MathLibrary.minimumValue(values);
		double tFinal = System.currentTimeMillis();
		if(tFinal - tStart > 100)
			fail("Too slow");
		assertTrue(true);
	}
	
	@Test(timeout = 100)
	public void testMinPerformanceUpdated() {
		
		MathLibrary.minimumValue(performanceTestData);
		
	}
	
	@Test
	public void testMinRangeMinInt() {
		int values[] = {10,5,Integer.MIN_VALUE};
		int min = MathLibrary.minimumValue(values);
		
		assertEquals(Integer.MIN_VALUE, min);
	}
	
	
	
	

}
