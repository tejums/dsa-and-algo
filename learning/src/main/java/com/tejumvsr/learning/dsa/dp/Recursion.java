package com.tejumvsr.learning.dsa.dp;

public class Recursion {
	/**
	 * Direct formula (n(n+1)) / 2
	 * last 2 numbers will be (n-1), n
	 * @param n
	 * @return
	 */
	public static int sumOfNNaturalNumbers(int n) {
		if (n == 1)
			return 1;
		return n + Recursion.sumOfNNaturalNumbers(n - 1);

	}

	 /**
	  *  Direct formula (n)2
	  *  last 2 numbers will be (2n - 3 ),(2n-1)
	 * @param n
	 * @return
	 */
	public static int sumOfNOddNaturalNumbers(int n) {
		if (n == 1)
			return 1;
		return ((2 * n - 1) + Recursion.sumOfNOddNaturalNumbers(n - 1));
	}

	/**
	 *  Direct formula n(n+1)
	 *  last 2 numbers will be (2n - 2 ),2(n)
	 * @param n
	 * @return
	 */
	public static int sumOfNEvenNaturalNumbers(int n) {
		if (n == 1)
			return 2 ;
		return 2 * n + Recursion.sumOfNEvenNaturalNumbers(n - 1);
	}

}
