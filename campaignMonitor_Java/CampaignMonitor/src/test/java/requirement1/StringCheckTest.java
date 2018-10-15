package requirement1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for StringCheck.
 */
public class StringCheckTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public StringCheckTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(StringCheckTest.class);
	}

	/**
	 * Check method isStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyNull() {
		StringCheck chk = new StringCheck();

		assertTrue(chk.isStringNullOrEmpty(null));
	}
	
	/**
	 * Check method IsStringNullOrEmpty for character input
	 */
	public void testIsStringNullOrEmptyChar() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringNullOrEmpty("a"));
	}

	/**
	 * Check method IsStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyBlank() {
		StringCheck chk = new StringCheck();

		assertTrue(chk.isStringNullOrEmpty(""));
	}

	/**
	 * Check method IsStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyBlanks() {
		StringCheck chk = new StringCheck();

		assertTrue(chk.isStringNullOrEmpty("    "));
	}

	/**
	 * Check method IsStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyNullString() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringNullOrEmpty("null"));
	}

	/**
	 * Check method IsStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyNullCharSpace() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringNullOrEmpty("  b  "));
	}

	/**
	 * Check method IsStringNullOrEmpty for input null
	 */
	public void testIsStringNullOrEmptyNullWordSpace() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringNullOrEmpty("  !@$a  "));
	}
	
	/**
	 * Check method IsStringEmpty for character input
	 */
	public void testIsStringEmptyChar() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringEmpty("a"));
	}

	/**
	 * Check method IsStringEmpty for input null
	 */
	public void testIsStringEmptyBlank() {
		StringCheck chk = new StringCheck();

		assertTrue(chk.isStringEmpty(""));
	}

	/**
	 * Check method IsStringEmpty for input null
	 */
	public void testIsStringEmptyBlanks() {
		StringCheck chk = new StringCheck();

		assertTrue(chk.isStringEmpty("    "));
	}

	/**
	 * Check method IsStringEmpty for input null
	 */
	public void testIsStringEmptyNullString() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringEmpty("null"));
	}

	/**
	 * Check method IsStringEmpty for input null
	 */
	public void testIsStringEmptyNullCharSpace() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringEmpty("  b  "));
	}

	/**
	 * Check method IsStringEmpty for input null
	 */
	public void testIsStringEmptyNullWordSpace() {
		StringCheck chk = new StringCheck();

		assertFalse(chk.isStringEmpty("  !@$a  "));
	}
}
