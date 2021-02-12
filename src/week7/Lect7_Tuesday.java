package week7;

import java.util.Arrays;
import java.util.Scanner;

public class Lect7_Tuesday {

	// 0+1+...+n
	public static int sumUpToN(int n) {
		if (n == 0)
			return n;
		return sumUpToN(n - 1) + n;
	}

	// 0,1,1,2,3,...
	public static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void hanoi(int n, char src, char dest, char help) {
		if (n == 0)
			return;
		hanoi(n - 1, src, help, dest);
		System.out.println("Move disc " + n + " from " + src + " to " + dest);
		hanoi(n - 1, help, dest, src);
	}

	public static int sumArray(int[] arr) {
		if (arr.length == 0)
			return 0;
//		{1,2,4,5,6,7} -> {1,2,4,5,6}
		int[] subArray = Arrays.copyOf(arr, arr.length - 1);
		return (sumArray(subArray) + arr[arr.length - 1]);
	}

	public static int sumArrayHelper(int[] arr, int n) {
		if (n == 0)
			return 0;
		return sumArrayHelper(arr, n - 1) + arr[n - 1];
	}

	public static int sumArray_improved(int[] arr) {
		return sumArrayHelper(arr, arr.length);
	}

	public static int max(int[] arr, int n) {
		if (n == 1)
			return arr[0];
		int tmp = max(arr, n - 1);
		if (tmp > arr[n - 1])
			return tmp;
		else
			return arr[n - 1];
	}

	public static boolean isSymetric(int[] arr) {
		return isSymetricHelper(arr, 0, arr.length - 1);
	}

	public static boolean isSymetricHelper(int[] arr, int leftIndex, int rightIndex) {
		if (leftIndex >= rightIndex) {
			return true;
		}
		if (arr[leftIndex] != arr[rightIndex])
			return false;
		return isSymetricHelper(arr, leftIndex + 1, rightIndex - 1);
	}

	public static void bubbleSort(int[] arr) {
		boolean hasChanged = true;
		for (int i = arr.length - 1; (i > 0) && (hasChanged == true); i--) {
			hasChanged = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					hasChanged = true;
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = minIndex(arr, i);
			swap(arr, i, minIndex);
		}
	}

	public static int minIndex(int[] arr, int i) {
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		return minIndex;
	}

}