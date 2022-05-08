package com.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[] {5,4,-1,-4,3,2,0};
		bubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {
		boolean swapped;

		// initialize a i for iterating the array elements
		for (int i = 0; i < arr.length; i++) {

			swapped = false; // need to identify the array sorted or not

			// Iterate through every elements
			for (int j = 1; j < arr.length - i; j++) {

				swapped = false;

				// Check the two number
				if (arr[j] < arr[j - 1]) {

					// Swapping logic
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

					swapped = true; // if swap happen in the i-th iteration, continue.
				}
			}

			if (!swapped) { 	// If swap not happen in the j-th iteration, the array will be sorted format
				break;
			}
		}

	}
}
