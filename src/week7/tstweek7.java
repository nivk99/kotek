package week7;


import java.util.Arrays;
import java.util.Scanner;

public class tstweek7 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int a = 0;

		// System.out.println("enter your number");//n!
		// a=r.nextInt();
		// int sum=1;
		// for(int i=1;i<=a;i++) {
		/// sum=sum*i;
		// }
		// System.out.println(sum);

		int[] arr = new int[5];
		int arr1[]= {5,8,8,4};
		insertionSort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		//int[] arr2=Arrays.copyOf(arr1,arr1.length);
		//System.out.println("enter 5 number");// maxarr
		//for (int i = 0; i < arr.length; i++) {
			//arr[i] = r.nextInt();
		//}
		//int maxarr = 0;

		//for (int x : arr) {
			//if (maxarr < x) {
			//	maxarr = x;
		//	}
	///	}
		//System.out.println(maxarr);//copy of arr
		//int[] arr3=Arrays.copyOf(arr,arr.length);
		//insertionSort(arr3);
		//System.out.println(Arrays.toString(arr3));// print of arr
		//System.out.println(Arrays.toString(arr));
		

	}
	public static void bubblesort(int[]a){
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int tamp =a[j];
					a[j]=a[j+1];
					a[j+1]=tamp;
				}
			}
		}
		
	}
	
	
	
	
	
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				int tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
			}
		}
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
	
	

}
