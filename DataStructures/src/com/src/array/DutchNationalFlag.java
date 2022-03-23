package com.src.array;

import java.util.Arrays;

public class DutchNationalFlag {
	public static void main(String[] args) {

		int[] input = new int[] { 0, 1, 2, 0, 1, 2 };
		System.out.println(Arrays.toString(getSortedInput(input)));
		// Stream.of(getSortedInput(input)).forEach(System.out::print);
	}

	private static int[] getSortedInput(int[] input) {
		int low = 0, mid = 0, high = input.length - 1;
		while (mid <= high) {
			switch (input[mid]) {
			case 0:
				swap(input, low, mid);
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(input, mid, high);
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
