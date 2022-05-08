package com.serach.algorithms;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {

		int arr[] = { 24, 554, 32, 23, 56, 876, 2, 34, 65, 6 };
		int target = 4;
		int result = linearSearch(arr, target);
		System.out.println(result);
		System.out.println("-----------------------------------------------------------\n");
		
		//find the target element present or not
		boolean result2 = linearSearch2(arr, target);
		System.out.println(result2);

		// Search the character present in the string
		System.out.println("-----------------------------------------------------------\n");
		String name = "aeiou";
		char targetChar = 'i';
		System.out.println(linearStringSearch(name, targetChar));

	}

	// Search target element array
	static public int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return Integer.MAX_VALUE;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}

		return Integer.MAX_VALUE;
	}

	// Search target element array
	static public boolean linearSearch2(int[] arr, int target) {

		if (arr.length == 0) {
			return false;
		}

		for (int element : arr) {
			if (element == target)
				return true;
		}
		return false;
	}

	static public boolean linearStringSearch(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == target) {
//				return true;
//			}
//		}
		
		for (char element : str.toCharArray()) {
			if(element == target) {
				return true;
			}
		}

		return false;
	}
}
