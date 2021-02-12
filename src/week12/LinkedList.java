package week12;
public class LinkedList {
	private Node head, tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public void AddLast(int data) {
		Node tmp = new Node(data, null);
		if (size >= 1) {
			tail.setNext(tmp);
			tail = tmp;
		} else {
			head = tail = tmp;
		}
		size++;
		
	}

	public void AddFirst(int data) {
		Node curr = new Node(data, head);
		head = curr;
		size++;
		if (size == 1) {
			tail = head;
		}
	}

	public Node getHead() {
		return head;
	}

	public int size() {
		return size;
	}

	public void Add(int... params) {
		for (int p : params) {
			this.Add(p);
		}
	}

	// suppose that we start counting from 0.
	public Node get(int i) {
		// 1->-5->0->6->7, i=3
		if (size >= i + 1) {
			Node ptr = head;
			int c = 0;
			while (c != i) {
				ptr = ptr.getNext();
				c++;
			}
			return ptr;
		} else
			return null;
	}

	public Node removeFirst() {
		System.out.println("Removing first elemtn...");
		Node tmp = null;
		if (size > 0) {
			tmp = head;
			head = head.getNext();
			tmp.setNext(null);// remove the link to the list
			size--;
		}
		return tmp;
	}

	public Node removeLast() {
		System.out.println("Removing last elemtn...");
		Node tmp = null;
		if (size > 1) {
			Node prev = head;
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

	public Node remove(int data) {
		System.out.println("Removing" + data + "...");
		if (head.getData() == data) {
			return removeFirst();
		} else if (tail.getData() == data) {
			return removeLast();
		}
		Node prev = head;
		while ((prev != null) && (prev.getNext() != null) && (prev.getNext().getData() != data)) {
			prev = prev.getNext();
		}
		if ((prev != null) && (prev.getNext() != null)) {
			Node tmp = prev.getNext();
			prev.setNext(tmp.getNext());
			tmp.setNext(null);
			size--;
			return tmp;
		}
		return null;
	}

	public void removeAllOuccurences(int data) {
		Node tmp = remove(data);
		while (tmp != null) {
			tmp = remove(data);
		}

	}

	public String toString() {
		Node pointer = head;
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

}
