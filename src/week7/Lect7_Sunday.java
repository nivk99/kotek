package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class Lect7_Sunday {

//	public static boolean startsWith(String st1,String st2) {
//		//retruns true if st1 strats with st2 false otherwise
//	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean Swapped = true;
		for (int i = n - 1; (i > 0) && (Swapped == true); i--) {
			Swapped = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					Swapped = true;
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	public static int getMinIndex(int[] arr, int i) {
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		return minIndex;
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = getMinIndex(arr, i);
			swap(arr, i, minIndex);
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}

	// suppose that both A, and B are already sorted
	public static int[] merge(int[] A, int[] B) {
		int[] res = new int[A.length + B.length];
		int i, j, k;
		i = j = k = 0;
		while ((i < A.length) && (j < B.length)) {
			if (A[i] < B[j]) {
				res[k++] = A[i++];
			} else {
				res[k++] = B[j++];
			}
		}
		while ((i < A.length)) {
			res[k++] = A[i++];
		}
		while ((j < B.length)) {
			res[k++] = B[j++];
		}
		return res;
	}

	public static String rel(String str) {
		String ans = "";
		int[] a = new int['z'];
		for (int i = 0; i < str.length(); i++) {
			a[str.charAt(i)]++;
		}
		for (int j = 0; j < str.length(); j++) {

			if (a[str.charAt(j)] != 0) {
				ans = ans + str.charAt(j);
				a[str.charAt(j)] = 0;

			}
		}

		return ans;
	}

	public static String[] stringArr2Set(String[] a) {
		int[] arr = new int['z'];
		int count = 0;
		String ans = "";
		for (int i = 0; i < a.length; i++) {
			arr[a[i].charAt(0)]++;
		}

		for (int j = 0; j < a.length; j++) {
			if (arr[a[j].charAt(0)] != 0) {
				ans = ans + "," + a[j];
				arr[a[j].charAt(0)] = 0;
			}
		}
		ans = ans.substring(1);
		return ans.split(",");

	}

	public static int intersectionSetSize(int[][] a, int[][] b) {
		int[] num = new int[maxnum(a, b) + 1];
		int ans = 0;

		for (int i1 = 0; i1 < a.length; i1++) {
			for (int j1 = 0; j1 < a[i1].length; j1++)
				num[a[i1][j1]]++;
		}
		for (int i2 = 0; i2 < b.length; i2++) {
			for (int j2 = 0; j2 < b[i2].length; j2++)
				num[b[i2][j2]]++;
		}
		for (int k = 0; k < num.length; k++) {
			if (num[k] > 1)
				ans++;
		}
		return ans;

	}

	private static int maxnum(int[][] a, int[][] b) {
		int max = -1;

		for (int i1 = 0; i1 < a.length; i1++) {
			for (int j1 = 0; j1 < a[i1].length; j1++)
				if (max < a[i1][j1]) {
					max = a[i1][j1];
				}
		}
		for (int i2 = 0; i2 < b.length; i2++) {
			for (int j2 = 0; j2 < b[i2].length; j2++)
				if (max < b[i2][j2]) {
					max = b[i2][j2];
				}
		}

		return max;
	}

	public static int intersectionSetSize1(int[][] a, int[][] b) {
		int leng=0;
		for(int i1=0;i1<a.length;i1++) {
			for(int j1=0;j1<a[i1].length;j1++) {
				leng++;
			}
					
		}
		
		
		
		int[] help=new int[leng];
		int jj=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				boolean ans =false;
				for(int k=0;k<help.length;k++) {
					if(help[k]==a[i][j]) {
						ans=true;
						break;
					}
					
				}
				if(ans==false) {
					help[jj]=a[i][j];
					jj++;
				}
			}
		}
			
			
			int ans=0;
			for(int h=0;h<help.length;h++) {
				if(m(help[h],b)&&help[h]!=0) {
					ans++;
				}				
				}
			if(m(0,a)&&m(0,b)) {
				ans++;
			}
		
		
		return ans;
		
		
		
	}

	private static boolean m(int a, int[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (a == b[i][j]) {
					return true;
				}

			}

		}

		return false;

	}
	private static int nn(int a[][],int b[][]) {
		ArrayList<Integer>aa=new ArrayList<Integer>();
		ArrayList<Integer>bb=new ArrayList<Integer>();
		for (int i1 = 0; i1 < a.length; i1++) {
			for (int j1 = 0; j1 < a[i1].length; j1++)
					aa.add(a[i1][j1]);
		}
		
		for (int i1 = 0; i1 < b.length; i1++) {
			for (int j1 = 0; j1 < b[i1].length; j1++)
					bb.add(b[i1][j1]);
		}
		aa.retainAll(bb);
		int num=0;
		for(int i=0;i<aa.size();i++) {
			num++;
			int ans=aa.remove(0);
			if(aa.indexOf(ans)>=0) {
				while(aa.indexOf(ans)>=0) {
					aa.remove(aa.indexOf(ans));
				}
					
			}
			
		}
		
		
		
	
		
		return num;
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// length - >size
		// charAt(i) -> character at index i
		// substring(i,j), substring(i)
//		String st1 = "hello world!";
//		System.out.println(st1.contains(st2));
//		System.out.println(st1.charAt(3));
//		boolean flag = st1.startsWith("helol");
//		System.out.println(flag);
//		System.out.println(st1.endsWith("world!"));
//		System.out.println(st1.indexOf('l', 3));
//		System.out.println(st1.concat(" ".concat(st2)));// st1+st2
//		System.out.println(st1.compareTo("hello world, I am here"));
//		System.out.println(st2.compareTo("hellr"));
//		String st3 = "hello,world,I,am happy to learn java!";
//		String[] words = st3.split("a");
//		System.out.println(Arrays.toString(words));
////		System.out.println(words[4]);
		
		
		
		String[] aaa = { "b", "ccc", "b", "aa" };
		int[][] a1 = {{4,2,4,2,4,2}, {3,2,2,3,2,4,4}, {4,2}, {3,3,3,3}}; // {2,3,4}
		int[][] b1 = {{0,2,3}, {3,3,3,3,2,3,2,2,3,5,6,7,6,7}, {0}, {3,3,3,3},{0,0},{5,5,0,5}};
		
		ArrayList<Integer>aa=new ArrayList<Integer>();
		aa.add(3);
		aa.add(6);
		aa.add(3);
		ArrayList<Integer>bb=new ArrayList<Integer>();
		bb.add(3);
		bb.add(0);
		aa.removeAll(bb);
		String ans ="hellofgdgf";
		

//		System.out.println(st3);
//		st3 = st3.replaceAll("hello", "welcome");
//		System.out.println(st3);
//		System.out.println(st2.equals("hello"));
//		System.out.println(st2 + " world");
//		System.out.println(" wrold" + st2);

		int[] a = { 8, 6, 7, 8 };
		int[] b = { 3, 4, 5, 6 };
		int[] c = merge(a, b);
		System.out.println(Arrays.toString(c));
		int[] arr = { 3, 2, 1, 0, -3, 4, 100, 55, 1 };
//		System.out.println(Arrays.toString(arr));
//		bubbleSort(arr);
//		selectionSort(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = { 2, 3, 6, 88, 2, 45, -1, 0 };
		bubbleSort(arr2);
		int[] res = merge(arr, arr2);
		System.out.println(Arrays.toString(arr2));

		System.out.println(Arrays.toString(res));
	}

}