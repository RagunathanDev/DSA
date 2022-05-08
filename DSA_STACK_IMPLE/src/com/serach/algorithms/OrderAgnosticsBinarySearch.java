package com.serach.algorithms;

public class OrderAgnosticsBinarySearch {

	// Best Case : O(1) -> find the elemtn at middle

	// Worst case based on level find log2(N) -> Number level will be calculated

	public static void main(String[] args) {

		// Binary search we used only for sorted array.

		int[] ascArr = { 2, 4, 6, 8, 9, 11, 15, 19, 25, 28, 37, 46, 56, 87, 54 };
		int[] decArr = {98,76,54,46,32,22,15,13,14,9,6,5,3,2,1,-5,-4,-87,-99};
		int target = 46;
;
		int element = binarySearch(decArr, target);
		System.out.println(element);

	}

	// Binary search we used only for sorted array.
	// it will be (Ascending (or) Descending order).
	static public int binarySearch(int[] arr, int target) {

		// In binary search we use same array to find the element in the array
		// we only modify the cursors (START , END)

		// STEP 1 : define the start and end
		int start = 0;
		int end = arr.length - 1;

		// ** To know the given array is Ascending or descending ,
		// Need to compare the two element in the array,
		// best way to find compare start and end element in the array.

		boolean isAscending = arr[start] < arr[end];

		while (start <= end) {

			// STEP 2 : find the MIDDLE element
			// mid = (start +end)/2; ---> In this case (start+end) may exceed the int range
			// so
			// we use the optimized solution

			int middle = start + (end - start) / 2;

			if (target == arr[middle])
				return middle;

			if (isAscending) {
				// If the given array is ascending

				if (target > arr[middle]) {
					// If the target element greater than middle element,[right part will be taken]
					// END will be same START will be MIDDLE + 1

					start = middle + 1;

				} else {
					// IF the target element lesser than middle element ,[left part will be taken]
					// START will be same END will be MIDDLE - 1

					end = middle - 1;

				}
			} else {
				// If the given array is descending

				if (target < arr[middle]) {
					// If the target element greater than middle element,[right part will be taken]
					// END will be same START will be MIDDLE + 1

					start = middle + 1;

				} else {
					// IF the target element lesser than middle element ,[left part will be taken]
					// START will be same END will be MIDDLE - 1

					end = middle - 1;

				}
			}

		}

		return -1;

	}
}
