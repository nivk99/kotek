package week8;

public class string2 {

	public static void main(String[] args) {
		String a="ABcd";
		System.out.println(v1(a));
	

	}
	public static String v2(String arr) {
		
		String ans="";
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)>='A' && arr.charAt(i)<='Z') {
				String ans1="";
				ans1=ans1+(char)(arr.charAt(i));
				ans1=ans1.toLowerCase();
				ans=ans+ans1;
			}
			else {
				String ans1="";
				ans1 =ans1+arr.charAt(i);
				ans1 = ans1.toUpperCase();
				ans=ans+ans1;
			}
		}
		
		return ans;
		
	}
	public static String v1(String arr) {
		String at1="";
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)>='A' && arr.charAt(i)<='Z') {
				at1=at1+(char)(arr.charAt(i)-'A'+'a');
			}
		}
		return arr;
	}
}
