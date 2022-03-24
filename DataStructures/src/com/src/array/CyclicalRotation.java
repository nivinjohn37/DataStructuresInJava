package com.src.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CyclicalRotation {

	/*
	 * https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
	 * 
	 * Program to cyclically rotate an array by one Difficulty Level : Basic Last
	 * Updated : 14 Mar, 2022 Given an array, cyclically rotate the array clockwise
	 * by one.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = {1, 2, 3, 4, 5} Output: arr[] = {5, 1, 2, 3, 4}
	 * 
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		 * t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases while
		 * (t-- > 0) { int n = Integer.parseInt(br.readLine().trim()); int a[] = new
		 * int[n]; String inputLine[] = br.readLine().trim().split(" "); for (int i = 0;
		 * i < n; i++) { a[i] = Integer.parseInt(inputLine[i]); }
		 * 
		 * a=rotate(a, n); StringBuilder output = new StringBuilder(); for (int i = 0; i
		 * < n; i++) output.append(a[i] + " "); System.out.println(output); }
		 */
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotate(input, input.length)));
	}

	private static int[] rotate(int[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			swap(a, i, i - 1);
		}
		return a;

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
