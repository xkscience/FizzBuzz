package com.xkscience.FizzBuzz;

public class FizzBuzzGame {
	public static String fizzBuzz(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else {
			return i + "";
		}
	}

	/**
	 * Stage 2
	 */
	public static String fizzBuzzEnhanced(int i) {
		String s = i + "";
		boolean fizzCondition = i % 3 == 0 || s.indexOf("3") > -1;
		boolean buzzCondition = i % 5 == 0 || s.indexOf("5") > -1;

		if (fizzCondition && buzzCondition) {
			return "FizzBuzz";
		} else if (fizzCondition) {
			return "Fizz";
		} else if (buzzCondition) {
			return "Buzz";
		} else {
			return i + "";
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(FizzBuzzGame.fizzBuzz(i));
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(FizzBuzzGame.fizzBuzzEnhanced(i));
		}
	}
}
