package bohan;

import java.util.Arrays;

public class talmid {

	public static void main(String[] args) {
		int a = 12;
		// System.out.print(mti1(a));
		String b = "gh454fh696578jhghg656gj";
		String a1="aaabbffdddffgggaaabbffdddffgggg";
		String a2="aaabbffdddffggg";
		int[] arr= {1,2,3,4,5,6,7};
		//System.out.println(s(a1,a2));
		System.out.println(decimal2Binary(6));
		int[][] arr1= {{1,2,3,4},{5,1,2,3},{6,5,1,2},{7,6,5,1}};
		System.out.println(sameNumbers(arr1));
		
	}
	public static boolean sameNumbers(int[][]mat){
		
		for( int i=0;i<mat[0].length-1;i++) {
			
			for(int j=1;j<mat[0].length-i;j++) {
				if(Arrays.binarySearch(mat[j], mat[0][i])!=j) {
					System.out.println(Arrays.binarySearch(mat[j], mat[0][i])+""+j);
					return false;
				}
			
			}
			
		}
		
		
		
		
		return true;
	}
	
	

	public static boolean same2(int[][]mat,int nam,int a ){
		
		for(int i=a,j=0;i<=mat.length;i++,j++) {
			if(mat[i][j]!=nam) {
				return false;
			}
		}
		
       	return true;
	}

	
	
	
	public static boolean same1(int[][]mat,int nam,int a ){
		
		for(int i=1;i<=mat.length-a;i++) {
			if(mat[i][i*a]!=nam) {
				return false;
			}
		}
		
       	return true;
	}

	
	
	
	public static String decimal2Binary(int a){
		if(a==0) {
			return"";
		}
		
		return decimal2Binary(a/2)+a%2;
	}
	

	public static boolean mti(int n) {

		for (int i = 2; i < n; i++) {
			if (i % 2 == 0 && (i != 2)) {
				i++;
			}

			if (n % i == 0) {
				for (int j = i + 1; j < n; j++) {
					if (j % 2 == 0 && (j != 2)) {
						j++;
					}
					if (j * i == n) {
						return true;
					}
				}

			}
			if (i * i == n) {
				return true;
			}

		}
		return false;
	}

	public static boolean mti1(int n) {

		for (int i = 2; i < n; i++) {
			if (i % 2 == 0 && (i != 2)) {
				i++;
			}

			if (mti11(n, i)) {
				return true;
			}
		}

		return false;
	}

	public static boolean mti11(int n, int i) {

		for (int j = 2; j < n; j++) {
			if (j % 2 == 0 && (j != 2)) {
				j++;
			}
			if (i * j == n) {
				return true;
			}
		}

		return false;
	}

	public static int m(String str) {
		String stt = "0";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && (str.charAt(i) <= '9')) {
				String m = "";
				for (; i < str.length(); i++) {
					if (str.charAt(i) >= '0' && (str.charAt(i) <= '9')) {
						m = m + str.charAt(i);
					} else {
						stt = stt+"," + m;
						break;
					}

				}
			}
		

		}
		String[] mm=stt.split(",");
		int ans=0;
		for(int i=0;i<mm.length;i++) {
			if(ans<Integer.parseInt(mm[i])) {
				ans=Integer.parseInt(mm[i]);
			}
		}
	
		return ans;
	}
	public static int mm(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' && (str.charAt(i) > '9')) {
		
			}
		
	}
		return 5;	
}
	public static String n ( int num){
		if(num==1) {
			return "*";
		}
		
		return "*"+""+n(num-1)+"\n";
	}
	
	public static String  str( String str){
		if(str.isEmpty()) {
			return "";
		}
		
		return ""+str.charAt(0)+" "+str(str.substring(1));
	}
	
	public static boolean  str5( String str,char m){
		if(str.isEmpty()) {
			return false;
		}
		
		return str.charAt(0)==m||str5(str.substring(1),m);
	}
	
	public static String  rts( String str){
		if(str.isEmpty()) {
			return "";
		}
		
		return ""+str.charAt(str.length()-1)+rts(str.substring(0,str.length()-1));
	}
	
	public static int  arr( int[] a,int b){
		if(b==0) {
			return a[0] ;
		}
		return a[b]+arr(a,b-1); 
		
		
	}
	public static boolean  s ( String a,String b){
		if(a.isEmpty()&&b.isEmpty()) {
			return true ;
		}
		if(b.indexOf(a.charAt(0))>=0) {
			b=b.replaceAll(""+a.charAt(0), "");
			a=a.replaceAll(""+a.charAt(0), "");
			return s(a,b); 
		}
		return false   ; 
		
	}
	
	
	
	
	
}