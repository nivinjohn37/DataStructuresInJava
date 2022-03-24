package com.src.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionOfArrays {

	/*
	 * https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-
	 * arrays/
	 * 
	 * Find Union and Intersection of two unsorted arrays Difficulty Level : Easy
	 * Last Updated : 22 Mar, 2022 Given two unsorted arrays that represent two sets
	 * (elements in every array are distinct), find the union and intersection of
	 * two arrays.
	 * 
	 * For example, if the input arrays are: arr1[] = {7, 1, 5, 2, 3, 6} arr2[] =
	 * {3, 8, 6, 20, 7}
	 * 
	 * Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and
	 * Intersection as {3, 6, 7}. Note that the elements of union and intersection
	 * can be printed in any order.
	 * 
	 *
	 * 
	 */
	public static void main(String[] args) {
		// Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		// Taking total count of testcases
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			int n, m;
			// taking size of array a
			n = sc.nextInt();
			// taking size of array b
			m = sc.nextInt();
			// Creating 2 array of size n and m
			int a[] = new int[n];
			int b[] = new int[m];
			// inserting elements to array a
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			// inserting elements to array b
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			UnionOfArrays ob = new UnionOfArrays();
			// calling doUnion method and printing the results
			System.out.println(ob.doUnion(a, n, b, m));
		}

	}

	private int doUnion(int[] a, int n, int[] b, int m) {
		List<Integer> test = Arrays.stream(a).boxed().collect(Collectors.toList());
		Set<Integer> aSet = new HashSet<Integer>(test);
		int unionCount = 0;
		for (int i = 0; i < m; i++) {
			if(!aSet.contains(b[i])) {
				unionCount++;
			}
			
		}
		return unionCount+ aSet.size();
	}

}
