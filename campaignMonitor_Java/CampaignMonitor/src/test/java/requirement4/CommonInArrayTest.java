package requirement4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for CommonInArray.
 */
public class CommonInArrayTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public CommonInArrayTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CommonInArrayTest.class);
	}

	/**
	 * Check method findCommonElements for input null
	 */
	public void testfindCommonElementsNull() {
		CommonInArray cInArr = new CommonInArray();
		
		Assert.assertArrayEquals(new int[0],cInArr.findCommonElements(null));
	}
	
	/**
	 * Check method findCommonElements for input empty
	 */
	public void testfindCommonElementsEmpty() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {};
		Assert.assertArrayEquals(new int[0],cInArr.findCommonElements(input));
	}
	
	/**
	 * Check method findCommonElements for input one value
	 */
	public void testfindCommonElementsOneVal() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {100};
		int[] expected = {100};
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testfindCommonElementsVal1() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {5, 4, 3, 2, 4, 5, 1, 6, 1, 2, 5, 4};
		int[] expected = {4,5};
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testfindCommonElementsVal2() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {1, 2, 3, 4, 5, 1, 6, 7};
		int[] expected = {1};
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}

	/**
	 * Check method findCommonElements for input 
	 */
	public void testfindCommonElementsVal3() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int[] expected = {1, 2, 3, 4, 5, 6, 7};
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testfindCommonElementsVal4() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = {1, -2, 3, 4, 5, 6, -2};
		int[] expected = {-2};
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}
	
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testfindCommonElementsVal5() {
		CommonInArray cInArr = new CommonInArray();
		int[] input = getUniqueIntArray();
		int[] expected = input;
		Assert.assertArrayEquals(expected,cInArr.findCommonElements(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testCreateOccuranceMap() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
		int[] input = {1, 2, 3};
		
		assertEquals(map, cInArr.createoccurrenceMap(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testCreateOccuranceMapNoEle() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		int[] input = {};
		
		assertEquals(map, cInArr.createoccurrenceMap(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testCreateOccuranceMapDupEle() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
		int[] input = {1, 2, 2, 3,3,3};
		
		assertEquals(map, cInArr.createoccurrenceMap(input));
	}
	
	/**
	 * Check method findCommonElements for input 
	 */
	public void testCreateOccuranceMapDupEle2() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,3);
        map.put(3,3);
		int[] input = {1, 2, 2,2, 3,3,3};
		
		assertEquals(map, cInArr.createoccurrenceMap(input));
	}
	
	
	/**
	 * Check method getMaxOccurrenceValue for input 
	 */
	public void testGetMaxOccurrenceValue1() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,5);
        map.put(3,3);
		
		assertEquals(5, cInArr.getMaxoccurrenceValue(map));
	}
	
	/**
	 * Check method getMaxOccurrenceValue for input 
	 */
	public void testGetMaxOccurrenceValue2() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
		
		assertEquals(1, cInArr.getMaxoccurrenceValue(map));
	}
	
	
	/**
	 * Check method getMaxOccurrenceArray for input 
	 */
	public void testGetMaxOccurrenceArray1() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        
        int[] expected = {1, 2, 3};
		
        Assert.assertArrayEquals(expected, cInArr.getMaxoccurrenceArray(map,1));
	}
	
	/**
	 * Check method getMaxOccurrenceArray for input 
	 */
	public void testGetMaxOccurrenceArray2() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        
        int[] expected = {3};
		
        Assert.assertArrayEquals(expected, cInArr.getMaxoccurrenceArray(map,3));
	}
	
	/**
	 * Check method getMaxOccurrenceArray for input 
	 */
	public void testGetMaxOccurrenceArray3() {
		CommonInArray cInArr = new CommonInArray();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        map.put(-1,2);
        map.put(3,2);
        
        int[] expected = {-1,3};
		
		Assert.assertArrayEquals(expected, cInArr.getMaxoccurrenceArray(map,2));
	}
	
	private int[] getUniqueIntArray() {
		int[] array = new int[100000];
		for (int a = 0; a < array.length; a++) {
			array[a] = (a + 1);
		}
		return array;
	}
}
