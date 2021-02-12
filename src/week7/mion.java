package week7;

import java.util.Arrays;

public class mion {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 8, 2, 5 };
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void bubblesort1(int[] arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int sum=0;
					sum=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=sum;
				}
				
			}
			
		}
				
				
	}

	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmo = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmo;
				}
			}
		}
	}
}
