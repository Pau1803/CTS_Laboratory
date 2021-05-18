package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.models.MathOperations;

public class TestCaseMathOperation {

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
	public void testAdd() {
		int a =5;
		int b=6;
		int expectedResult=11;
		int actuallResult=MathOperations.add(a, b);
		assertEquals("Check the addition", expectedResult, actuallResult);
	}

}