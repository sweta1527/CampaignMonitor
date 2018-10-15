package requirement3;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for ValidateTriangle.
 */
public class ValidateTriangleTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public ValidateTriangleTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(ValidateTriangleTest.class);
	}

	/**
	 * Check method validateTriangle for input null
	 */
	@Rule
	public ExpectedException exception = ExpectedException.none();

	public void testValidateTriangle() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(1, 2, 3));
		} catch (InvalidTriangleException e) {
		}
	}

	/**
	 * Check method validateTriangle for input null
	 */
	public void testValidateTriangleSameSide() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(1, 1, 3));
		} catch (InvalidTriangleException e) {
		}
	}

	/**
	 * Check method validateTriangle for input null
	 */
	public void testValidateTriangleZero() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(0, 0, 0));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method validateTriangle
	 */
	public void testValidateTriangleEqual() {
		ValidateTriangle vTri = new ValidateTriangle();
		try {
			assertTrue(vTri.validateTriangle(5,5,5));
		} catch (InvalidTriangleException e) {
		}
	}

	/**
	 * Check method validateTriangle for input null
	 */
	public void testValidateTriangleOneZero() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(0, 5, 6));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method validateTriangle for input null
	 */
	public void testValidateTriangleTwoZero() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(0, 0, 6));
		} catch (InvalidTriangleException e) {
		}
	}

	/**
	 * Check method validateTriangle for input null
	 */
	public void testValidateTriangleValid() {
		ValidateTriangle vTri = new ValidateTriangle();
		try {
			assertTrue(vTri.validateTriangle(3, 4, 5));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSidesValid() {
		ValidateTriangle vTri = new ValidateTriangle();
		try {
			assertTrue(vTri.checkNegativeSides(3, 4, 5));
		} catch (InvalidTriangleException e) {
		}
	}
	
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSidesS1() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(-3, 5, 6));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSidesS2() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(3, -5, 6));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSidesS3() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(3, 5, -6));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSideAll() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(-3, -5, -6));
		} catch (InvalidTriangleException e) {
		}
	}
	
	/**
	 * Check method checkNegativeSides for input null
	 */
	public void testCheckNegativeSideTwo() {
		ValidateTriangle vTri = new ValidateTriangle();
		exception.expect(InvalidTriangleException.class);
		try {
			assertFalse(vTri.validateTriangle(3, -5, -6));
		} catch (InvalidTriangleException e) {
		}
	}

}
