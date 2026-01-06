package com.tejumvsr.learning.dsa.array.two_sum;

import java.util.Arrays;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		System.out.println("input nums : " + Arrays.toString(nums));
		System.out.println("input target : " + target);
		for (int i=0; i<=nums.length - 1; i++) {
			System.out.println("Start *************************");
			System.out.println("item ficked : " + nums[i]);
			System.out.println(nums[i]);
			for(int j= i+1; j< nums.length; j++) {
				System.out.println("items being compared : " + nums[j]);
				System.out.println(nums[j]);
				if(nums[i] + nums[j] == target) {
					System.out.println("End *************************");
					return new int[] { i, j };
				}
			}
			System.out.println("End *************************");
			System.out.println();
		}

		return null;
	}

}
