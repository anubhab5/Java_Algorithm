package algorithm;

public class TwoSum {

	/*
	 * Problem Statement Given an array of integers, return indices of the two
	 * numbers such that they add up to a specific target.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ar = obj.getSum(a, 9);
		System.out.println("First Index:- " + ar[0]);
		System.out.println("Second Index:- " + ar[1]);
	}

	public int[] getSum(int[] arr, int sum) {
		int a[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int secondNumber = sum - arr[i];
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == secondNumber) {
					a[0] = arr[i];
					a[1] = arr[j];
					return a;
				}
			}
		}
		throw new IllegalArgumentException("No Match found");
	}

}
