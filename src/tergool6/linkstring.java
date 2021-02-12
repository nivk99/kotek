package tergool6;

import java.util.Iterator;

public class linkstring {

	private Link head;
	private int size;

	public linkstring() {
		this.head = null;
		size = 0;
	}

	public void addAt(int a, String str) {
		if (this.head == null || size == 0 || a == 0) {
			Link tamp = new Link(str);
			this.head = tamp;
			size = size + 1;
		} else {
			Link tamp1 = help(a);
			Link tamp2 = help(a - 1);
			Link tamp3 = new Link(str);
			tamp2.setNext(tamp3);
			tamp3.setNext(tamp1);
			size = size + 1;

		}

	}

	public void add(String str) {
		if (this.head == null || size == 0) {
			Link tamp = new Link(str);
			this.head = tamp;
			size = size + 1;
		} else {
			Link tamp1 = help(size - 1);
			tamp1.setNext(new Link(str));
			size = size + 1;
		}
	}

	public void clen(int a) {
		if (a == 0) {
			this.head = this.head.getNext();
			size = size - 1;
		} else {
			Link tamp1 = help(a - 1);
			tamp1.setNext(tamp1.getNext().getNext());
			size = size - 1;
		}

	}

	public void rvers() {
		Link tamp = rvershelp(null, this.head, this.head.getNext());
		this.head = tamp;
	}

	private Link rvershelp(Link tail, Link head2, Link next) {
		if (head2 == null)
			return tail;
		head2.setNext(tail);
		if (next != null) {
			return rvershelp(head2, next, next.getNext());
		} else {
			return rvershelp(head2, next, null);
		}

	}

	public String get(int a) {
		Link tamp = help(a);
		return tamp.getData();

	}

	public boolean swop(int i, int j) {
		if (i < 0 || j < 0 || size <= i || size <= j || this.head == null) {
			return false;
		}
		Link taili = null, headi = this.head;
		for (int k = 0; k < i; k++) {
			taili = headi;
			headi = headi.getNext();
		}
		Link tailj = null, headj = this.head;
		for (int k = 0; k < j; k++) {
			tailj = headj;
			headj = headj.getNext();
		}

		if (taili != null) {
			taili.setNext(headj);
		} else {
			this.head = headj;
		}
		tailj.setNext(headi);
		Link tamp = headi.getNext();
		headi.setNext(headj.getNext());
		headj.setNext(tamp);
		return true;

	}

	public Link help(int a) {
		if (a == 0 || size == 0 || head == null) {
			return head;
		}
		Link tamp = head;
		for (int i = 0; i < a; i++) {

			tamp = tamp.getNext();
		}

		return tamp;

	}
	
	
	
	public boolean str(String str) {
		for (int i = 0; i < this.size; i++) {
			if(this.get(i).equals(str))
				return true;
			
		}
		
		return false;
	}
	

	public String toString() {
		String str="";
		if(this.size==0) {
			return str;
		}
	
		for (int i = 0; i < this.size; i++) {
			str+=" "+this.get(i);
		}
				
		return str;
	}

	
	
	
	

}
