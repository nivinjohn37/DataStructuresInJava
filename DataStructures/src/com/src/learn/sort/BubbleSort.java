package com.src.learn.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = new int[] { 0, 1, 2, 0, 1, 2 };
		System.out.println(Arrays.toString(getBubbleSorted(input)));
	}

	private static int[] getBubbleSorted(int[] input) {
		for (int lastUnsortedIndex = input.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (input[i] > input[i + 1]) {
					swap(input, i, i + 1);
				}
			}
		}
		return input;
	}

	private static int[] swap(int[] input, int i, int j) {
		if (i == j) {
			return input;
		} else {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}

		return input;

	}
}
