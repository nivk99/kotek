package bohan;

import java.util.Arrays;

public class mahrh {

	public static void main(String[] args) {
		String b = "hello";
		//System.out.println(findMaxNum(b));
		lin a = new lin();
		a.add1(5);
		a.add1(7);
		a.add1(8);
		a.add1(9);
		a.add1(10);
		//System.out.println(a);
		a.ret();
		System.out.println((int)(Math.random()*5));
		
		
		
	//	a.sit(7);
		//System.out.println(a.size(5));
		//System.out.println(a.cycle());
		//String[] m= {"b", "cc","b","b"};
		
		
	}

	public static int findMaxNum(String str) {
		int ans = -1;
		boolean num = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num = true;
				String stri = "";
				for (int j = i; j < str.length() && num; j++) {
					char ch1 = str.charAt(j);
					if (ch1 >= '0' && ch1 <= '9') {
						stri = stri + ch1;
					} else {
						num = false;
					}
				}
				int k = Integer.parseInt(stri);
				if (ans < k) {
					ans = k;
				}
			}

		}

		return ans;

	}

	public static Node2 cycle(Node2 p) {
		Node2 first = p.getNext();
		Node2 last = p;
		Node2 ne = new Node2(0);
		while (first != null) {
			Node2 n = last;
			last = last.getNext();
			n.setNext(ne);
			if (first.getNext().equals(ne)) {
				return first;
			}
			first = first.getNext();

		}

		return null;

	}
	
	
	
	public static String[] stringArr2Set(String[] a) {
		String[] b= new String[a.length];  
		b[0]=a[0];
		boolean ans;
		for(int i=1;i<a.length;i++) {
			ans=true;
			for(int j=0;j<b.length&&ans;j++) {
				if(a[i].equals(b[j])) {
					ans=false;
				}
				if(ans) {
				b[i]=a[i];	
				}
			}
			
		}
		int s=0;
		for(int j=0;j<b.length;j++) {
			if(b[j]!=null) {
				s=s+1;
			}
		}
		String[] m= new String[s]; 
		for(int j=0,i=0;j<b.length;j++,i++) {
			if(b[j]!=null) {
				m[i]=b[j];
			}
			else {
				i=i-1;
			}
		}
		
		
		return m;
		
	}

}
