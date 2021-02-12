package week8;

import java.util.Arrays;

public class binary {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,10,11,12};
		int index=bin(arr,5);
		System.out.println(index);

	}

	public static int bin(int[] arr, int number) {

		int low = 0, high = arr.length - 1, midd;
		while (low <= high) {
			midd = (low + high) / 2;
			if (arr[midd] == number) {
				return midd;
			} else {
				if (arr[midd] < number) {
					low = midd + 1;
				} else {
					high = midd - 1;
				}

			}
		}

		return -1;
	}


public static int bin2(int[] arr, int number,int low,int high) {
	if(low>high) {return -1;}
	int midd=(low+high)/2;
	if(arr[midd]==number) {return midd;}
	else 
	
	
	
	return -1;
}
}

