package tergool4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyLinkedList_TEST {

	public static void main(String[] args) {
		//MyLinkedList a= new MyLinkedList();
		 ArrayList<String>a=new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("5");
		a.add("4");
		a.remove(0);
		int[] ar= {6,7,3,9,2};
		String ans ="SRSR";
		Random aa=new Random() ;
		System.out.print(ans.replace("R", ""));
		int i=0;
	    Math.sqrt(20);
		

	}
	
	  private static int findMaxNum1(String s) {
	        String a[] = s.split("[^0-9]+");    //using regex
	        int max = -1;
	        for(int i=1; i<a.length; i++){
	            int t = Integer.valueOf(a[i]);
	            if(t > max)
	                max = t;
	        }
	        return max;
	    }
	
	
	
	
	
	public static String singel(String s) {
	        int a[] = new int['z'];
	        for (int i = 0; i < s.length(); i++){
	            a[s.charAt(i)]++;
	        }
	        String temp = "";
	        for (int i = 0; i < s.length(); i++){
	            if(a[s.charAt(i)] == 1)
	                temp += s.charAt(i);
	        }
	        return temp;
	    
	}
	
	
	
	
	
	
	public static char most(String s) {
		String ans =s;
		ans=ans.toLowerCase();
		int num=0;
		char ch='k',chans='j';
		int max=-1;
		while(!ans.isEmpty()) {
				num=0;
				ch=ans.charAt(0);
				ans=ans.substring(1);
				if(ch>='a'&&ch<='z') {
				num++;
				if(ans.indexOf(ch)>=0) {
					while(ans.indexOf(ch)>=0) {
						ans=ans.substring(0,ans.indexOf(ch))+ans.substring(ans.indexOf(ch)+1);
						num++;
				}
			}
				
			if(max<num)	{
				max=num;
				chans=ch;
			}
				}
		
			
		}	
		
		return chans;
		
	}
	
	
	
	
	
	
	
	public static  void arr(int[] a) {
	String ans=""+a[0];
	for(int i=1;i<a.length;i++) {
		ans=ans+a[i];
	}
	ans=helparr(ans);
	System.out.println(ans);
		
		
	}
	private static String helparr(String ans) {
		if(ans.isEmpty()) {
			return"[]";
		}
		
		return"["+ans+"],"+helparr(ans.substring(1));
	}
	
	
	
	

}
