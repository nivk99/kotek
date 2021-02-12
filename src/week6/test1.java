package week6;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		int[] a= {5,7,3,9};
		a=arr(a);
		System.out.println(Arrays.toString(a));
		

	}
	public static  int[] arr (int[] a) {
		int[] ans=Arrays.copyOf(a, a.length);
		int sum =0;
		for(int i=0;i<ans.length;i++){
			sum=i;
			for(int j=i+1;j<a.length;j++) {
				if(ans[sum]<=ans[j]) {
					sum=j;
				}
			}
			ans[i]=a[sum];
			ans[sum]=a[i];
			
		}
			
		return ans;
	}
	public static void swap(int[] arr, int i, int j)  {
	     int temp = arr[i];
	     arr[i] = arr[j];
	     arr[j] = temp;
	}


}

