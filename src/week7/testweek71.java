package week7;

import java.util.Arrays;

public class testweek71 {//find non stupid index;
	public static int arr1(int[] a) {
		int ans=-1;
		for(int x:a) {
			ans++;
			if(x!=ans) {
				return ans;
			}
			
		}
		
		return ans;
		
	}
	
	public static int[] arr (int[] ans) {
		
		int j=0;
		for(int x:ans) {
			j++;
			int ind=j-1;
		
			for(int i=j;i<ans.length;i++) {
				if(x>ans[i]) {
					x=ans[i];
					ind=i;
					
				}
				
			}
			swap(ans,j-1,ind);
			
			
		}
		
		
		
		return ans;
	}

	
	
	
	
	public static void swap(int[] arr,int i,int index ) {
		int sam=arr[i];
		arr[i]=arr[index];
		arr[index]=sam;
	}

	public static void main(String[] args) {
		int [] a= {0,1,2,3,4,7,8,9};
		int [] b= {6,8,2,1,3,9,0,4,2};
	    b=arr(b);
	
		System.out.println(Arrays.toString(b));
		
		

	}

}
