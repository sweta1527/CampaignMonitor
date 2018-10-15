package requirement2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DivisorPrint {

	public static void main(String[] args) {
		
		
		/*
		 * Alternatively, the Scanner utility can be used to accept an input from the
		 * user. Methods of the Scanner utility can be used to validate the input.
		 */

		/*
		 * This program accepts only whole numbers and will error out if double/float
		 * values are entered.
		 */
		String input = "60";
		
		DivisorPrint dPrint = new DivisorPrint();

		if (!(dPrint.isInputNumeric(input))) {
			// The input value is invalid.
			return;
		}

		// call the method that returns the divisors of the input number.
		List<Integer> divisorList = dPrint.getDivisors(Integer.parseInt(input.trim()));

		System.out
				.println("The list of divisors for input " + input + " are " + Arrays.toString(divisorList.toArray()));

	}

	protected boolean isInputNumeric(String input) {
		// check if the input is null
		if (input == null) {
			System.out.println("Input is null. Please try again.");
			return false;
		}

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Input is non numeric or not a valid whole number. Please try again.");
			return false;
		}
		
		if (Integer.parseInt(input) == 0) {
			System.out.println("Input is 0. All non-zero numbers are divisors of 0. Please try again.");
			return false;
		} else if (Integer.parseInt(input) < 0) {
			System.out.println("Input is a negative number. Please try again.");
			return false;
			
		}

		return true;
	}

	protected List<Integer> getDivisors(Integer num) {
		// create the array list that is to be returned.
		List<Integer> divisorList = new ArrayList<Integer>();
		divisorList.add(1);

		if (num == 1) {
			return divisorList;
		}
		/*
		 * Divide the number by 2 and run through all numbers until the value num/2.
		 * Start the loop with 2, considering that 1 is already added into the return
		 * list.
		 */
		for (int i = 2; i <= num/2; i++) {

			// if the remainder of num/i is 0, it indicates that num is exactly divisible by
			// i.
			if (num % i == 0) {
				divisorList.add(i);
			}
		}
		
		// add the input number as all numbers are divisors of themselves.
		if (!divisorList.contains(num)) {
			divisorList.add(num);
		}

		return divisorList;
	}

}
