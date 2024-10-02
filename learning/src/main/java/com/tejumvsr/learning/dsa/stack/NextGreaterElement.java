package com.tejumvsr.learning.dsa.stack;

import java.util.Arrays;

public class NextGreaterElement {
	
	/**
	 * Brute force approach with loops O(n2). 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static int[] nextGreaterElementBF(int[] nums1, int[] nums2) {
		System.out.println("nums1 = " + Arrays.toString(nums1));
		System.out.println("nums2 = "+ Arrays.toString(nums2));
		
		int output[] = new int[nums1.length];
		
		for (int i = 0; i < nums1.length; i++) {
//			System.out.print(nums1[i] + ", ");
			int numberPresentAt = -1;
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					numberPresentAt = j;
				}
				if(numberPresentAt > -1 && j > numberPresentAt && nums1[i] < nums2[j]) {
					output[i] = nums2[j];
					break;
				}
				if(j == nums2.length -1) {
					// end of the array, greater item not found
					output[i] = -1;
				}
			}
		}

		System.out.println("Output is : " + Arrays.toString(output));
		return output;
	}

}
