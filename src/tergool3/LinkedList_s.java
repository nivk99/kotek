package tergool3;

import java.beans.Expression;
import java.lang.reflect.UndeclaredThrowableException;

import javax.management.RuntimeErrorException;



public class LinkedList_s {
	private Node_s head, tail;
	private int size;

	public LinkedList_s() {
		head = null;
		tail = null;
		size = 0;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public void AddLast(int data) {
		Node_s tmp = new Node_s(data, null);
		if (size >= 1) {
			tail.setNext(tmp);
			tail = tmp;
		} else {
			head = tail = tmp;
		}
		size++;
	}

	public void setHead(Node_s p) {
		this.head = p;
	}

	public void setTail(Node_s p) {
		this.tail = p;
	}

	public void AddFirst(int data) {
		Node_s curr = new Node_s(data, head);
		head = curr;
		size++;
		if (size == 1) {
			tail = head;
		}
	}

	public Node_s getHead() {
		return head;
	}

	public int size() {
		return size;
	}

	public void Add(int... params) {
		for (int p : params) {
			this.AddLast(p);
		}
	}

	// suppose that we start counting from 0.
	public Node_s get(int i) {
		// 1->-5->0->6->7, i=3
		if (size >= i + 1) {
			Node_s ptr = head;
			int c = 0;
			while (c != i) {
				ptr = ptr.getNext();
				c++;
			}
			return ptr;
		} else
			return null;
	}

	public Node_s removeFirst() {
		System.out.println("Removing first elemtn...");
		Node_s tmp = null;
		if (size > 0) {
			tmp = head;
			head = head.getNext();
			tmp.setNext(null);// remove the link to the list
			size--;
		}
		return tmp;
	}

	public Node_s removeLast() {
		System.out.println("Removing last elemtn...");
		Node_s tmp = null;
		if (size > 1) {
			Node_s prev = head;
			while (prev.getNext() != tail) {
				prev = prev.getNext();
			}
			prev.setNext(null);
			tmp = tail;
			tail = prev;
			size--;
		} else if (size == 1) {
			tmp = head;
			head = tail = null;
			size--;
		}
		return tmp;
	}

	public Node_s remove(int data) {
		System.out.println("Removing" + data + "...");
		if (head.getData() == data) {
			return removeFirst();
		} else if (tail.getData() == data) {
			return removeLast();
		}
		Node_s prev = head;
		while ((prev != null) && (prev.getNext() != null) && (prev.getNext().getData() != data)) {
			prev = prev.getNext();
		}
		if ((prev != null) && (prev.getNext() != null)) {
			Node_s tmp = prev.getNext();
			prev.setNext(tmp.getNext());
			tmp.setNext(null);
			size--;
			return tmp;
		}
		return null;
	}

	public void removeAllOuccurences(int data) {
		Node_s tmp = remove(data);
		while (tmp != null) {
			tmp = remove(data);
		}

	}

	public String toString() {
		Node_s pointer = head;
		String st = "";
		if (size != 0) {
			while (pointer.getNext() != null) {
				st += pointer + " -> ";
				pointer = pointer.getNext();
			}
			st += pointer;
		}
		return st;
	}

	public boolean swap23(int i, int j) {
		if (this.head == null || i < 0 || j < 0 || i >= this.size || j >= this.size || this.size == 0) {
			return false;
		}
		if (i > j) {
			int a = j;
			j = i;
			i = a;
		}

		Node_s taili = null, headi = this.head;
		for (int k = 0; k < i; k++) {
			taili = headi;
			headi = headi.getNext();
		}
		Node_s tailj = null, headj = this.head;
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
		Node_s tamp = headi.getNext();
		headi.setNext(headj.getNext());
		headj.setNext(tamp);
		return true;

	}

	public boolean swap22(int i, int j) {
		if (i < 0 || j < 0 || this.size() == 0 || this.head == null || i >= this.size || j >= this.size) {
			return false;
		}
		if (i > j) {
			int a = j;
			j = i;
			i = a;
		}
		Node_s taili = null, headi = this.head;
		for (int ii = 0; ii < i; ii++) {
			taili = headi;
			headi = headi.getNext();
		}
		Node_s tailj = null, headj = this.head;
		for (int jj = 0; jj < j; jj++) {
			tailj = headj;
			headj = headj.getNext();
		}
		if (taili != null) {
			taili.setNext(headj);
		} else {
			this.head = headj;
		}
		tailj.setNext(headi);
		Node_s tamp = headi.getNext();
		headi.setNext(headj.getNext());
		headj.setNext(tamp);

		return true;

	}

	public boolean swap(int i, int j) {
		if (i < 0 || i >= size || j < 0 || j >= size || i == j)
			return false;

		if (i > j) {
			int tmp = i;
			i = j;
			j = tmp;
		}
		// get the i'th node, and the node before
		Node_s prevI = null, currI = this.head;
		int c = 0;
		while (c != i) {
			prevI = currI;
			currI = currI.getNext();
			c++;
		}
		// get the j'th node, and the node before
		Node_s prevJ = null, currJ = this.head;
		c = 0;
		while (c != j) {
			prevJ = currJ;
			currJ = currJ.getNext();
			c++;
		}

		if (prevI != null) {
			prevI.setNext(currJ);
		} else
			head = currJ;
		prevJ.setNext(currI);
		// swap between the next ptrs
		Node_s tmp = currI.getNext();
		currI.setNext(currJ.getNext());
		currJ.setNext(tmp);
		if (j == size - 1)
			tail = currI;
		return true;
	}

	public Node_s re(int a) {
		if(a<0||this.size<=a||this.head==null) {
			throw new RuntimeException("!!");
			}
		Node_s h = this.head;
		for(int i=0;i<a;i++) {
			h=h.getNext();
		}
		return h;
	}

//1,2,3,5
	public void removeDup() {
		Node_s curr, p;
		curr = head;
		while (curr != null) {
			p = curr.getNext();
			Node_s prev = curr;
			while (p != null) {
				if (p.getData() == curr.getData()) {
					prev.setNext(p.getNext());
					size--;
				}
				prev = prev.getNext();
				p = p.getNext();
			}
			curr = curr.getNext();
		}
	}

}
