package com.src.array;

import java.util.Arrays;

public class MoveNegativesToSide {

	/*
	 * https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-
	 * constant-extra-space/
	 * 
	 * Move all negative numbers to beginning and positive to end with constant
	 * extra space Difficulty Level : Easy Last Updated : 16 Mar, 2022 An array
	 * contains both positive and negative numbers in random order. Rearrange the
	 * array elements so that all negative numbers appear before all positive
	 * numbers.
	 * 
	 * Examples :
	 * 
	 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6 Output: -12 -13 -5 -7 -3 -6 11 6 5
	 * Note: Order of elements is not important here.
	 * 
	 * 
	 * Time complexity: O(N) Auxiliary Space: O(1)
	 * 
	 * Two Pointer Approach: The idea is to solve this problem with constant space
	 * and linear time is by using a two-pointer or two-variable approach where we
	 * simply take two variables like left and right which hold the 0 and N-1
	 * indexes. Just need to check that :
	 * 
	 * Check If the left and right pointer elements are negative then simply
	 * increment the left pointer. Otherwise, if the left element is positive and
	 * the right element is negative then simply swap the elements, and
	 * simultaneously increment and decrement the left and right pointers. Else if
	 * the left element is positive and the right element is also positive then
	 * simply decrement the right pointer. Repeat the above 3 steps until the left
	 * pointer ≤ right pointer.
	 * 
	 *
	 * 
	 */
	public static void main(String[] args) {
		int[] input = new int[] { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		System.out.println(Arrays.toString(getSortedInput(input)));

	}

	private static int[] getSortedInput(int[] input) {
		int low = 0, high = input.length - 1;
		while (low <= high) {
			if (input[low] < 0 && input[high] < 0) {
				low++;
			} else if (input[low] > 0 && input[high] < 0) {
				swap(input, low, high);
				low++;
				high--;
			} else if (input[low] > 0 && input[high] > 0) {
				high--;
			} else {
				low++;
				high--;
			}
		}
		return input;
	}

	private static int[] swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
		return input;

	}

}
