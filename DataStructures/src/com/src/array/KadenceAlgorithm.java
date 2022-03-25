package com.src.array;

import java.util.Arrays;

public class KadenceAlgorithm {
	/*
	 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	 * 
	 * Largest Sum Contiguous Subarray Difficulty Level : Medium Write an efficient
	 * program to find the sum of contiguous subarray within a one-dimensional array
	 * of numbers that has the largest sum.
	 * 
	 * 
	 * Kadane’s Algorithm:
	 * 
	 * Initialize: max_so_far = INT_MIN max_ending_here = 0
	 * 
	 * Loop for each element of the array (a) max_ending_here = max_ending_here +
	 * a[i] (b) if(max_so_far < max_ending_here) max_so_far = max_ending_here (c)
	 * if(max_ending_here < 0) max_ending_here = 0 return max_so_far Explanation:
	 * The simple idea of Kadane’s algorithm is to look for all positive contiguous
	 * segments of the array (max_ending_here is used for this). And keep track of
	 * maximum sum contiguous segment among all positive segments (max_so_far is
	 * used for this). Each time we get a positive sum compare it with max_so_far
	 * and update max_so_far if it is greater than max_so_far
	 *
	 * 
	 */
	public static void main(String[] args) {
		int[] input = new int[] { 0, 1, 2, 0, -11, 2 };
		System.out.println(getMaxSubArray(input));

	}

	private static int getMaxSubArray(int[] input) {
		int currSum = input[0], maxSum = input[0];
		for (int i = 1; i < input.length; i++) {
			currSum = Math.max(input[i], currSum + input[i]);
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

}
