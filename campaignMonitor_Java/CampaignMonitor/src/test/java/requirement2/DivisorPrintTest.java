package requirement2;

import java.util.Arrays;
import java.util.List;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for DivisorPrint.
 */
public class DivisorPrintTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public DivisorPrintTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(DivisorPrintTest.class);
	}

	/**
	 * Check method isInputNumeric for input null
	 */
	public void testIsInputNumericNull() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric(null));
	}
	
	/**
	 * Check method IsInputNumeric for character input
	 */
	public void testIsInputNumericChar() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("a"));
	}

	/**
	 * Check method IsInputNumeric for blank
	 */
	public void testIsInputNumericBlank() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric(""));
	}

	/**
	 * Check method IsInputNumeric for blanks
	 */
	public void testIsInputNumericBlanks() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("    "));
	}

	/**
	 * Check method IsInputNumeric for character
	 */
	public void testIsInputNumericCharSpace() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("  b  "));
	}

	/**
	 * Check method IsInputNumeric for special character
	 */
	public void testIsInputNumericWordSpace() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("  !@$a  "));
	}
	
	
	/**
	 * Check method IsInputNumeric for integer with space
	 */
	public void testIsInputNumericIntSpace() {
		DivisorPrint dPrint = new DivisorPrint();

		
		
		assertFalse(dPrint.isInputNumeric("2147483648"));
	}
	
	public void testIsInputNumericNumSpace() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("  12  "));
	}
	
	public void testIsInputNumericNumSpaceDec() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("12.00"));
	}
	
	public void testIsInputNumericNumNeg() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("-12"));
	}
	
	public void testIsInputNumericDecNeg() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("-12.00"));
	}
	
	public void testIsInputNumericZero() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("0"));
	}
	
	public void testIsInputNumericZeroNeg() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("-0"));
	}
	
	public void testIsInputNumericZeroDec() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("0.00"));
	}
	
	public void testIsInputNumericOneNeg() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("-1"));
	}
	
	public void testIsInputNumericOne() {
		DivisorPrint dPrint = new DivisorPrint();

		assertTrue(dPrint.isInputNumeric("1"));
	}
	
	public void testIsInputNumericOneDec() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("1.00"));
	}
	
	public void testIsInputNumericNumDec() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("56.32"));
	}
	
	public void testIsInputNumericTwo() {
		DivisorPrint dPrint = new DivisorPrint();

		assertTrue(dPrint.isInputNumeric("2"));
	}
	
	public void testIsInputNumericLarge() {
		DivisorPrint dPrint = new DivisorPrint();

		assertTrue(dPrint.isInputNumeric("2147483647"));
	}
	
	public void testIsInputNumericOut() {
		DivisorPrint dPrint = new DivisorPrint();

		assertFalse(dPrint.isInputNumeric("2147483648"));
	}
	
	public void testIsInputNumericStartWithZero() {
		DivisorPrint dPrint = new DivisorPrint();

		assertTrue(dPrint.isInputNumeric("012"));
	}
	
	public void testGetDivisorsOne() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1);

		 assertTrue(dPrint.getDivisors(1).equals(expList));
	}
	
	public void testGetDivisorsTwo() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1,2);

		 assertTrue(dPrint.getDivisors(2).equals(expList));
	}
	
	public void testGetDivisorsLarge() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1,2147483647);

		 assertTrue(dPrint.getDivisors(2147483647).equals(expList));
	}
	
	public void testGetDivisorsNum1() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1,17,23,391);

		 assertTrue(dPrint.getDivisors(391).equals(expList));
	}
	
	public void testGetDivisorsNum2() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1,2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60);

		 assertTrue(dPrint.getDivisors(60).equals(expList));
	}
	
	public void testGetDivisorsNum3() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1, 2, 3, 6, 7, 14, 21, 42);

		 assertTrue(dPrint.getDivisors(42).equals(expList));
	}
	
	public void testGetDivisorsNum4() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1, 3, 7, 9, 21, 63);

		 assertTrue(dPrint.getDivisors(63).equals(expList));
	}
	
	public void testGetDivisorsNum5() {
		DivisorPrint dPrint = new DivisorPrint();
		
		List<Integer> expList = Arrays.asList(1, 3, 9, 3607, 3803, 10821, 11409, 32463, 34227, 13717421,41152263, 123456789);

		 assertTrue(dPrint.getDivisors(123456789).equals(expList));
	}
}
