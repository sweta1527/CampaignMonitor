package requirement1;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {

		StringCheck str = new StringCheck();

		// gather input
		String input = str.getInputString();

		// Check if the string is null

		str.isStringNullOrEmpty(input);

	}

	/**
	 * This method gets the input string using Scanner.
	 * 
	 */
	protected String getInputString() {
		Scanner userComm = new Scanner(System.in);
		System.out.println("Please enter the String.");

		// get the input string that the user entered.
		String input = userComm.nextLine();

		userComm.close();

		return input;

	}

	/**
	 * This method checks if the input is null. If it is, the method returns 'true'.
	 * If not, the method calls the isStringEmpty() method and returns the value
	 * returned by the called method.
	 * 
	 * 
	 * @param String Input string
	 * @return boolean
	 */
	protected boolean isStringNullOrEmpty(String a) {
		// If the string equates to a null, return true.
		if (a == null) {
			System.out.println(true);
			return true;
		}
		return isStringEmpty(a);

	}

	/**
	 * This method checks if the input is empty. If it is, the method returns
	 * 'true'. If not, the method returns 'false'
	 * 
	 * @param String Input string
	 * @return boolean
	 */
	protected boolean isStringEmpty(String a) {
		/*
		 * trim the string so we get rid of the blank or extra space and then check the
		 * length of the string.
		 */
		if (a.trim().length() == 0) {
			System.out.println(true);
			return true;
		}

		System.out.println(false);
		return false;
	}

}
