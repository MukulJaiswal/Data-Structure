package com.sorting;

public class BubbleSort {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n - i-1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 500, -5, 2, -3, 5, 100, 0 };
		bubbleSort(a);
		printArray(a);

	}

}