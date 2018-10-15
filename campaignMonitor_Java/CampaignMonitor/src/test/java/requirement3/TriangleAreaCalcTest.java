package requirement3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for TriangleAreaCalc.
 */
public class TriangleAreaCalcTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public TriangleAreaCalcTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TriangleAreaCalcTest.class);
	}

	/**
	 * Check method for input null
	 */
	public void testCulateAreaNull() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();

		try {
			assertEquals(0.0, tAreaCalc.calculateArea(null));
		} catch (InvalidShapeException e) {
		}
	}
	
	/**
	 * Check method for input
	 */
	public void testCulateAreaValid() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();
		Triangle t = new Triangle(3,4,5); 
		try {
			assertEquals(6.00, tAreaCalc.calculateArea(t));
		} catch (InvalidShapeException e) {
		}
	}
	
	/**
	 * Check method for input
	 */
	public void testCulateAreaValid1() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();
		Triangle t = new Triangle(8,4,5); 
		try {
			assertEquals(8.18, tAreaCalc.calculateArea(t));
		} catch (InvalidShapeException e) {
		}
	}
	
	/**
	 * Check method for input
	 */
	public void testCulateAreaValid2() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();
		Triangle t = new Triangle(800,400,500); 
		try {
			assertEquals(81815.34, tAreaCalc.calculateArea(t));
		} catch (InvalidShapeException e) {
		}
	}
	
	/**
	 * Check method for input
	 */
	public void testCulateAreaValid3() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();
		Triangle t = new Triangle(800000,400000,500000); 
		try {
			assertEquals(81815340859.77, tAreaCalc.calculateArea(t));
		} catch (InvalidShapeException e) {
		}
	}
	
	/**
	 * Check method for input
	 */
	public void testCulateAreaValid4() {
		TriangleAreaCalc tAreaCalc = new TriangleAreaCalc();
		Triangle t = new Triangle(8,8,8); 
		try {
			assertEquals(27.71, tAreaCalc.calculateArea(t));
		} catch (InvalidShapeException e) {
		}
	}
	
	
}
