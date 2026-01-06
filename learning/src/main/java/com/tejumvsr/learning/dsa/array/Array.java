package com.tejumvsr.learning.dsa.array;

import java.util.Arrays;

import com.tejumvsr.learning.dsa.array.two_sum.Solution;

public class Array {
	
	public static void twoSumSolution() {
		Solution sol = new Solution();
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] solution = sol.twoSum(nums, target);
		System.out.println("Solution for two sum : " + Arrays.toString(solution));
		System.out.println();
		
		nums = new int[] {3, 2, 4};
		target = 6;
		solution = sol.twoSum(nums, target);
		System.out.println("Solution for two sum : " + Arrays.toString(solution));
		System.out.println();
		
	}
	

}
