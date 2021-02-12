package tergool3;

import java.util.Arrays;

public class Main_s {

	public static String moveMost(String str) {
		char mostFreq = getMostFreq(str);
		String prefix = "", suffix = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == mostFreq) {
				suffix += str.charAt(i);
			} else {
				prefix += str.charAt(i);
			}
		}
		return (prefix + suffix);
	}

	public static char getMostFreq(String str) {
		int max = 0, maxIndx = -1;
		for (int i = 0; i < str.length(); i++) {
			if (maxIndx != -1 && str.charAt(i) == str.charAt(maxIndx))
				continue;
			int c = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i))
					c++;
			}
			if (c > max) {// if we want to move the last char that has most freq, we add =
				max = c;
				maxIndx = i;
			}
		}
		return str.charAt(maxIndx);
	}

	public static void IterReverse(LinkedList_s lst) {
		if (lst.getHead() != null) {
			Node_s prev, curr, next, newTail;
			prev = null;
			newTail = curr = lst.getHead();
			while (curr != null) {
				next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
			}
			lst.setHead(prev);
			lst.setTail(newTail);
		}
	}

	public static void rec(LinkedList_s lst) {
		if(lst.getHead()==null) {
			return;
		}
		Node_s headne= rec1(null,lst.getHead(),lst.getHead().getNext());
		lst.setHead(headne);
	}
	
	
	
	
	private static Node_s rec1(Node_s tail, Node_s head, Node_s next) {
		if(head==null) {
			return tail;
		}
		head.setNext(tail);
		if(next!=null) {
			return rec1(head,next,next.getNext());
		}
		else {
			return rec1(head,next,null);
		}
		
		
	}

	public static void recReverse(LinkedList_s lst) {
		if (lst.getHead() != null) {
			Node_s newTail = lst.getHead();
			Node_s newHead = recReverse(null, lst.getHead(), lst.getHead().getNext());
			lst.setHead(newHead);
			lst.setTail(newTail);
		}
	}
	
	
	

	public static Node_s recReverse(Node_s prev, Node_s curr, Node_s next) {
		if (curr == null)
			return prev;
		curr.setNext(prev);
		if (next != null)
			return recReverse(curr, next, next.getNext());
		else
			return recReverse(curr, next, null);
	}

	public static void printAllSubsets(int[] arr) {
		boolean[] currSet = new boolean[arr.length];
		printAllSubsets(arr, currSet, 0);
	}

	public static void printAllSubsets(int[] arr, boolean[] currSet, int i) {
		if (i == arr.length) {
			printTrues(arr, currSet);
		} else {
			currSet[i] = true;
			printAllSubsets(arr, currSet, i + 1);
			currSet[i] = false;
			printAllSubsets(arr, currSet, i + 1);
		}
	}

	public static void printTrues(int[] arr, boolean[] currSet) {
		System.out.print("[");
		for (int i = 0; i < currSet.length; i++) {
			if (currSet[i] == true) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

	public static String single(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					c++;
			}
			if (c == 1)
				res += s.charAt(i);
		}
		return res;
	}

	public static String longestCommonSequence(String s, String t) {
		String currMax = "";
		String tmp;
		if (s.length() > t.length()) {
			tmp = s;
			s = t;
			t = tmp;
		}
		for (int i = 0; i < s.length(); i++) {
			String curr = "";
			for (int j = i + 1; j < s.length(); j++) {
				curr = s.substring(i, j);
				if (t.contains(curr) && curr.length() > currMax.length())
					currMax = curr;
			}
		}
		return currMax;
	}

	public static int findMaxNum(String str) {
		int res = -1;
		for (int i = 0; i < str.length(); i++) {
			int j = i;
			int currNum = 0;
			while (j < str.length() && isNumeric(str.charAt(j))) {
				currNum *= 10;
				currNum += str.charAt(j) - '0';
				j++;
			}
			if (j != i) {
				if (currNum > res)
					res = currNum;
			}
		}
		return res;
	}

	public static boolean isNumeric(char ch) {
		return ((ch - '0') >= 0) && ((ch - '0') <= 9);
	}
	public static boolean diagonal(int[][] a) {
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				if(((i+1)<a.length)&&(j+1)<a[i].length) {
					if(a[i][j]!=a[i+1][j+1])
						return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(moveMost("hello i am happy hi hi hi"));
		LinkedList_s lst = new LinkedList_s();
		lst.Add(85, 15, 4, 20, -2, 1, 4, 3, 5, 5);
//		lst.Add(85);
//		System.out.println(lst);
//		IterReverse(lst);
//		System.out.println(lst);
//		recReverse(lst);
//		System.out.println(lst);
//		int[] arr = new int[lst.size()];
//		Node p = lst.getHead();
//		int i = 0;
//		while (p != null) {
//			arr[i++] = p.getData();
//			p = p.getNext();
//		}
//		Arrays.sort(arr);
//		p = lst.getHead();
//		i = 0;
//		while (p != null) {
//			p.setData(arr[i++]);
//			p = p.getNext();
//		}
		int[] arr = { 1, 2, -9 };
		printAllSubsets(arr);
		System.out.println(("ST5,L;FD,".charAt(2) - '0') >= 0 && ("ST5,L;FD,".charAt(2) - '0') <= 9);
	}

}
