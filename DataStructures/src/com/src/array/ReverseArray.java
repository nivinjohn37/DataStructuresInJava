package com.src.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] input = new int[] { 0, 1, 2, 0, 1, 2 };
		System.out.println(Arrays.toString(getReversed(input)));
	}

	private static int[] getReversed(int[] input) {
		int low = 0, high = input.length - 1;
		int temp;
		while (low < high) {
			temp = input[low];
			input[low] = input[high];
			input[high] = temp;
			low++;
			high--;
		}
		return input;
	}

}
