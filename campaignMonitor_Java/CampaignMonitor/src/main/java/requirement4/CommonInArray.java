package requirement4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class CommonInArray {

	public static void main(String[] args) {
		
		
		/* Alternatively, the Scanner utility can be used to accept an input from the user.*/
		int[] input = {5, 4, 3, 2, 4, 5, 1, 6, 1, 2, 5, 4};
		
		CommonInArray cArray = new CommonInArray();		
		

		int[] commonArray  = cArray.findCommonElements(input);

		System.out
				.println("The common elements in the array are:  "+ Arrays.toString(commonArray));

	}

	/**
	 * This method find the most common elements within the input array and returns
	 * the result.
	 * 
	 * @param input int[]
	 * @return int[]
	 */
	protected int[] findCommonElements(int[] input) {
		if (input == null || input.length <=0) {
			return new int[0];
		}
		
		// Create a Map containing the occurrence details of all the elements in the array
		Map<Integer, Integer> occurrenceMap = createoccurrenceMap(input);
		
		//Get the max occurrence value in the occurrence map.
		int maxOcc = getMaxoccurrenceValue(occurrenceMap);
		
		// get the max occurrence array
		int[] resultArr = getMaxoccurrenceArray(occurrenceMap,maxOcc);
		
		//Sort the array, purely for display purposes.
		Arrays.sort(resultArr);
		
		return resultArr;
		
		
	}

	/**
	 * This method creates a map containing unique integers within the array and
	 * their frequency.
	 * 
	 * @param int[] input
	 * @return MapMap<Integer, Integer> key: unique integer within the array value:
	 *         integer indicating the frequency of the 'key' integer within the
	 *         array.
	 */
	protected Map<Integer, Integer> createoccurrenceMap(int[] input) {

		// Convert the array to a list.
		List<Integer> inputList = IntStream.of(input).boxed().collect(Collectors.toList());

		// Create a map to store each value and its occurrence in the array.
		Map<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputList.size(); i++) {

			if (!(occurrenceMap.containsKey(input[i]))) {
				// If the hash map does not contain the element, store it with its frequency in
				// the array.
				int freq = Collections.frequency(inputList, inputList.get(i));
				occurrenceMap.put((Integer) inputList.get(i), freq);
			}
		}

		return occurrenceMap;

	}

	/**
	 * This method assesses the hashmap and returns the highest frequency. I.e. it
	 * returns the highest integer held as the hashmap value.
	 */
	protected int getMaxoccurrenceValue(Map<Integer, Integer> occurrenceMap) {
		int max = 0;
		
		max = Collections.max(occurrenceMap.values());
		
		return max;
	}
	
	
	/**
	 * This method iterates through the hashmap. If the value is equal to the 'max'
	 * value computed by the getMacoccurrenceValue method, the corresponding 'key'
	 * is added to the result integer array.
	 */
	protected int[] getMaxoccurrenceArray(Map<Integer, Integer> occurrenceMap,int max) {
		List<Integer> resultList = new ArrayList<Integer>();
		
		for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
			if (entry.getValue() == max) {
				// value is equal to the highest frequency. Add the corresponding key to the resultList.
				resultList.add(entry.getKey());
			}
		}
		
		// Convert the List into an int[]
		int[] returnArr = resultList.stream().mapToInt(i->i).toArray();
		
		return returnArr;
	}

}
